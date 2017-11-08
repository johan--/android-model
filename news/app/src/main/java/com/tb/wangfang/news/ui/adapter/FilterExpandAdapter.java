package com.tb.wangfang.news.ui.adapter;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.Level0;
import com.tb.wangfang.news.model.bean.Level1;
import com.tb.wangfang.news.model.bean.Level2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangbin on 2017/5/27.
 */

public class FilterExpandAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static final int TYPE_LEVEL_0 = 0;
    public static final int TYPE_LEVEL_1 = 1;
    public static final int TYPE_LEVEL_2 = 2;
    public static final int TYPE_LEVEL_3 = 3;

    String TAG = "FilterExpandAdapter";


    List<MultiItemEntity> level0s = new ArrayList<>();
    EditText etStartTime;
    EditText etStartEnd;
    TextView tvPeriodOne;
    TextView tvLastPeriodOne;
    RelativeLayout rlLastOneYear;
    TextView tvPeriodThree;
    TextView tvLastPeriodThree;
    RelativeLayout rlLastThreeYear;
    TextView tvPeriodFive;
    TextView tvLastPeriodFive;
    RelativeLayout rlLastFiveYear;
    TextView tvPeriodAll;
    TextView tvLastPeriodAll;
    RelativeLayout rlLastAllYear;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public FilterExpandAdapter(List<MultiItemEntity> data) {
        super(data);

        addItemType(TYPE_LEVEL_0, R.layout.item_filter_level0);
        addItemType(TYPE_LEVEL_1, R.layout.item_filter_level1);
        addItemType(TYPE_LEVEL_2, R.layout.item_filter_level0);
        addItemType(TYPE_LEVEL_3, R.layout.item_year_condition);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case TYPE_LEVEL_0:
                final Level0 level0 = (Level0) item;
                helper.setText(R.id.tv_title, level0.getShowName())
                        .setImageResource(R.id.iv_arraw, level0.isExpanded() ? R.mipmap.pull_down_icon : R.mipmap.step_arrow_icon);
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = helper.getAdapterPosition();
                        Log.d(TAG, "Level 0 item pos: " + pos);
                        if (level0.isExpanded()) {
                            collapse(pos);
                        } else {
                            expand(pos);
                        }
                    }

                });
                break;

            case TYPE_LEVEL_2:
                final Level2 level2 = (Level2) item;
                helper.setText(R.id.tv_title, level2.getText())
                        .setImageResource(R.id.iv_arraw, level2.isExpanded() ? R.mipmap.pull_down_icon : R.mipmap.step_arrow_icon);
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = helper.getAdapterPosition();
                        Log.d(TAG, "Level 0 item pos: " + pos);
                        if (level2.isExpanded()) {
                            collapse(pos);
                        } else {
                            expand(pos);
                        }
                    }

                });
                break;

            case TYPE_LEVEL_1:
                final Level1 lv1 = (Level1) item;
                helper.setText(R.id.tv_name, lv1.getShowName());
                if (lv1.isSelected()) {
                    helper.setBackgroundRes(R.id.tv_name, R.drawable.search_selected_bg);
                } else {
                    helper.setBackgroundRes(R.id.tv_name, R.drawable.white_corners_solide);
                }
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int currentPosition = helper.getAdapterPosition();
                        int topPosition = -1;
                        int bottomPosition = -1;
                        for (int i = currentPosition; i >= 0; i--) {
                            MultiItemEntity m = getData().get(i);
                            if (m instanceof Level0) {
                                topPosition = i;
                                break;
                            }
                        }
                        for (int i = currentPosition; i < getData().size(); i++) {
                            MultiItemEntity m = getData().get(i);
                            if (m instanceof Level0 || m instanceof Level2) {
                                bottomPosition = i - 1;
                                break;
                            }
                        }
                        if (bottomPosition == -1) {
                            bottomPosition = getData().size() - 1;
                        }
                        for (int i = topPosition + 1; i < bottomPosition + 1; i++) {
                            if (getData().get(i) instanceof Level1) {
                                Level1 level = (Level1) getData().get(i);
                                level.setSelected(false);
                            }

                        }
                        lv1.setSelected(true);
                        Level0 level0Top = (Level0) getData().get(topPosition);
                        level0Top.setSeletedPosition(currentPosition - topPosition - 1);
                        Log.d(TAG, "onClick: clickPosition" + (currentPosition + "-" + topPosition + "-1" + (currentPosition - topPosition - 1)));
                        FilterExpandAdapter.this.notifyDataSetChanged();
                    }
                });
                break;
            case TYPE_LEVEL_3:
                break;
        }

    }
}

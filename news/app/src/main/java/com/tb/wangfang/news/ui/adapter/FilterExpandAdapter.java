package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by tangbin on 2017/5/27.
 */

public class FilterExpandAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> implements View.OnFocusChangeListener {
    public static final int TYPE_LEVEL_0 = 0;
    public static final int TYPE_LEVEL_1 = 1;
    public static final int TYPE_LEVEL_2 = 2;
    public static final int TYPE_LEVEL_3 = 3;

    String TAG = "FilterExpandAdapter";

    public EditText getEtStartTime() {
        return etStartTime;
    }

    public void setEtStartTime(EditText etStartTime) {
        this.etStartTime = etStartTime;
    }

    public EditText getEtStartEnd() {
        return etStartEnd;
    }

    public void setEtStartEnd(EditText etStartEnd) {
        this.etStartEnd = etStartEnd;
    }

    EditText etStartTime;
    EditText etStartEnd;
    Context context;

    private int endyear;
    private int startYear;
    private RelativeLayout rlLastOneYear;
    private RelativeLayout rlLastThreeYear;
    private RelativeLayout rlLastFiveYear;
    private RelativeLayout rlLastAllYear;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public FilterExpandAdapter(Context context, List<MultiItemEntity> data) {
        super(data);

        addItemType(TYPE_LEVEL_0, R.layout.item_filter_level0);
        addItemType(TYPE_LEVEL_1, R.layout.item_filter_level1);
        addItemType(TYPE_LEVEL_2, R.layout.item_filter_level0);
        addItemType(TYPE_LEVEL_3, R.layout.item_year_condition);
        this.context = context;
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
                etStartTime = helper.getView(R.id.et_start_time);
                etStartEnd = helper.getView(R.id.et_start_end);
                etStartEnd.setOnFocusChangeListener(this);
                etStartTime.setOnFocusChangeListener(this);
                rlLastOneYear = helper.getView(R.id.rl_last_one_year);
                rlLastThreeYear = helper.getView(R.id.rl_last_three_year);
                rlLastFiveYear = helper.getView(R.id.rl_last_five_year);
                rlLastAllYear = helper.getView(R.id.rl_last_all_year);


                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                String date = sdf.format(new java.util.Date());
                endyear = Integer.parseInt(date);
                TextView tvPeriodOne = helper.getView(R.id.tv_period_one);
                TextView tvPeriodTwo = helper.getView(R.id.tv_period_three);
                TextView tvPeriodThree = helper.getView(R.id.tv_period_five);
                TextView tvPeriodFour = helper.getView(R.id.tv_period_all);
                rlLastOneYear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startYear = endyear - 1;
                        SelectedTime(startYear + "", endyear + "", rlLastOneYear);
                        etStartTime.clearFocus();
                        etStartEnd.clearFocus();
                    }
                });
                startYear = endyear - 1;
                tvPeriodOne.setText(startYear + "-" + endyear);
                rlLastThreeYear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startYear = endyear - 3;
                        SelectedTime(startYear + "", endyear + "", rlLastThreeYear);
                        etStartTime.clearFocus();
                        etStartEnd.clearFocus();
                    }
                });
                startYear = endyear - 3;
                tvPeriodTwo.setText(startYear + "-" + endyear);
                rlLastFiveYear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startYear = endyear - 5;
                        SelectedTime(startYear + "", endyear + "", rlLastFiveYear);
                        etStartTime.clearFocus();
                        etStartEnd.clearFocus();
                    }
                });
                startYear = endyear - 5;
                tvPeriodThree.setText(startYear + "-" + endyear);
                rlLastAllYear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        SelectedTime("", "", rlLastAllYear);
                        etStartTime.clearFocus();
                        etStartEnd.clearFocus();
                    }
                });
                tvPeriodFour.setText("-" + endyear);
                break;
        }

    }

    private void SelectedTime(String startYear, String endYear, RelativeLayout editText) {
        rlLastOneYear.setBackgroundResource(R.drawable.white_corners_solide);
        rlLastAllYear.setBackgroundResource(R.drawable.white_corners_solide);
        rlLastFiveYear.setBackgroundResource(R.drawable.white_corners_solide);
        rlLastThreeYear.setBackgroundResource(R.drawable.white_corners_solide);
        editText.setBackgroundResource(R.drawable.search_selected_bg);
        etStartEnd.setText(endYear + "");
        etStartTime.setText(startYear + "");
    }

    public String getStartTime() {
        if (etStartTime == null) {
            return null;
        }
        Editable s = etStartTime.getText();
        if (s != null) {
            return s.toString();
        } else {
            return null;
        }

    }

    public String getEndTime() {
        if (etStartEnd == null) {
            return null;
        }
        Editable s = etStartEnd.getText();
        if (s != null) {
            return s.toString();
        } else {
            return null;
        }
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (v.getId() == R.id.et_start_time) {
            if (!etStartEnd.hasFocus() && !etStartTime.hasFocus()) {
                closeSoftKey();
            }
        }
        if (v.getId() == R.id.et_start_end) {
            if (!etStartEnd.hasFocus() && !etStartTime.hasFocus()) {
                closeSoftKey();
            }
        }
    }

    private void closeSoftKey() {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE); //得到InputMethodManager的实例
        if (imm.isActive()) {//如果开启
            imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, InputMethodManager.HIDE_NOT_ALWAYS);//关闭软键盘，开启方法相同，这个方法是切换开启与关闭状态的
        }
    }
}

package com.tb.wangfang.news.ui.adapter;

import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.Level0;
import com.tb.wangfang.news.model.bean.Level1;

import java.util.List;

/**
 * Created by tangbin on 2017/5/27.
 */

public class FilterExpandAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static final int TYPE_LEVEL_0 = 0;
    public static final int TYPE_LEVEL_1 = 1;

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
    }

    @Override
    protected void convert(final BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case TYPE_LEVEL_0:

                final Level0 level0 = (Level0) item;
                helper.setText(R.id.tv_title, level0.getText())
                        .setImageResource(R.id.iv_arraw, level0.isExpanded() ? R.drawable.keyb__bottom : R.drawable.keyb_top);
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
            case TYPE_LEVEL_1:
                final Level1 lv1 = (Level1) item;
                helper.setText(R.id.tv_name, lv1.text);
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = helper.getAdapterPosition();
                        Log.d(TAG, "Level 1 item pos: " + pos);
                    }
                });

                break;
        }

    }
}

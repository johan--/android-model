package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

/**
 * Created by tangbin on 2017/8/16.
 */

public class JournalPeriodAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    Context context;

    public JournalPeriodAdapter(Context context, @Nullable List<String> data) {
        super(R.layout.item_article_period, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        if (helper.getAdapterPosition() == 0) {
            helper.getView(R.id.v_line_top).setVisibility(View.INVISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.VISIBLE);

        } else if (helper.getAdapterPosition() == getData().size() - 1) {
            helper.getView(R.id.v_line_top).setVisibility(View.VISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.INVISIBLE);
        } else {
            helper.getView(R.id.v_line_top).setVisibility(View.VISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.VISIBLE);
        }
    }
}

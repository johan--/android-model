package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

/**
 * Created by tangbin on 2017/9/11.
 */

public class MainPageDetailAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public MainPageDetailAdapter(@Nullable List<String> data) {
        super(R.layout.item_mian_detail, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_title, item);
    }
}

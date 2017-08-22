package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

/**
 * Created by tangbin on 2017/8/17.
 */

public class MyCollectAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public MyCollectAdapter(@Nullable List<String> data) {
        super(R.layout.item_collection, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}

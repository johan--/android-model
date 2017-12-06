package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.home.GetFoundListResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/9/11.
 */

public class MainPageDetailAdapter extends BaseQuickAdapter<GetFoundListResponse.HomeListMessage, BaseViewHolder> {
    public MainPageDetailAdapter(@Nullable List<GetFoundListResponse.HomeListMessage> data) {
        super(R.layout.item_mian_detail, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, GetFoundListResponse.HomeListMessage item) {
        helper.setText(R.id.tv_title, item.getTitle()).setText(R.id.tv_time, item.getCreateTime()).setText(R.id.tv_content, item.getContent());
    }
}

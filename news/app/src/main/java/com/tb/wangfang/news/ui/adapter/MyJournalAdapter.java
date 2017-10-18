package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.subscribe.SubscribePerioListResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/10/18.
 */

public class MyJournalAdapter extends BaseQuickAdapter<SubscribePerioListResponse.SubscribePerioMessage, BaseViewHolder> {
    Context context;

    public MyJournalAdapter(Context context, @Nullable List<SubscribePerioListResponse.SubscribePerioMessage> data) {
        super(R.layout.item_subscribe_journal, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, SubscribePerioListResponse.SubscribePerioMessage item) {
        Glide.with(context).load(item.getPerioCover()).into((ImageView) helper.getView(R.id.iv_conver));
        helper.setText(R.id.tv_journal_name, item.getPerioName()).setText(R.id.tv_hold_unit, item.getPerioSociety()).setText(R.id.tv_time, item.getAddTime());

    }
}

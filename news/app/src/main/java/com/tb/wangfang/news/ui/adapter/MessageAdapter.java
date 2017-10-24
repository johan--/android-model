package com.tb.wangfang.news.ui.adapter;

import android.app.Activity;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

import cn.jpush.im.android.api.content.TextContent;
import cn.jpush.im.android.api.model.Message;

/**
 * Created by tangbin on 2017/10/16.
 */

public class MessageAdapter extends BaseQuickAdapter<Message, BaseViewHolder> {
    Activity context;

    public MessageAdapter(Activity context, @Nullable List<Message> data) {
        super(R.layout.item_message, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Message item) {
        helper.setText(R.id.tv_title, ((TextContent) item.getContent()).getText());
    }
}

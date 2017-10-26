package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.subscribe.SubscribeDocListResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/10/18.
 */

public class KeyWordArticleAdapter extends BaseQuickAdapter<SubscribeDocListResponse.SubscribeDocMessage, BaseViewHolder> {
    public KeyWordArticleAdapter(@Nullable List<SubscribeDocListResponse.SubscribeDocMessage> data) {
        super(R.layout.item_keyword_article, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SubscribeDocListResponse.SubscribeDocMessage item) {
        helper.setText(R.id.tv_title, item.getDocuTitle()).setText(R.id.tv_journal, item.getDocuAuthor() + "- <<" + item.getDocSource() + ">> -" + item.getPublishTime())
                .setText(R.id.tv_key_word, item.getKeyword()).setText(R.id.tv_time, item.getAddTime());
    }
}

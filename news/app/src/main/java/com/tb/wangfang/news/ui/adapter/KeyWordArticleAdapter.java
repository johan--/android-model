package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.utils.DateUtils;
import com.wanfang.subscribe.SubscribeDocListResponse;

import java.util.ArrayList;
import java.util.Date;
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
        Date date = DateUtils.parseDate(item.getAddTime());
        String time = DateUtils.formatDate(date, "yyyy-MM-dd");
        helper.setText(R.id.tv_title, item.getDocuTitle())
                .setText(R.id.tv_key_word, "关键词 : " + item.getKeyword()).setText(R.id.tv_time, time);
        ArrayList<String> journalList = new ArrayList<>();
        if (!TextUtils.isEmpty(item.getDocuAuthor())) {
            journalList.add(item.getDocuAuthor());
        }
        if (!TextUtils.isEmpty(item.getDocSource())) {
            journalList.add("<<" + item.getDocSource() + ">>");
        }
        if (!TextUtils.isEmpty(item.getPublishTime())) {
            journalList.add(item.getPublishTime());
        }
        String journalString = "";
        for (int i = 0; i < journalList.size(); i++) {
            if (i == 0) {
                journalString += journalList.get(i);
            } else {
                journalString += "-" + journalList.get(i);
            }
        }
        helper.setText(R.id.tv_journal, journalString);
    }
}

package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.home.GetLastPerioResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/12/4.
 */

public class RecommendJournalAdapter extends BaseQuickAdapter<GetLastPerioResponse.LastPerioMessage, BaseViewHolder> {
    Context context;

    public RecommendJournalAdapter(Context context, @Nullable List<GetLastPerioResponse.LastPerioMessage> data) {
        super(R.layout.item_subscribe_journal, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, GetLastPerioResponse.LastPerioMessage item) {
        String imgUrl = "http://new.wanfangdata.com.cn/images/PeriodicalImages/" + item.getPerioId() + "/" + item.getPerioId() + ".jpg";
        Glide.with(context).load(imgUrl).into((ImageView) helper.getView(R.id.iv_conver));
        helper.setText(R.id.tv_journal_name, item.getPerioTitle()).setText(R.id.tv_hold_unit, item.getPerioAlbum()).setText(R.id.tv_time, item.getEndYear() + item.getEndIssue());
    }
}

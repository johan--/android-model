package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.widget.RatingBar;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.utils.DateUtils;
import com.wanfang.collect.CollectBody;

import java.util.Date;
import java.util.List;

/**
 * Created by tangbin on 2017/8/17.
 */

public class MyCollectAdapter extends BaseQuickAdapter<CollectBody, BaseViewHolder> {
    public MyCollectAdapter(@Nullable List<CollectBody> data) {
        super(R.layout.item_collection, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CollectBody item) {
        Date date = DateUtils.parseDate(item.getAddTime());
        String time = DateUtils.formatDate(date, "yyyy年MM月dd日");
        helper.setText(R.id.tv_title, item.getDocuTitle()).setText(R.id.tv_time, time);
        RatingBar ratingBar = helper.getView(R.id.rb);
        ratingBar.setRating(item.getStarLevel());
    }
}

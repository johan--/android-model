package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.main.AllCource;

import java.util.List;

/**
 * Created by tangbin on 2017/7/20.
 */

public class MainCourseAdapter extends BaseQuickAdapter<AllCource.Course, BaseViewHolder> {
    private Context mContext;

    public MainCourseAdapter(@Nullable List<AllCource.Course> data, Context mContext) {
        super(R.layout.item_mainpage_course, data);
        this.mContext = mContext;
    }

    @Override
    protected void convert(BaseViewHolder helper, AllCource.Course item) {
        helper.setText(R.id.tv_course, item.getCourseTitle());
        Glide.with(mContext).load(item.getCourseCover()).into((ImageView) helper.getView(R.id.iv_course));
    }
}

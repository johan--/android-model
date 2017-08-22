package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

/**
 * Created by tangbin on 2017/8/22.
 */

public class BrowseAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    Context context;

    public BrowseAdapter(Context context, @Nullable List<String> data) {
        super(R.layout.item_image, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        Glide.with(context).load(item).into((ImageView) helper.getView(R.id.photo_view));
    }
}

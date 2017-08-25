package com.tb.wangfang.news.ui.adapter;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.View;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by tangbin on 2017/8/22.
 */

public class BrowseAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    Activity context;

    public BrowseAdapter(Activity context, @Nullable List<String> data) {
        super(R.layout.item_image, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        Glide.with(context).load(item).into((PhotoView) helper.getView(R.id.photo_view));
        PhotoView photoView = helper.getView(R.id.photo_view);


        photoView.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
            @Override
            public void onPhotoTap(View view, float x, float y) {
                context.onBackPressed();
            }
        });
    }
}

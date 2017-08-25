package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.MainPageData;

import java.util.List;

/**
 * Created by tangbin on 2017/8/24.
 */

public class MainPageAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static final int TYPE_IMAGE_0 = 0;
    public static final int TYPE_INSERT_1 = 1;
    public static final int TYPE_INSERT_2 = 2;
    Context context;

    public MainPageAdapter(Context context, List<MultiItemEntity> data) {
        super(data);
        this.context = context;
        addItemType(TYPE_IMAGE_0, R.layout.item_one_small_img);
        addItemType(TYPE_INSERT_1, R.layout.item_one_big_img);
        addItemType(TYPE_INSERT_2, R.layout.item_three_img);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {
        MainPageData dataItem = (MainPageData) item;
        switch (helper.getItemViewType()) {
            case TYPE_IMAGE_0:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getSource());
                Glide.with(context).load(dataItem.getImg1()).into((ImageView) helper.getView(R.id.iv));
                break;
            case TYPE_INSERT_1:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getSource());
                Glide.with(context).load(dataItem.getImg1()).into((ImageView) helper.getView(R.id.iv));
                break;
            case TYPE_INSERT_2:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getSource());
                Glide.with(context).load(dataItem.getImg1()).into((ImageView) helper.getView(R.id.iv_1));
                Glide.with(context).load(dataItem.getImg1()).into((ImageView) helper.getView(R.id.iv_2));
                Glide.with(context).load(dataItem.getImg1()).into((ImageView) helper.getView(R.id.iv_3));
                break;
        }
        helper.addOnClickListener(R.id.iv_delete);
    }
}

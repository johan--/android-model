package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.model.bean.ContentBean;
import com.wanfang.main.Content;

import java.util.List;

import static com.tb.wangfang.news.app.Constants.TYPE_INSERT_2;

/**
 * Created by tangbin on 2017/8/24.
 */

public class MainPageAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    Context context;

    public MainPageAdapter(Context context, List<MultiItemEntity> data) {
        super(data);
        this.context = context;
        addItemType(Constants.TYPE_INSERT_1, R.layout.item_one_small_img);
        addItemType(TYPE_INSERT_2, R.layout.item_one_big_img);
        addItemType(Constants.TYPE_INSERT_3, R.layout.item_three_img);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {
        ContentBean dataItem = (ContentBean) item;

        Content.ImageSize imageSize1 = (Content.ImageSize) dataItem.getImages().get(0).getSizesMap().get("full");
        Content.ImageSize imageSize2 = (Content.ImageSize) dataItem.getImages().get(1).getSizesMap().get("full");
        Content.ImageSize imageSize3 = (Content.ImageSize) dataItem.getImages().get(2).getSizesMap().get("full");
        switch (helper.getItemViewType()) {
            case Constants.TYPE_INSERT_1:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getExcerpt());
                Glide.with(context).load(imageSize1.getSourceUrl()).into((ImageView) helper.getView(R.id.iv));
                break;
            case Constants.TYPE_INSERT_2:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getExcerpt());
                Glide.with(context).load(imageSize1.getSourceUrl()).into((ImageView) helper.getView(R.id.iv));
                break;
            case Constants.TYPE_INSERT_3:
                helper.setText(R.id.tv_title, dataItem.getTitle()).setText(R.id.tv_source, dataItem.getExcerpt());
                Glide.with(context).load(imageSize1.getSourceUrl()).into((ImageView) helper.getView(R.id.iv_1));
                Glide.with(context).load(imageSize2.getSourceUrl()).into((ImageView) helper.getView(R.id.iv_2));
                Glide.with(context).load(imageSize3.getSourceUrl()).into((ImageView) helper.getView(R.id.iv_3));
                break;
        }
        helper.addOnClickListener(R.id.iv_delete);
    }
}

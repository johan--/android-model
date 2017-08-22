package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.ItemQuestion;

import java.util.List;

/**
 * Created by tangbin on 2017/8/22.
 */

public class QueestionIvAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    public static final int TYPE_IMAGE_0 = 0;
    public static final int TYPE_INSERT_1 = 1;
    Context context;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public QueestionIvAdapter(Context context, List data) {
        super(data);
        addItemType(TYPE_IMAGE_0, R.layout.item_iv_question);
        addItemType(TYPE_INSERT_1, R.layout.item_iv_question_insert);
        this.context = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case TYPE_IMAGE_0:
                Glide.with(context).load(((ItemQuestion) item).getImgUrl()).into((ImageView) helper.getView(R.id.iv_question));
                helper.addOnClickListener(R.id.iv_delete);
                break;
            case TYPE_INSERT_1:
                helper.addOnClickListener(R.id.rl_insert);
                break;
        }
    }
}

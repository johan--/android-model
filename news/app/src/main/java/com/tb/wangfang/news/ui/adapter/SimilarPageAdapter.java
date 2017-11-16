package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.RelatePapers;

import java.util.List;

/**
 * Created by tangbin on 2017/10/27.
 */

public class SimilarPageAdapter extends BaseQuickAdapter<RelatePapers, BaseViewHolder> {
    public SimilarPageAdapter(@Nullable List<RelatePapers> data) {
        super(R.layout.item_similar_pro, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, RelatePapers item) {
        helper.setText(R.id.tv_similarity, item.getTitle());
    }
}

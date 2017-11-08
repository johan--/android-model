package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.HotSearchBean;

import java.util.List;

/**
 * Created by tangbin on 2017/8/11.
 */

public class HotAdapter extends BaseQuickAdapter<HotSearchBean.DataBean, BaseViewHolder> {

    public HotAdapter( @Nullable List<HotSearchBean.DataBean> data) {
        super(R.layout.item_hot_left, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HotSearchBean.DataBean item) {
        helper.setText(R.id.tv_search_text, item.getTheme());
        int position = helper.getAdapterPosition();
        if (position == 0 || position == 2 || position == 4) {
            helper.getView(R.id.iv_sign).setVisibility(View.VISIBLE);
        } else {
            helper.getView(R.id.iv_sign).setVisibility(View.INVISIBLE);
        }
    }
}

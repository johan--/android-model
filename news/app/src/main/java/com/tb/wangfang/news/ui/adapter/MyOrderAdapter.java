package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.trade.MyOrdersResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/8/10.
 */

public class MyOrderAdapter extends BaseQuickAdapter<MyOrdersResponse.Result, BaseViewHolder> {


    public MyOrderAdapter(@Nullable List<MyOrdersResponse.Result> data) {
        super(R.layout.item_my_order, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyOrdersResponse.Result item) {
        helper.setText(R.id.tv_orderid, item.getOrderId()).setText(R.id.tv_articl_name, item.getOrderTitle())
                .setText(R.id.tv_time, item.getCreateTime()).setText(R.id.tv_price, item.getOrderMoney());
    }
}

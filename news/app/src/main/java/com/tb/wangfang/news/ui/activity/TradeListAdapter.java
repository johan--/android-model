package com.tb.wangfang.news.ui.activity;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.personal.UserGetTradeListResponse;

import java.util.List;

/**
 * Created by tangbin on 2017/11/21.
 */

public class TradeListAdapter extends BaseQuickAdapter<UserGetTradeListResponse.TradeTransaction, BaseViewHolder> {


    public TradeListAdapter(@Nullable List<UserGetTradeListResponse.TradeTransaction> data) {
        super(R.layout.item_trade_his, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, UserGetTradeListResponse.TradeTransaction item) {
        helper.setText(R.id.tv_trade_id, item.getTradeId()).setText(R.id.tv_sum, "充值金额:" + item.getTurnover() + "元").setText(R.id.tv_time, item.getCreateTime())
                .setText(R.id.tv_method, "充值方式:" + item.getProductTitle());
    }
}

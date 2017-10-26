package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.subscribe.SubscribeKeywordMessage;

import java.util.List;

/**
 * Created by tangbin on 2017/10/18.
 */

public class SubscribeLineWordAdapter extends BaseQuickAdapter<SubscribeKeywordMessage, BaseViewHolder> {
    public int getSelectedPosition() {
        return selectedPosition;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.selectedPosition = selectedPosition;
    }

    private int selectedPosition = 0;

    public SubscribeLineWordAdapter(@Nullable List<SubscribeKeywordMessage> data) {
        super(R.layout.item_subscibe_line, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SubscribeKeywordMessage item) {
        TextView tvName = helper.getView(R.id.tv_name);
        if (!TextUtils.isEmpty(item.getKeyword())) {
            helper.setText(R.id.tv_name, item.getKeyword());
        }
        if (helper.getAdapterPosition() == selectedPosition) {
            helper.setBackgroundRes(R.id.tv_name, R.drawable.itme_flow_blue_frame);

            tvName.setTextColor(tvName.getResources().getColor(R.color.white));
        } else {
            helper.setBackgroundRes(R.id.tv_name, R.drawable.item_flow_gray_frame);
            tvName.setTextColor(tvName.getResources().getColor(R.color.colorPrimaryDark));
        }

    }
}

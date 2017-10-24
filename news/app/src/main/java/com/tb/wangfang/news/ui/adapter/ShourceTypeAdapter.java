package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.wanfang.subscribe.SourceType;

import java.util.List;

/**
 * Created by tangbin on 2017/10/23.
 */

public class ShourceTypeAdapter extends BaseQuickAdapter<com.wanfang.subscribe.SourceType, BaseViewHolder> {
    public Boolean[] getSourceSelected() {
        return sourceSelected;
    }

    public void setSourceSelected(Boolean[] sourceSelected) {
        this.sourceSelected = sourceSelected;
    }

    Boolean[] sourceSelected;

    public ShourceTypeAdapter(@Nullable List<SourceType> data) {
        super(R.layout.item_subscribe_source, data);
        sourceSelected = new Boolean[data.size()];
        for (int i = 0; i < sourceSelected.length; i++) {
            sourceSelected[i] = false;
        }
    }

    @Override
    protected void convert(BaseViewHolder helper, SourceType item) {
        TextView textView = helper.getView(R.id.tv_source);
        textView.setText(item.getChName());
        if (sourceSelected[helper.getAdapterPosition()]) {
            textView.setBackgroundResource(R.drawable.itme_flow_blue_frame);
            textView.setTextColor(textView.getResources().getColor(R.color.white));

        } else {
            textView.setBackgroundResource(R.drawable.item_flow_gray_frame);
            textView.setTextColor(textView.getResources().getColor(R.color.gray_text_6));
        }
        helper.addOnClickListener(R.id.tv_source);
    }
}

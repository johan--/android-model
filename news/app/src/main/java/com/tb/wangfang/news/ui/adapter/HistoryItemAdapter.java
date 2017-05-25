package com.tb.wangfang.news.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.HistoryDocItem;

import java.util.List;

/**
 * Created by tangbin on 2017/5/25.
 */

public class HistoryItemAdapter extends BaseQuickAdapter<HistoryDocItem, BaseViewHolder> {

    public HistoryItemAdapter(List<HistoryDocItem> historyItemList) {

        super(R.layout.item_search_history, historyItemList);
    }

    @Override
    protected void convert(BaseViewHolder helper, HistoryDocItem item) {
        helper.setText(R.id.tv_item, item.getText());

    }


}

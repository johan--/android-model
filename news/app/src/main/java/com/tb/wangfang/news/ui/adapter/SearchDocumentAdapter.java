package com.tb.wangfang.news.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.SearchDocItem;

import java.util.List;

/**
 * Created by tangbin on 2017/5/23.
 */

public class SearchDocumentAdapter extends BaseQuickAdapter<SearchDocItem, BaseViewHolder> {

    public SearchDocumentAdapter(List<SearchDocItem> searchDocItemList) {

        super(R.layout.item_search_result, searchDocItemList);
    }

    @Override
    protected void convert(BaseViewHolder helper, SearchDocItem item) {
        helper.addOnClickListener(R.id.tv_book_name);
        helper.setText(R.id.tv_content, item.getDescription());
    }
}

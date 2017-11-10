package com.tb.wangfang.news.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.SearchReplyBean;

import java.util.List;

/**
 * Created by tangbin on 2017/5/23.
 */

public class SearchDocumentAdapter extends BaseQuickAdapter<SearchReplyBean.DataBean, BaseViewHolder> {

    public SearchDocumentAdapter(List<SearchReplyBean.DataBean> searchDocItemList) {

        super(R.layout.item_search_result, searchDocItemList);
    }

    @Override
    protected void convert(BaseViewHolder helper, SearchReplyBean.DataBean item) {
        helper.addOnClickListener(R.id.tv_book_name);
        helper.setText(R.id.tv_content, item.getTitle().toString());
    }
}

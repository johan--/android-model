package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.tb.wangfang.news.model.bean.SearchDocItem;

import java.util.List;

/**
 * Created by tangbin on 2017/5/25.
 */

public interface FilterDocContract {
    interface View extends BaseView {

        void refreshView(List<SearchDocItem> searchDocItems);

        void loadMoreView(List<SearchDocItem> searchDocItems);

    }

    interface Presenter extends BasePresenter<View> {
        void searchAndStore(String text, int page);

    }
}

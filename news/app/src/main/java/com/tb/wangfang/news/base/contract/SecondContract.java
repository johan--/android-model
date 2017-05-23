package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface SecondContract {
    interface View extends BaseView {
        void initView();

        void showSearchresult(List<SearchDocItem> searchDocItems);

        void showHistoryItem(List<HistoryDocItem> historyDocItems);

        void refresh(List<SearchDocItem> searchDocItems);

        void loadMore(List<SearchDocItem> searchDocItems);
    }

    interface Presenter extends BasePresenter<View> {
        void searchAndStore(String text, int page);

        void searchAllHistory();


    }
}

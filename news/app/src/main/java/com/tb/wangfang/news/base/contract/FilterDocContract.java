package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.tb.wangfang.news.model.bean.SearchFilterListBean;
import com.tb.wangfang.news.model.bean.SearchReplyBean;

/**
 * Created by tangbin on 2017/5/25.
 */

public interface FilterDocContract {
    interface View extends BaseView {


        void loadFilterView(SearchFilterListBean searchFilterListBean);

        void loadSearchContent(SearchReplyBean searchReplyBean);

    }

    interface Presenter extends BasePresenter<View> {
        void search(String text, int page);

        void searchNavigation(String params, String navigation, String startDate, String endDate);

    }
}

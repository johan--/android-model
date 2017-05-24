package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface FirstContract {
    interface View extends BaseView {

        void showSpanner(List<String> imgUrl);
        void showTabContent();


    }

    interface Presenter extends BasePresenter<View> {

        void getDailyData();
    }
}

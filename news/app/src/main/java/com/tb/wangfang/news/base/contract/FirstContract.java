package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.Banner;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface FirstContract {
    interface View extends BaseView {

        void showSpanner(List<Banner.Baner> baners);
        void showLastNews(AllLastNews.LastNewsReply reply);
    }

    interface Presenter extends BasePresenter<View> {

        void getBanner(String userId);
        void getLastNews();

    }
}

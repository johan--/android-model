package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.Content;
import com.wanfang.main.SerMainContent;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface FirstContract {
    interface View extends BaseView {

        void showSpanner(List<Content.ContentDetail> baners);

        void showLastNews(AllLastNews.LastNewsReply reply);

        void showMainPage(SerMainContent.ContentResponse response);
    }

    interface Presenter extends BasePresenter<View> {

        void getBanner(String userId);

        void getLastNews();

        void getMianPage(int page);

    }
}

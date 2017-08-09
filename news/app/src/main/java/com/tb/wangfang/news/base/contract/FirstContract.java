package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.wanfang.main.AllCource;
import com.wanfang.main.AllLastNews;
import com.wanfang.main.AllProject;
import com.wanfang.main.AllScience;
import com.wanfang.main.Banner;
import com.wanfang.main.GuessLikeOuterClass;
import com.wanfang.main.MeetingMessage;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public interface FirstContract {
    interface View extends BaseView {

        void showSpanner(List<Banner.Baner> baners);

        void showLastNews(AllLastNews.LastNewsReply reply);

        void showProjects(AllProject.ProjectReply reply);

        void showMeeting(MeetingMessage.MeetingReply reply);

        void showScience(AllScience.AllScienceReply reply);

        void showGuessLike(GuessLikeOuterClass.GuessLikeReply reply);

        void showCourse(AllCource.AlCourseReply reply);


    }

    interface Presenter extends BasePresenter<View> {

        void getBanner(String userId);

        void getLastNews();

        void getProject();//专题聚焦

        void getMeeting();

        void getScience();

        void getGuessLike();

        void getCourese(String userId);

    }
}

package com.tb.wangfang.news.model.http;


import com.tb.wangfang.news.model.bean.DailyListBean;



import io.reactivex.Flowable;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface HttpHelper {

    Flowable<DailyListBean> fetchDailyListInfo();

}

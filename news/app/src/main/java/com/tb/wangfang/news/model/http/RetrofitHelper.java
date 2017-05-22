package com.tb.wangfang.news.model.http;


import com.tb.wangfang.news.model.bean.DailyListBean;
import com.tb.wangfang.news.model.http.api.WangfangApis;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by codeest on 2016/8/3.
 */
public class RetrofitHelper implements HttpHelper {

    private WangfangApis mWanfangApiService;


    @Inject
    public RetrofitHelper(WangfangApis wangfangApiService) {
        this.mWanfangApiService = wangfangApiService;
    }

    @Override
    public Flowable<DailyListBean> fetchDailyListInfo() {
        return mWanfangApiService.getDailyList();
    }
}

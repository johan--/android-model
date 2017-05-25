package com.tb.wangfang.news.model.http;


import com.tb.wangfang.news.model.bean.DailyListBean;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.http.response.WXHttpResponse;

import java.util.List;

import io.reactivex.Flowable;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface HttpHelper {

    Flowable<DailyListBean> fetchDailyListInfo();

    Flowable<WXHttpResponse<List<SearchDocItem>>> fetchWechatSearchListInfo(int num, int page, String word);
}

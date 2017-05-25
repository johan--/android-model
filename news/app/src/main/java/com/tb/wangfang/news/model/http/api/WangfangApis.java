package com.tb.wangfang.news.model.http.api;


import com.tb.wangfang.news.model.bean.DailyListBean;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.http.response.WXHttpResponse;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by codeest on 2016/8/2.
 * 知乎APIs
 */
public interface WangfangApis {
    //    String HOST = "http://news-at.zhihu.com/api/4/";
    String HOST = "http://api.tianapi.com/";

    /**
     * 最新日报
     */
    @GET("news/latest")
    Flowable<DailyListBean> getDailyList();


    /*断点续传下载接口*/
    @Streaming/*大文件需要加入这个判断，防止下载过程中写入到内存中*/
    @GET
    Observable<ResponseBody> download(@Header("RANGE") String start, @Url String url);

    /**
     * 微信精选列表
     */
    @GET("wxnew")
    Flowable<WXHttpResponse<List<SearchDocItem>>> getWXHotSearch(@Query("key") String key, @Query("num") int num, @Query("page") int page, @Query("word") String word);
}

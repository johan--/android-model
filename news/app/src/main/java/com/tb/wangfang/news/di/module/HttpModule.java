package com.tb.wangfang.news.di.module;

import com.tb.wangfang.news.model.http.api.ZhihuApis;

import javax.inject.Singleton;

import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by tangbin on 2017/5/4.
 */

public class HttpModule {

    @Singleton
    @Provides
    ZhihuApis provideZhihuService( Retrofit retrofit) {
        return retrofit.create(ZhihuApis.class);
    }
}

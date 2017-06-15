package com.tb.wangfang.news.di.component;

import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.di.module.AppModule;
import com.tb.wangfang.news.di.module.HttpModule;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.tb.wangfang.news.model.http.RetrofitHelper;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tangbin on 2017/5/4.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();  // 提供App的Context

    DataManager getDataManager(); //数据中心

    RetrofitHelper retrofitHelper();  //提供http的帮助类


    RealmHelper realmHelper();    //提供数据库帮助类

    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类
}

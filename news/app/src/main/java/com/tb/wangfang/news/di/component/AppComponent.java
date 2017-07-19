package com.tb.wangfang.news.di.component;

import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.di.module.AppModule;
import com.tb.wangfang.news.di.module.HttpModule;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;
import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/4.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();  // 提供App的Context

    RealmHelper realmHelper();    //提供数据库帮助类

    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类

    ManagedChannel getChannel();//提供网络
}

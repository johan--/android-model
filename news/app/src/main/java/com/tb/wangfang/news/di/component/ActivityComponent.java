package com.tb.wangfang.news.di.component;

import android.app.Activity;

import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.di.scope.ActivityScope;
import com.tb.wangfang.news.ui.activity.DocDetailActivity;
import com.tb.wangfang.news.ui.activity.EditNackNameActivity;
import com.tb.wangfang.news.ui.activity.EditPersonInforActivity;
import com.tb.wangfang.news.ui.activity.FilterDocActivity;
import com.tb.wangfang.news.ui.activity.LoginActivity;
import com.tb.wangfang.news.ui.activity.MainActivity;
import com.tb.wangfang.news.ui.activity.MainDetailActivity;
import com.tb.wangfang.news.ui.activity.MyOrderActivity;
import com.tb.wangfang.news.ui.activity.MycollectActivity;
import com.tb.wangfang.news.ui.activity.PayOrderActivity;
import com.tb.wangfang.news.ui.activity.PersonEditListActivity;
import com.tb.wangfang.news.ui.activity.RegisterActivity;
import com.tb.wangfang.news.ui.activity.SettingActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();

    void inject(MainActivity mainActivity);

    void inject(FilterDocActivity filterDocActivity);

    void inject(LoginActivity loginActivity);

    void inject(SettingActivity settingActivity);

    void inject(MyOrderActivity myOrderActivity);

    void inject(RegisterActivity registerActivity);

    void inject(MainDetailActivity mainDetailActivity);

    void inject(MycollectActivity mycollectActivity);

    void inject(PayOrderActivity payOrderActivity);

    void inject(DocDetailActivity docDetailActivity);

    void inject(PersonEditListActivity personEditListActivity);

    void inject(EditPersonInforActivity editPersonInforActivity);

    void inject(EditNackNameActivity editNackNameActivity);

}

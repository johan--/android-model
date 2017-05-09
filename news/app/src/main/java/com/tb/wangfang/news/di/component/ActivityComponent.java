package com.tb.wangfang.news.di.component;

import android.app.Activity;

import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.di.scope.ActivityScope;
import com.tb.wangfang.news.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(MainActivity mainActivity);

}

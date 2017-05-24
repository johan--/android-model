package com.tb.wangfang.news.di.component;


import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.di.scope.FragmentScope;
import com.tb.wangfang.news.ui.fragment.FirstFragment;
import com.tb.wangfang.news.ui.fragment.FourthFragment;
import com.tb.wangfang.news.ui.fragment.HotFragment;
import com.tb.wangfang.news.ui.fragment.OtherFragment;
import com.tb.wangfang.news.ui.fragment.QuickSeeFragment;
import com.tb.wangfang.news.ui.fragment.SecondFragment;
import com.tb.wangfang.news.ui.fragment.ThirdFragment;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {


    void inject(FirstFragment firstFragment);

    void inject(SecondFragment secondFragment);

    void inject(ThirdFragment thirdFragment);

    void inject(FourthFragment fourthFragment);

    void inject(HotFragment hotFragment);

    void inject(QuickSeeFragment quickSeeFragment);

    void inject(OtherFragment otherFragment);

}

package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdPresenter extends RxPresenter<ThirdContract.View> implements ThirdContract.Presenter {
    private ManagedChannel managedChannel;

    @Inject
    public ThirdPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }


    @Override
    public void checkVersion(String currentVersion) {

    }

    @Override
    public void checkPermissions(RxPermissions rxPermissions) {

    }

    @Override
    public void setNightModeState(boolean b) {

    }

    @Override
    public void getDailyData() {

    }
}

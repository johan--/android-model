package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FourthContract;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/9.
 */

public class FourthPresenter extends RxPresenter<FourthContract.View> implements FourthContract.Presenter {
    private ManagedChannel managedChannel;

    @Inject
    public FourthPresenter(ManagedChannel managedChannel) {
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

package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdPresenter extends RxPresenter<ThirdContract.View> implements ThirdContract.Presenter {
    private ManagedChannel managedChannel;
    private final RealmHelper realmHelper;

    @Inject
    public ThirdPresenter(ManagedChannel managedChannel, RealmHelper realmHelper) {
        this.managedChannel = managedChannel;
        this.realmHelper = realmHelper;
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

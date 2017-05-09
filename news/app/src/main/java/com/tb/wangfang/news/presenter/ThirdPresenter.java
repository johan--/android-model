package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.model.DataManager;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdPresenter extends RxPresenter<FirstContract.View> implements FirstContract.Presenter {
    private DataManager mDataManager;
    @Inject
    public ThirdPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
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

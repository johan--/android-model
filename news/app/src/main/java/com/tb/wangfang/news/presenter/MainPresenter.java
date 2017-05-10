package com.tb.wangfang.news.presenter;


import android.Manifest;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.DailyListBean;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.RxUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subscribers.ResourceSubscriber;


/**
 * Created by tangbin on 2017/5/8.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);
        registerEvent();
    }

    private void registerEvent() {

    }

    @Override
    public void checkVersion(String currentVersion) {

    }

    @Override
    public void checkPermissions(RxPermissions rxPermissions) {
        addSubscribe(rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(@NonNull Boolean granted) throws Exception {
                        if (granted) {
                            mView.startDownloadService();
                        } else {
                            mView.showErrorMsg("下载应用需要文件写入权限~");
                        }
                    }
                }));
    }

    @Override
    public void setNightModeState(boolean b) {

    }

    @Override
    public void getDailyData() {
        addSubscribe(mDataManager.fetchDailyListInfo().compose(RxUtil.<DailyListBean>rxSchedulerHelper())
                .map(new Function<DailyListBean, DailyListBean>() {
                    @Override
                    public DailyListBean apply(@NonNull DailyListBean dailyListBean) throws Exception {
                        return dailyListBean;
                    }
                }).subscribeWith(new ResourceSubscriber<DailyListBean>() {
                    @Override
                    public void onNext(DailyListBean dailyListBean) {
                        LogUtil.d(dailyListBean.toString());
                        mView.showUpdateDialog(dailyListBean.toString());

                    }

                    @Override
                    public void onError(Throwable t) {
                        LogUtil.d(t.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                })
        );
    }
}

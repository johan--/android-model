package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.QuickSeeContract;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/23.
 */

public class QuickSeePresenter extends RxPresenter<QuickSeeContract.View> implements QuickSeeContract.Presenter {
    private final ManagedChannel managedChannel;

    @Inject
    public QuickSeePresenter(ManagedChannel mDataManager) {
        this.managedChannel = mDataManager;
    }
}

package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.HotContract;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/23.
 */

public class HotPresenter extends RxPresenter<HotContract.View> implements HotContract.Presenter{
    private final ManagedChannel managedChannel;

    @Inject
    public HotPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }
}

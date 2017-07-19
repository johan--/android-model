package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.OtherContract;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/23.
 */

public class OtherPresenter extends RxPresenter<OtherContract.View> implements OtherContract.Presenter {

    private final ManagedChannel managedChannel;

    @Inject
    public OtherPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }
}

package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.LoginContract;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/8/3.
 */

public class LoginPresenter  extends RxPresenter<LoginContract.View> implements LoginContract.Presenter{
    private ManagedChannel managedChannel;

    @Inject
    public LoginPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }

}

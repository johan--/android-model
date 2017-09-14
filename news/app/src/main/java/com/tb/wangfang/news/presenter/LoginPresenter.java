package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.LoginContract;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.MsgLogin;
import com.wanfang.personal.PersonalCenterServiceGrpc;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tangbin on 2017/8/3.
 */

public class LoginPresenter extends RxPresenter<LoginContract.View> implements LoginContract.Presenter {
    private ManagedChannel managedChannel;

    @Inject
    public LoginPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }

    @Override
    public void AccountLogin(final String account, final String passWord) {
        try {
            Thread.sleep(3000);
            mView.loginSuccess(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Single.create(new SingleOnSubscribe<MsgLogin.LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<MsgLogin.LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                MsgLogin.LoginRequest request = MsgLogin.LoginRequest.newBuilder().setUserName(account).setPassword(passWord).build();
                MsgLogin.LoginResponse response = stub.login(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MsgLogin.LoginResponse>() {
            @Override
            public void onSuccess(MsgLogin.LoginResponse response) {
                mView.loginSuccess(response);
            }

            @Override
            public void onError(Throwable e) {
                mView.loginSuccess(null);
                ToastUtil.show("访问失败");
            }
        });
    }
}

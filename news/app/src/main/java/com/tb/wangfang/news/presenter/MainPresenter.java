package com.tb.wangfang.news.presenter;


import android.Manifest;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.utils.LogUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by tangbin on 2017/5/8.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {
    private ManagedChannel managedChannel;

    @Inject
    public MainPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
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
        addSubscribe(Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> e) throws Exception {
                GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(managedChannel);
                HelloRequest message = HelloRequest.newBuilder().setName("sdasdada").build();
                HelloReply reply = stub.sayHello(message);
                e.onSuccess(reply.getMessage());
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<String>() {
                    @Override
                    public void onSuccess(String s) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.d(e.getMessage());
                    }
                }));
    }
}

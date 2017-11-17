package com.tb.wangfang.news.presenter;


import android.Manifest;
import android.util.Log;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.wanfang.personal.EducationLevelListRequest;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.SubjectListRequest;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.UserRolesListRequest;
import com.wanfang.personal.UserRolesListResponse;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;


/**
 * Created by tangbin on 2017/5/8.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {
    private ManagedChannel managedChannel;
    private ImplPreferencesHelper preferencesHelper;
    private String TAG = "MainPresenter";


    @Inject
    public MainPresenter(ManagedChannel managedChannel, ImplPreferencesHelper preferencesHelper) {
        this.managedChannel = managedChannel;
        this.preferencesHelper = preferencesHelper;
    }

    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);
        registerEvent();
    }

    private void registerEvent() {
        addSubscribe(RxBus.getDefault().toFlowable(String.class).subscribeWith(new DisposableSubscriber<String>() {
            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: " + s);
                mView.restart();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        }));

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
    public void restorePersonnalMappingTable() {
        if (preferencesHelper.getUserRolesMap() == null) {
            Single.create(new SingleOnSubscribe<UserRolesListResponse>() {
                @Override
                public void subscribe(SingleEmitter<UserRolesListResponse> e) throws Exception {
                    PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                    UserRolesListRequest request = UserRolesListRequest.newBuilder().build();
                    UserRolesListResponse response = stub.getRolesList(request);
                    e.onSuccess(response);

                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UserRolesListResponse>() {
                @Override
                public void onSuccess(UserRolesListResponse userRolesListResponse) {
                    preferencesHelper.storeUserRolesMap(userRolesListResponse);
                    Log.d(TAG, "onSuccess: userRolesListResponse");
                }

                @Override
                public void onError(Throwable e) {
                    ToastUtil.show("网络出错");
                }
            });
            Single.create(new SingleOnSubscribe<SubjectListResponse>() {
                @Override
                public void subscribe(SingleEmitter<SubjectListResponse> e) throws Exception {
                    PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                    SubjectListRequest request = SubjectListRequest.newBuilder().build();
                    SubjectListResponse response = stub.getSubjectList(request);
                    e.onSuccess(response);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(new DisposableSingleObserver<SubjectListResponse>() {
                        @Override
                        public void onSuccess(SubjectListResponse subjectListResponse) {
                            preferencesHelper.storeSubjectMap(subjectListResponse);
                            Log.d(TAG, "onSuccess: subjectListResponse");
                        }

                        @Override
                        public void onError(Throwable e) {
                            ToastUtil.show("网络出错");
                        }
                    });
            Single.create(new SingleOnSubscribe<EducationLevelListResponse>() {
                @Override
                public void subscribe(SingleEmitter<EducationLevelListResponse> e) throws Exception {
                    PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                    EducationLevelListRequest request = EducationLevelListRequest.newBuilder().build();
                    EducationLevelListResponse response = stub.getEducationLevelList(request);
                    e.onSuccess(response);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<EducationLevelListResponse>() {
                @Override
                public void onSuccess(EducationLevelListResponse educationLevelListResponse) {
                    preferencesHelper.storeEducationMap(educationLevelListResponse);
                    Log.d(TAG, "onSuccess: educationLevelListResponse");
                }

                @Override
                public void onError(Throwable e) {
                    ToastUtil.show("网络出错");
                }
            });
        }

    }

}

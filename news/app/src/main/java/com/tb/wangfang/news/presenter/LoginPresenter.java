package com.tb.wangfang.news.presenter;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.LoginContract;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.grpcCommon.MsgError;
import com.wanfang.personal.GetPhoneCaptchaRequest;
import com.wanfang.personal.GetPhoneCaptchaResponse;
import com.wanfang.personal.LoginRequest;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.QuickLoginRequest;
import com.wanfang.personal.ThirdPartyLoginRequest;

import javax.inject.Inject;

import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.api.BasicCallback;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Created by tangbin on 2017/8/3.
 */

public class LoginPresenter extends RxPresenter<LoginContract.View> implements LoginContract.Presenter {
    private ManagedChannel managedChannel;
    private ImplPreferencesHelper preferencesHelps;
    private String TAG = "loginActivity";

    public String getPhoneCaprcha() {
        return phoneCaprcha;
    }

    public void setPhoneCaprcha(String phoneCaprcha) {
        this.phoneCaprcha = phoneCaprcha;
    }

    private String phoneCaprcha;

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    private int countDown = 60;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                if (countDown > 0) {
                    countDown--;
                    Message message = new Message();
                    message.what = 0;
                    handler.sendMessageDelayed(message, 1000);
                    if (mView != null) {
                        mView.showCountDown(countDown);
                    }
                } else {
                    handler.removeMessages(0);
                    mView.showCountDown(countDown);
                    countDown = 60;
                    mView.setCodeBtnEnable();
                }
            }
        }
    };

    @Override
    public void attachView(LoginContract.View view) {
        super.attachView(view);
        registerEvent();
    }

    private void registerEvent() {
        addSubscribe(RxBus.getDefault().toFlowable(String.class).subscribeWith(new DisposableSubscriber<String>() {
            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: " + s);
                if (s.equals("bindSuccess"))
                    mView.prefinish();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        }));
    }

    @Inject
    public LoginPresenter(ManagedChannel managedChannel, ImplPreferencesHelper preferencesHelps) {
        this.managedChannel = managedChannel;
        this.preferencesHelps = preferencesHelps;
    }

    @Override
    public void AccountLogin(final String account, final String passWord) {
        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                LoginRequest request = LoginRequest.newBuilder().setUserName(account).setPassword(passWord).build();
                LoginResponse response = stub.login(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                if (response.hasError()) {
                    mView.loginSuccess(response);
                } else {
                    preferencesHelps.storeLoginInfo(response, passWord);
                    preferencesHelps.setLoginMethod("0");
                    mView.loginSuccess(response);
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                mView.loginSuccess(LoginResponse.getDefaultInstance());

            }
        });
    }

    @Override
    public void getPhoneCaptcha(final String phone, final String nation) {
        phoneCaprcha = SystemUtil.getRandomSixNum();
        mView.setCodeBtnDisable();
        Single.create(new SingleOnSubscribe<GetPhoneCaptchaResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetPhoneCaptchaResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                GetPhoneCaptchaRequest request = GetPhoneCaptchaRequest.newBuilder().setPhoneNumber(phone).setNation("0086").setMessageType("Register").setPhoneCaptcha(phoneCaprcha).build();
                GetPhoneCaptchaResponse response = stub.getPhoneCaptcha(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GetPhoneCaptchaResponse>() {
            @Override
            public void onSuccess(GetPhoneCaptchaResponse response) {
                Log.d(TAG, "onSuccess: " + response.getStatus());
                if (response.getStatus() == 200) {
                    Message msg = new Message();
                    msg.what = 0;
                    handler.sendMessage(msg);
                    ToastUtil.show("发送成功");
                    preferencesHelps.putCurrentTime();

                } else {
                    ToastUtil.show("发送失败");
                    mView.setCodeBtnEnable();
                }


            }

            @Override
            public void onError(Throwable e) {
                mView.loginSuccess(LoginResponse.getDefaultInstance());

            }
        });
    }

    @Override
    public void thirdLogin(final String id, final int type) {
        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                ThirdPartyLoginRequest request = ThirdPartyLoginRequest.newBuilder().setUid(id).setThirdPartyCode(type).build();
                LoginResponse response = stub.thirdPartyLogin(request);
                e.onSuccess(response);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse userRolesListResponse) {
                Log.e(TAG, "onSuccess: userRolesListResponse" + userRolesListResponse);
                if (userRolesListResponse.getError().getErrorMessage().getErrorCode() == MsgError.ErrorCode.THIRD_PARTY_NOT_BINd) {

                    mView.showDialoge(id, type + "");
                } else {
                    preferencesHelps.storeLoginInfo(userRolesListResponse, id);
                    preferencesHelps.setLoginMethod("2");
                    mView.loginSuccess(userRolesListResponse);
                }
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("网络出错");
            }
        });
    }

    @Override
    public void quickLogin(final String phone, final String captcha, final String deviceId) {
        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                QuickLoginRequest request = QuickLoginRequest.newBuilder().setPhoneNumber(phone).build();
                LoginResponse response = stub.quickLogin(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse response) {
                if (!response.hasError()) {
                    Log.d(TAG, "onSuccess: " + response.toString());
                    preferencesHelps.storeLoginInfo(response, "");
                    preferencesHelps.setLoginMethod("1");
                    JmessageRegister(response.getUserId());
                    mView.loginSuccess(response);
                } else {
                    ToastUtil.show(response.getError().getErrorMessage().getErrorReason());
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                mView.loginSuccess(LoginResponse.getDefaultInstance());
            }
        });

    }

    private void JmessageRegister(String userId) {
        JMessageClient.register(userId, "wanfangdata", new BasicCallback() {
            @Override
            public void gotResult(int i, String s) {
                if (i == 0) {
                    Log.e(TAG, "gotResult: jmessage注册成功");
                } else {

                }
            }
        });
    }

    @Override
    public boolean checkDifftimeCount() {

        return preferencesHelps.CheckSmsTen();
    }

    @Override
    public void putCurentTime() {
        preferencesHelps.putCurrentTime();
    }


}

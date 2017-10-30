package com.tb.wangfang.news.presenter;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.LoginContract;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.wanfang.personal.LoginRequest;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.PhoneCaptchaRequest;
import com.wanfang.personal.PhoneCaptchaResponse;

import java.io.File;

import javax.inject.Inject;

import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.model.UserInfo;
import cn.jpush.im.api.BasicCallback;
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
    private ImplPreferencesHelper preferencesHelps;
    private String TAG = "loginActivity";

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
                    mView.showCountDown(countDown);
                } else {
                    mView.showCountDown(countDown);
                }
            }
        }
    };

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
                JMessageLogin(response);
                preferencesHelps.storeLoginInfo(response);

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                mView.loginSuccess(null);

            }
        });
    }

    @Override
    public void getPhoneCaptcha(final String phone) {
        Single.create(new SingleOnSubscribe<PhoneCaptchaResponse>() {
            @Override
            public void subscribe(SingleEmitter<PhoneCaptchaResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PhoneCaptchaRequest request = PhoneCaptchaRequest.newBuilder().setPhone(phone).build();
                PhoneCaptchaResponse response = stub.getPhoneCaptcha(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PhoneCaptchaResponse>() {
            @Override
            public void onSuccess(PhoneCaptchaResponse response) {
                Message msg = new Message();
                msg.what = 0;
                handler.sendMessage(msg);

            }

            @Override
            public void onError(Throwable e) {
                mView.loginSuccess(null);

            }
        });
    }

    private void JMessageLogin(final LoginResponse response) {

//        JMessageClient.updateUserAvatar(new File(uri.getPath()), new BasicCallback() {
//            @Override
//            public void gotResult(int responseCode, String responseMessage) {
//                jiguang.chat.utils.dialog.LoadDialog.dismiss(context);
//                if (responseCode == 0) {
//                    ToastUtil.shortToast(mContext, "更新成功");
//                }else {
//                    ToastUtil.shortToast(mContext, "更新失败" + responseMessage);
//                }
//            }
//        });
        JMessageClient.login(response.getUserId(), "123456", new BasicCallback() {
            @Override
            public void gotResult(int responseCode, String responseMessage) {
                if (responseCode == 0) {
                    UserInfo myInfo = JMessageClient.getMyInfo();
                    File avatarFile = myInfo.getAvatarFile();
                    //登陆成功,如果用户有头像就把头像存起来,没有就设置null
                    if (avatarFile != null) {
                        preferencesHelps.setUserAvatar(avatarFile.getAbsolutePath());
                    } else {
                        preferencesHelps.setUserAvatar(null);
                    }
                    mView.loginSuccess(response);
                } else {
                    mView.loginSuccess(null);
                }
            }
        });
    }
}

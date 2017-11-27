package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.grpcCommon.MsgError;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.PasswordVerifyRequest;
import com.wanfang.personal.PasswordVerifyResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.ThirdPartyBindRequest;
import com.wanfang.personal.ThirdPartyBindResponse;
import com.wanfang.personal.ThirdPartyLoginRequest;
import com.wanfang.personal.ThirdPartyType;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class BindwanfangAccountActivity extends SimpleActivity {

    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.edit_account)
    AppCompatEditText editAccount;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    @BindView(R.id.iv_password_is_see)
    ImageView ivPasswordIsSee;
    @BindView(R.id.ll_common)
    LinearLayout llCommon;
    @BindView(R.id.btn_bind)
    Button btnBind;
    private String id;
    private String type;
    private MaterialDialog mdialog;
    private ThirdPartyType thirdPartyType;
    private String TAG = "BindwanfangAccount";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_bindwanfang_account;
    }

    @Override
    protected void initEventAndData() {

        id = getIntent().getStringExtra("uid");
        type = getIntent().getStringExtra("type");
    }


    @OnClick({R.id.tv_return, R.id.btn_bind})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.btn_bind:

                String account = editAccount.getText().toString();
                String passWord = editPassword.getText().toString();
                if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(account.trim())) {
                    if (!TextUtils.isEmpty(passWord) && !TextUtils.isEmpty(passWord.trim())) {
                        mdialog = new MaterialDialog.Builder(this)
                                .title("登录中")
                                .progress(true, 0)
                                .progressIndeterminateStyle(true)
                                .show();
                        checkAccount(account, passWord);

                    } else {
                        ToastUtil.show("请输入密码");
                    }
                } else {
                    ToastUtil.show("请输入账号");
                }
//                bindAccount(account, passWord);
                break;
        }
    }

    private void checkAccount(final String account, final String passWord) {
        Single.create(new SingleOnSubscribe<PasswordVerifyResponse>() {
            @Override
            public void subscribe(SingleEmitter<PasswordVerifyResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PasswordVerifyRequest request = PasswordVerifyRequest.newBuilder().setUserId(account).setPassword(passWord).build();
                PasswordVerifyResponse response = stub.passwordVerify(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PasswordVerifyResponse>() {
            @Override
            public void onSuccess(PasswordVerifyResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                if (response.getIsRight()) {
                    bindAccount(account, passWord);
                } else {
                    ToastUtil.show("账号或密码错误");
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器异常");

            }
        });

    }

    private void bindAccount(final String account, final String passWord) {

        Single.create(new SingleOnSubscribe<ThirdPartyBindResponse>() {
            @Override
            public void subscribe(SingleEmitter<ThirdPartyBindResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                ThirdPartyBindRequest request = ThirdPartyBindRequest.newBuilder().setUid(id).setUserId(account).setThirdPartyCode(Integer.parseInt(type)).setUserStatus(0).build();
                ThirdPartyBindResponse response = stub.thirdPartyBind(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ThirdPartyBindResponse>() {
            @Override
            public void onSuccess(ThirdPartyBindResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                if (response.getBindStatus() == 200) {

                    login(passWord);


                } else {
                    ToastUtil.show("绑定失败");
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器异常");

            }
        });
    }

    private void login(final String password) {
        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                ThirdPartyLoginRequest request = ThirdPartyLoginRequest.newBuilder().setUid(id).setThirdPartyCode(Integer.parseInt(type)).build();
                LoginResponse response = stub.thirdPartyLogin(request);
                e.onSuccess(response);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse userRolesListResponse) {
                Log.e(TAG, "onSuccess: userRolesListResponse" + userRolesListResponse);
                if (userRolesListResponse.getError().getErrorMessage().getErrorCode() == MsgError.ErrorCode.THIRD_PARTY_NOT_BINd) {

                    ToastUtil.show("未绑定成功");
                } else {
                    preferencesHelper.storeLoginInfo(userRolesListResponse, password);
                    if (TextUtils.isEmpty(userRolesListResponse.getLoginToken())) {
                        ToastUtil.show("访问失败");
                    } else {

                        ToastUtil.show("绑定成功");
                        RxBus.getDefault().post("bindSuccess");
                        preferencesHelper.setLoginState(true);
                        preferencesHelper.setLoginMethod("2");
                        finish();
                    }
                }
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("网络出错");
            }
        });

    }


}

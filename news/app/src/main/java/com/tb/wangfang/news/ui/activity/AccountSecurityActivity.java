package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.PasswordUpdateRequest;
import com.wanfang.personal.PasswordUpdateResponse;
import com.wanfang.personal.PasswordVerifyRequest;
import com.wanfang.personal.PasswordVerifyResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

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

public class AccountSecurityActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.ll_account_security)
    LinearLayout llAccountSecurity;
    @BindView(R.id.ll_bind_account)
    LinearLayout llBindAccount;
    @BindView(R.id.edit_old_password)
    AppCompatEditText editOldPassword;
    @BindView(R.id.edit_new_password)
    AppCompatEditText editNewPassword;
    @BindView(R.id.edit_certain_password)
    AppCompatEditText editCertainPassword;
    @BindView(R.id.ll_alter_password)
    LinearLayout llAlterPassword;
    int state = 0;  //1 账号绑定页 2 密码修改页
    private String TAG = "AccountSecurityActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_account_security;
    }

    @Override
    protected void initEventAndData() {
        String oldPassword = editOldPassword.getText().toString();

    }


    @OnClick({R.id.tv_return, R.id.tv_account_bind, R.id.tv_alter_password, R.id.tv_phone_bind, R.id.tv_email_bind, R.id.tv_qq_bind, R.id.tv_weichat_bind, R.id.tv_weibo_bind, R.id.btn_alter})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                if (state == 0) {
                    finish();
                } else if (state == 1) {
                    llAccountSecurity.setVisibility(View.VISIBLE);
                    llBindAccount.setVisibility(View.GONE);
                    state = 0;
                } else {
                    llAccountSecurity.setVisibility(View.VISIBLE);
                    llAlterPassword.setVisibility(View.GONE);
                    state = 0;
                }

                break;
            case R.id.tv_account_bind:
                state = 1;
                llAccountSecurity.setVisibility(View.GONE);
                llBindAccount.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_alter_password:
                state = 2;
                llAccountSecurity.setVisibility(View.GONE);
                llAlterPassword.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_phone_bind:
                break;
            case R.id.tv_email_bind:
                break;
            case R.id.tv_qq_bind:
                break;
            case R.id.tv_weichat_bind:
                break;
            case R.id.tv_weibo_bind:
                break;
            case R.id.btn_alter:
                String oldPassword = editOldPassword.getText().toString();
                if (!TextUtils.isEmpty(oldPassword) && !TextUtils.isEmpty(oldPassword.trim())) {
                    checkPassword(oldPassword.trim());
                } else {
                    ToastUtil.shortShow("请输入账户原密码");
                }


                break;
        }
    }

    private void checkPassword(final String passWord) {
        Single.create(new SingleOnSubscribe<PasswordVerifyResponse>() {
            @Override
            public void subscribe(SingleEmitter<PasswordVerifyResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PasswordVerifyRequest request = PasswordVerifyRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPassword(passWord).build();
                PasswordVerifyResponse response = stub.passwordVerify(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PasswordVerifyResponse>() {
            @Override
            public void onSuccess(PasswordVerifyResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                if (response.getIsRight()) {
                    alter();
                } else {
                    ToastUtil.show("旧密码错误");
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器异常");

            }
        });
    }

    private void alter() {
        String oneNewPassword = editNewPassword.getText().toString();
        String certainNewPassword = editCertainPassword.getText().toString();
        if (!TextUtils.isEmpty(oneNewPassword) && !TextUtils.isEmpty(oneNewPassword.trim())) {
            if (oneNewPassword.length() >= 6) {
                if (certainNewPassword.equals(oneNewPassword.trim())) {
                    alter2();
                } else {
                    ToastUtil.shortShow("两次输入新密码不一致");
                }
            } else {
                ToastUtil.shortShow("新密码必须大于6位，小于16位");
            }
        } else {
            ToastUtil.shortShow("请输入6到16位新密码");
        }
    }

    private void alter2() {
        Single.create(new SingleOnSubscribe<PasswordUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<PasswordUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PasswordUpdateRequest request = PasswordUpdateRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setNewPassword(editNewPassword.getText().toString().trim()).build();
                PasswordUpdateResponse response = stub.updatePassword(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PasswordUpdateResponse>() {
            @Override
            public void onSuccess(PasswordUpdateResponse response) {
                Log.d(TAG, "onSuccess: " + response);
                if (!response.hasError()) {
                    ToastUtil.show("修改完成");
                    llAccountSecurity.setVisibility(View.VISIBLE);
                    llAlterPassword.setVisibility(View.GONE);
                    state = 0;
                } else {
                    ToastUtil.show("修改失败");
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");

            }
        });
    }
}

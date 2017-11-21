package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.PasswordUpdateRequest;
import com.wanfang.personal.PasswordUpdateResponse;
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

public class FindPasswordActivity2 extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    @BindView(R.id.edit_password2)
    AppCompatEditText editPassword2;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    private String userId;
    private MaterialDialog mdialog;
    private String phoneNum;
    private String captcha;
    private String TAG = "FindPasswordActivity2";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_find_password2;
    }

    @Override
    protected void initEventAndData() {
        userId = getIntent().getStringExtra("userId");
    }


    @OnClick({R.id.tv_return, R.id.btn_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.btn_submit:

                phoneNum = editPassword.getText().toString();
                captcha = editPassword2.getText().toString();
                if (!TextUtils.isEmpty(phoneNum) && !TextUtils.isEmpty(phoneNum.trim())) {
                    if (!TextUtils.isEmpty(captcha) && !TextUtils.isEmpty(captcha.trim())) {
                        if (phoneNum.trim().equals(captcha.trim())) {
                            mdialog = new MaterialDialog.Builder(this)
                                    .title("登录中")
                                    .progress(true, 0)
                                    .progressIndeterminateStyle(true)
                                    .show();
                            findPassword();
                        } else {
                            ToastUtil.show("两次输入密码不一致，请修改");
                        }

                    } else {
                        ToastUtil.show("请确认新密码");
                    }

                } else {
                    ToastUtil.show("请输入新密码");
                }

                break;
        }
    }


    private void findPassword() {
        Single.create(new SingleOnSubscribe<PasswordUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<PasswordUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PasswordUpdateRequest request = PasswordUpdateRequest.newBuilder().setUserId(userId).setNewPassword(captcha).build();
                PasswordUpdateResponse response = stub.updatePassword(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PasswordUpdateResponse>() {
            @Override
            public void onSuccess(PasswordUpdateResponse response) {
                Log.d(TAG, "onSuccess: " + response);
                if (!response.hasError()) {
                    ToastUtil.show("修改完成");
                    finish();
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

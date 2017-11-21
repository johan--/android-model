package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.GetPhoneCaptchaRequest;
import com.wanfang.personal.GetPhoneCaptchaResponse;
import com.wanfang.personal.PasswordByPhoneRequest;
import com.wanfang.personal.PasswordByPhoneResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class FindPassWordActivity1 extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.edit_phonenum)
    AppCompatEditText editPhonenum;
    @BindView(R.id.edit_security)
    AppCompatEditText editSecurity;
    @BindView(R.id.tv_get_code)
    TextView tvGetCode;
    @BindView(R.id.btn_step)
    Button btnStep;
    private String TAG = "FindPassWordActivity1";
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
                    showCountDown(countDown);
                } else {
                    showCountDown(countDown);
                }
            }
        }
    };
    private MaterialDialog mdialog;

    private void showCountDown(int countDown) {
        if (countDown > 0) {
            tvGetCode.setText(countDown + "s");
        } else {
            tvGetCode.setText("获取验证码");
            this.countDown = 60;
        }
    }

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_find_pass_word1;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_return, R.id.tv_get_code, R.id.btn_step})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_get_code:
                String phone = editPhonenum.getText().toString();
                if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(phone.trim())) {
                    phone = phone.trim();
                    if (SystemUtil.isMobileNO(phone)) {
                        getCode(phone, "0086");
                    } else {
                        ToastUtil.show("手机格式不正确");
                    }
                } else {
                    ToastUtil.show("手机号码不能为空");
                }

                break;
            case R.id.btn_step:
                String phoneNum = editPhonenum.getText().toString();
                String captcha = editSecurity.getText().toString();
                if (!TextUtils.isEmpty(phoneNum) && !TextUtils.isEmpty(phoneNum.trim())) {
                    if (!TextUtils.isEmpty(captcha) && !TextUtils.isEmpty(captcha.trim())) {
                        mdialog = new MaterialDialog.Builder(this)
                                .title("登录中")
                                .progress(true, 0)
                                .progressIndeterminateStyle(true)
                                .show();
                        find(phoneNum, captcha, SystemUtil.getDeviceId(this));
                    } else {
                        ToastUtil.show("请输入手机验证码");
                    }

                } else {
                    ToastUtil.show("请输入手机号码");
                }


                break;
        }
    }

    private void find(final String phoneNum, final String captcha, String deviceId) {
        Single.create(new SingleOnSubscribe<PasswordByPhoneResponse>() {
            @Override
            public void subscribe(SingleEmitter<PasswordByPhoneResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                PasswordByPhoneRequest request = PasswordByPhoneRequest.newBuilder().setPhoneNumber(phoneNum).setNation("0086").setMessageType("bind").setPhoneCaptcha(captcha).build();
                PasswordByPhoneResponse response = stub.getPasswordByPhone(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<PasswordByPhoneResponse>() {
            @Override
            public void onSuccess(PasswordByPhoneResponse response) {
                Log.d(TAG, "onSuccess: " + response);
                if (!TextUtils.isEmpty(response.getUserId())) {
                    Intent intent = new Intent(FindPassWordActivity1.this, FindPasswordActivity2.class);
                    intent.putExtra("userId", response.getUserId());
                    startActivity(intent);
                    FindPassWordActivity1.this.finish();

                } else {

                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: "+e.getMessage());
                mdialog.dismiss();
            }
        });
    }

    private void getCode(final String phone, final String s) {
        Single.create(new SingleOnSubscribe<GetPhoneCaptchaResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetPhoneCaptchaResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                GetPhoneCaptchaRequest request = GetPhoneCaptchaRequest.newBuilder().setPhoneNumber(phone).setNation(s).setMessageType("bind").build();
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
                } else {
                    ToastUtil.show("发送失败");
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");

            }
        });

    }


}

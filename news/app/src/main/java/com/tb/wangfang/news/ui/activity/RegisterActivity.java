package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.AppUtil;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.grpcCommon.MsgError;
import com.wanfang.personal.CheckPhoneIsExistRequest;
import com.wanfang.personal.CheckPhoneIsExistResponse;
import com.wanfang.personal.CheckUserNameIsExistRequest;
import com.wanfang.personal.CheckUserNameIsExistResponse;
import com.wanfang.personal.GetPhoneCaptchaRequest;
import com.wanfang.personal.GetPhoneCaptchaResponse;
import com.wanfang.personal.LoginRequest;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.RegistRequest;
import com.wanfang.personal.RegistResponse;
import com.wanfang.personal.ThirdPartyBindRequest;
import com.wanfang.personal.ThirdPartyBindResponse;
import com.wanfang.personal.ThirdPartyLoginRequest;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.api.BasicCallback;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class RegisterActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper PreferencesHelper;
    @BindView(R.id.edit_user_name)
    AppCompatEditText editUserName;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    @BindView(R.id.edit_phonenum)
    AppCompatEditText editPhonenum;
    @BindView(R.id.edit_security)
    AppCompatEditText editSecurity;
    @BindView(R.id.tv_get_code)
    TextView tvGetCode;
    @BindView(R.id.tv_wanfang_protocol)
    TextView tvWanfangProtocol;
    @BindView(R.id.tv_to_login)
    TextView tvToLogin;
    private String phone;
    int seconds = 60;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    if (seconds > 0) {
                        Message message = new Message();
                        message.what = 0;
                        handler.sendMessageDelayed(message, 1000);
                        tvGetCode.setText(seconds + "s");
                        seconds--;
                    } else {
                        seconds = 60;
                        tvGetCode.setEnabled(true);
                        tvGetCode.setText("获取验证码");
                    }

                    break;
            }

        }
    };
    private String TAG = "RegisterActivity";
    private String userName;
    private String passWord;
    private String code;
    private String id;
    private String type;
    private String phoneCaptcha;

    @Override
    protected int getLayout() {

        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_register;
    }

    @Override
    protected void initEventAndData() {
        id = getIntent().getStringExtra("uid");
        type = getIntent().getStringExtra("type");
        tvWanfangProtocol.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvWanfangProtocol.getPaint().setAntiAlias(true);
        tvToLogin.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvToLogin.getPaint().setAntiAlias(true);
        editUserName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus && editUserName.getText().length() < 6) {
                    ToastUtil.show("用户名不能小于6位，大于16位");
                }
            }
        });
    }


    @OnClick({R.id.tv_return, R.id.tv_wanfang_protocol, R.id.btn_register, R.id.tv_to_login, R.id.tv_get_code})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_wanfang_protocol:
                WebViewActivity.startThisFromActivity(RegisterActivity.this, "http://login.wanfangdata.com.cn/Agreement.aspx", "万方数据网络用户服务协议", "1");
                break;
            case R.id.btn_register:
                userName = editUserName.getText().toString();
                phone = editPhonenum.getText().toString();
                passWord = editPassword.getText().toString();
                code = editSecurity.getText().toString();
                if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(userName.trim())) {
                    if (!TextUtils.isEmpty(passWord) && !TextUtils.isEmpty(passWord.trim())) {
                        if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(phone.trim())) {
                            if (AppUtil.isMobileNO(phone.trim())) {
                                if (!TextUtils.isEmpty(code) && !TextUtils.isEmpty(code.trim()) && code.trim().equals(phoneCaptcha)) {
                                    checkUsername(userName.trim(), passWord.trim(), phone.trim(), code.trim());

                                } else {
                                    ToastUtil.show("请输入正确的验证码");
                                }
                            } else {
                                ToastUtil.show("请输入正确的手机号码");
                            }
                        } else {
                            ToastUtil.show("用户手机号码不能为空");
                        }
                    } else {
                        ToastUtil.show("用户密码不能为空");
                    }
                } else {
                    ToastUtil.show("用户名不能为空");
                }

                break;
            case R.id.tv_to_login:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_get_code:
                phone = editPhonenum.getText().toString();
                if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(phone.trim())) {
                    if (AppUtil.isMobileNO(phone.trim())) {

                        checkExist(phone.trim());

                    } else {
                        ToastUtil.show("请输入正确的手机号码");
                    }
                } else {
                    ToastUtil.show("请输入手机号码");
                }
                break;

        }
    }

    private void checkUsername(final String userName, final String passWord, final String phone, final String code) {
        Single.create(new SingleOnSubscribe<CheckUserNameIsExistResponse>() {
            @Override
            public void subscribe(SingleEmitter<CheckUserNameIsExistResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                CheckUserNameIsExistRequest checkPhoneIsExistRequest = CheckUserNameIsExistRequest.newBuilder().setUserName(userName).build();
                CheckUserNameIsExistResponse response = stub.checkUserNameIsExist(checkPhoneIsExistRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CheckUserNameIsExistResponse>() {
            @Override
            public void onSuccess(CheckUserNameIsExistResponse checkPhoneIsExistResponse) {
                Log.d(TAG, "onSuccess: " + checkPhoneIsExistResponse.toString());
                if (checkPhoneIsExistResponse.getIsExist()) {
                    ToastUtil.show("该用户名已经存在");
                } else {

                    register(userName, passWord, phone, code);
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器错误");
            }
        });
    }

    private void checkExist(final String trim) {
        Single.create(new SingleOnSubscribe<CheckPhoneIsExistResponse>() {
            @Override
            public void subscribe(SingleEmitter<CheckPhoneIsExistResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                CheckPhoneIsExistRequest checkPhoneIsExistRequest = CheckPhoneIsExistRequest.newBuilder().setPhoneNumber(trim).build();
                CheckPhoneIsExistResponse response = stub.checkPhoneIsExist(checkPhoneIsExistRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CheckPhoneIsExistResponse>() {
            @Override
            public void onSuccess(CheckPhoneIsExistResponse checkPhoneIsExistResponse) {
                Log.d(TAG, "onSuccess: " + checkPhoneIsExistResponse.toString());
                if (checkPhoneIsExistResponse.getIsExist()) {
                    ToastUtil.show("该手机已经注册过");
                } else {
                    if (PreferencesHelper.CheckSmsTen()) {
                        get_Code(phone.trim());
                    } else {
                        ToastUtil.shortShow("发送验证短信已超过数量限制");
                    }

                    startTimeing();
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器错误");
            }
        });
    }

    private void register(final String userName, final String passWord, final String phone, final String code) {


        Single.create(new SingleOnSubscribe<RegistResponse>() {
            @Override
            public void subscribe(SingleEmitter<RegistResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                RegistRequest registRequest = RegistRequest.newBuilder().setPassword(passWord.trim()).setPhone(phone.trim()).
                        setUserName(userName.trim()).build();
                RegistResponse response = stub.regist(registRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<RegistResponse>() {
            @Override
            public void onSuccess(RegistResponse registResponse) {
                Log.d(TAG, "onSuccess: " + registResponse.toString());
                if (!registResponse.hasError()) {
                    ToastUtil.show("注册成功");
                    JmessageRegister(userName);
                    if (!TextUtils.isEmpty(id)) {
                        bindAccount(userName, passWord);
                    } else {
                        Accountlogin(userName, passWord);
                    }

                } else {
                    ToastUtil.show(registResponse.getError().getErrorMessage().getErrorReason());
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器错误");
            }
        });
    }

    private void Accountlogin(final String useName, final String passWord) {
        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                LoginRequest request = LoginRequest.newBuilder().setUserName(useName).setPassword(passWord).build();
                LoginResponse response = stub.login(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                if (response.hasError()) {
                    ToastUtil.shortShow("登录失败");
                } else {
                    PreferencesHelper.storeLoginInfo(response, passWord);
                    PreferencesHelper.setLoginMethod("0");
                    PreferencesHelper.setLoginState(true);
                    RxBus.getDefault().post("bindSuccess");
                    finish();
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());

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

    private void startTimeing() {
        tvGetCode.setEnabled(false);
        Message message = new Message();
        message.what = 0;
        handler.sendMessage(message);
    }

    private void get_Code(final String phone) {
        phoneCaptcha = SystemUtil.getRandomSixNum();
        Single.create(new SingleOnSubscribe<GetPhoneCaptchaResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetPhoneCaptchaResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                GetPhoneCaptchaRequest request = GetPhoneCaptchaRequest.newBuilder().setPhoneNumber(phone).setNation("0086").setMessageType("Register").setPhoneCaptcha(phoneCaptcha).build();
                GetPhoneCaptchaResponse response = stub.getPhoneCaptcha(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GetPhoneCaptchaResponse>() {
            @Override
            public void onSuccess(GetPhoneCaptchaResponse response) {
                Log.d(TAG, "onSuccess: " + response.getStatus());
                if (response.getStatus() == 200) {
                    ToastUtil.show("发送成功");
                    PreferencesHelper.putCurrentTime();
                } else {
                    ToastUtil.show("发送失败");
                }


            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("服务器异常");
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void login(final String passWord) {
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

                    if (TextUtils.isEmpty(userRolesListResponse.getLoginToken())) {
                        ToastUtil.show("访问失败");
                    } else {
                        PreferencesHelper.storeLoginInfo(userRolesListResponse, passWord);
                        PreferencesHelper.setLoginMethod("0");
                        ToastUtil.show("绑定成功");
                        RxBus.getDefault().post("bindSuccess");

                        PreferencesHelper.setLoginState(true);
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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeMessages(0);
        }

    }
}

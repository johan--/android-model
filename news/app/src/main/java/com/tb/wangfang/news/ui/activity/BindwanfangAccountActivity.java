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
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.BindExistAccountRequest;
import com.wanfang.personal.LoginDeviceType;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.ThirdPartyType;

import java.io.File;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
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
        if (type.equals("0")) {
            thirdPartyType = ThirdPartyType.WECHAT;
        } else if (type.equals("1")) {
            thirdPartyType = ThirdPartyType.QQ;
        } else if (type.equals("3")) {
            thirdPartyType = ThirdPartyType.SINA;
        }
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
                        bindAccount(account, passWord);
                    } else {
                        ToastUtil.show("请输入密码");
                    }
                } else {
                    ToastUtil.show("请输入账号");
                }
                bindAccount(account, passWord);
                break;
        }
    }

    private void bindAccount(final String account, final String passWord) {

        Single.create(new SingleOnSubscribe<LoginResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                BindExistAccountRequest request = BindExistAccountRequest.newBuilder().setUid(id).setThirdPartyType(thirdPartyType).setUserName(account).setPassword(passWord)
                        .setDeviceId(SystemUtil.getDeviceId(BindwanfangAccountActivity.this)).setDeviceType(LoginDeviceType.ANDROID).build();
                LoginResponse response = stub.bindExistAccount(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                JMessageLogin(response);
                preferencesHelper.storeLoginInfo(response);
                preferencesHelper.setLoginState(true);
                RxBus.getDefault().post(new String("bindSuccess"));
                finish();
            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                ToastUtil.show("服务器异常");

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
                        preferencesHelper.setUserAvatar(avatarFile.getAbsolutePath());
                    } else {
                        preferencesHelper.setUserAvatar(null);
                    }
                    ToastUtil.show("登录成功");
                } else {
                    ToastUtil.show("登录失败");
                }
            }
        });
    }
}

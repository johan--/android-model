package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.bind.WFCardBindRequest;
import com.wanfang.bind.WFCardBindResponse;
import com.wanfang.bind.WFCardBindServiceGrpc;

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

public class BindCardActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.edit_account)
    AppCompatEditText editAccount;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    private MaterialDialog mdialog;
    private String TAG = "BindCardActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_bind_card;
    }

    @Override
    protected void initEventAndData() {

    }


    @OnClick({R.id.tv_return, R.id.btn_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.btn_login:
                String account = editAccount.getText().toString();
                String passWord = editPassword.getText().toString();
//                String graphCode = editGraphCode.getText().toString();
                if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(account.trim())) {
                    if (!TextUtils.isEmpty(passWord) && !TextUtils.isEmpty(passWord.trim())) {
//                            if (!TextUtils.isEmpty(graphCode) && !TextUtils.isEmpty(graphCode.trim())) {
//                                if (graphCode.equals(CodeUtils.getInstance().getCode())) {
                        mdialog = new MaterialDialog.Builder(this)
                                .title("绑定中")
                                .progress(true, 0)
                                .progressIndeterminateStyle(true)
                                .show();
                        bind(account, passWord);
//                                } else {
//                                    ToastUtil.show("图形码不正确，请重新输入");
//                                }
//                            } else {
//                                ToastUtil.show("请输入图形验证码");
//                            }
                    } else {
                        ToastUtil.show("请输入密码");
                    }
                } else {
                    ToastUtil.show("请输入账号");
                }
                break;
        }
    }

    private void bind(final String account, final String passWord) {
        Single.create(new SingleOnSubscribe<WFCardBindResponse>() {
            @Override
            public void subscribe(SingleEmitter<WFCardBindResponse> e) throws Exception {

                WFCardBindServiceGrpc.WFCardBindServiceBlockingStub stub = WFCardBindServiceGrpc.newBlockingStub(managedChannel);

                WFCardBindRequest request = WFCardBindRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setLoginToken(preferencesHelper.getLoginToken())
                        .setCardNum(account).setCardPwd(passWord).build();
                WFCardBindResponse response = stub.cardBind(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<WFCardBindResponse>() {
            @Override
            public void onSuccess(WFCardBindResponse response) {
                Log.e(TAG, "onSuccess: " + response.toString());
                if (!response.hasError() && response.getStatus().equals("Success")) {
                    ToastUtil.shortShow("绑定成功");
                    finish();
                } else {
                    ToastUtil.shortShow(response.getError().getErrorMessage().getErrorReason());
                }

            }


            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.getMessage());
                ToastUtil.shortShow(" 服务器错误");

            }
        });
    }
}

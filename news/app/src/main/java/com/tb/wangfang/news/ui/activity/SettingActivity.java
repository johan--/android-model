package com.tb.wangfang.news.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.LoginOutRequest;
import com.wanfang.personal.LoginOutResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

import java.io.File;

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

import static com.tb.wangfang.news.app.Constants.TEXT_BIG_SIZE;
import static com.tb.wangfang.news.app.Constants.TEXT_SMALL_SIZE;

public class SettingActivity extends SimpleActivity {

    @BindView(R.id.tv_text_size)
    TextView tvTextSize;
    @BindView(R.id.iv_small_size)
    TextView ivSmallSize;
    @BindView(R.id.iv_mid_size)
    TextView ivMidSize;
    @BindView(R.id.iv_big_size)
    TextView ivBigSize;
    @BindView(R.id.tv_update)
    TextView tvUpdate;
    @BindView(R.id.tv_share_app)
    TextView tvShareApp;
    @BindView(R.id.tv_exit)
    TextView tvExit;

    @Inject
    ImplPreferencesHelper PreferencesHelper;
    @Inject
    ManagedChannel mManagedChannel;
    private String TAG = "SettingActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_setting;
    }


    @Override
    protected void initEventAndData() {
        float textState = PreferencesHelper.getTextSizeState();
        setUIState(textState);

    }

    private void setUIState(float textState) {
        ivSmallSize.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ivSmallSize.setBackgroundResource(R.drawable.blue_small_frame);
        ivMidSize.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ivMidSize.setBackgroundResource(R.drawable.blue_mid_frame);
        ivBigSize.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ivBigSize.setBackgroundResource(R.drawable.blue_big_frame);
        if (textState == TEXT_SMALL_SIZE) {
            ivSmallSize.setTextColor(getResources().getColor(R.color.white));
            ivSmallSize.setBackgroundResource(R.drawable.blue_small_selected);
        } else if (textState == Constants.TEXT_MID_SIZE) {
            ivMidSize.setTextColor(getResources().getColor(R.color.white));
            ivMidSize.setBackgroundResource(R.drawable.blue_mid_selected);
        } else {
            ivBigSize.setTextColor(getResources().getColor(R.color.white));
            ivBigSize.setBackgroundResource(R.drawable.blue_big_selected);
        }
    }

    public void changeTextSize(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        configuration.fontScale = Constants.TEXTVIEWSIXE; //1为标准字体，multiple为放大的倍数
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        activity.getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
        recreate();
        RxBus.getDefault().post(Constants.TEXT_SIZE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_return, R.id.tv_safety, R.id.iv_small_size, R.id.iv_mid_size, R.id.iv_big_size, R.id.tv_update, R.id.tv_share_app, R.id.tv_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_safety:
                Intent intent = new Intent(this, AccountSecurityActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_small_size:
                setUIState(TEXT_SMALL_SIZE);
                PreferencesHelper.setTextSizeState(TEXT_SMALL_SIZE);
                Constants.TEXTVIEWSIXE = TEXT_SMALL_SIZE;
                changeTextSize(this);
                break;
            case R.id.iv_mid_size:
                setUIState(Constants.TEXT_MID_SIZE);
                PreferencesHelper.setTextSizeState(Constants.TEXT_MID_SIZE);
                Constants.TEXTVIEWSIXE = Constants.TEXT_MID_SIZE;
                changeTextSize(this);
                break;
            case R.id.iv_big_size:
                setUIState(TEXT_BIG_SIZE);
                PreferencesHelper.setTextSizeState(TEXT_BIG_SIZE);
                Constants.TEXTVIEWSIXE = TEXT_BIG_SIZE;
                changeTextSize(this);
                break;
            case R.id.tv_update:
                break;
            case R.id.tv_share_app:
                break;
            case R.id.tv_exit:
                new MaterialDialog.Builder(this)
                        .content("确认退出登录吗")
                        .positiveText("同意")
                        .negativeText("取消")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                loginOut(dialog);

                            }
                        })
                        .onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                dialog.dismiss();
                            }
                        })
                        .show();

                break;
        }
    }

    private void loginOut(final MaterialDialog dialog) {
        Single.create(new SingleOnSubscribe<LoginOutResponse>() {
            @Override
            public void subscribe(SingleEmitter<LoginOutResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(mManagedChannel);
                LoginOutRequest request = LoginOutRequest.newBuilder().setUserId(PreferencesHelper.getUserId()).build();
                LoginOutResponse response = stub.loginOut(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<LoginOutResponse>() {
            @Override
            public void onSuccess(LoginOutResponse loginOutResponse) {
                dialog.dismiss();
                PreferencesHelper.setLoginState(false);
                deletePrivateCache();
                finish();
//                App.getInstance().exitApp();
            }

            @Override
            public void onError(Throwable e) {
                dialog.dismiss();
                ToastUtil.show("服务器错误");
            }
        });
    }

    private void deletePrivateCache() {
        String PrivateFolder = getFilesDir().getAbsolutePath();
        File file = new File(PrivateFolder);
        file.delete();
    }
}

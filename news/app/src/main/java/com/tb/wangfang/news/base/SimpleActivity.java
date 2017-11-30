package com.tb.wangfang.news.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.ui.activity.MainActivity;

import java.io.File;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.event.LoginStateChangeEvent;
import cn.jpush.im.android.api.model.UserInfo;
import cn.jpush.im.api.BasicCallback;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by codeest on 16/8/11.
 * 无MVP的activity基类
 */

public abstract class SimpleActivity extends SupportActivity {

    protected Activity mContext;
    private Unbinder mUnBinder;
    private MaterialDialog dialoge;
    private SharedPreferences mSPrefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        JMessageClient.registerEventReceiver(this);
        mUnBinder = ButterKnife.bind(this);
        mContext = this;
        onViewCreated();
        App.getInstance().addActivity(this);
        initEventAndData();
    }

    protected void setToolBar(Toolbar toolbar, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressedSupport();
            }
        });
    }

    protected void onViewCreated() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //注销消息接收
        JMessageClient.unRegisterEventReceiver(this);
        if (dialoge != null) {
            dialoge.dismiss();
        }
        App.getInstance().removeActivity(this);
        mUnBinder.unbind();
    }

    @Override
    public Resources getResources() {

        Resources res = super.getResources();

        Configuration config = res.getConfiguration();

        config.fontScale = Constants.TEXTVIEWSIXE;//1 设置正常字体大小的倍数

        res.updateConfiguration(config, res.getDisplayMetrics());

        return res;

    }

    protected abstract int getLayout();

    protected abstract void initEventAndData();

    public void onEventMainThread(LoginStateChangeEvent event) {

        final LoginStateChangeEvent.Reason reason = event.getReason();
        UserInfo myInfo = event.getMyInfo();
        if (myInfo != null) {
            JMessageClient.logout();
        }


        switch (reason) {


            case user_logout:
                mSPrefs = App.getInstance().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
                dialoge = new MaterialDialog.Builder(this)
                        .content("您的账号在其他设备上登陆")
                        .positiveText("重新登录")
                        .negativeText("退出").onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                JMessageClient.login(mSPrefs.getString(Constants.USER_ID, ""), "wanfangdata", new BasicCallback() {
                                    @Override
                                    public void gotResult(int responseCode, String responseMessage) {
                                        if (responseCode == 0) {
                                            Intent intent = new Intent(mContext, MainActivity.class);
                                            startActivity(intent);
                                        }
                                    }
                                });
                            }
                        }).onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                mSPrefs.edit().putBoolean(Constants.LOGIN_STATE, false).apply();
                                mSPrefs.edit().clear().apply();
                                deletePrivateCache();
                                App.getInstance().exitApp();
                            }
                        })
                        .show();


                break;
        }
    }

    private void deletePrivateCache() {
        String PrivateFolder = getFilesDir().getAbsolutePath();
        File file = new File(PrivateFolder);
        file.delete();
    }


}

package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class AccountSecurityActivity extends SimpleActivity {


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

    @Override
    protected int getLayout() {
        return R.layout.activity_account_security;
    }

    @Override
    protected void initEventAndData() {
        String oldPassword =editOldPassword.getText().toString();

    }


    @OnClick({R.id.tv_return, R.id.tv_account_bind, R.id.tv_alter_password, R.id.tv_qq_bind, R.id.tv_weichat_bind, R.id.tv_weibo_bind, R.id.btn_alter})
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
            case R.id.tv_qq_bind:
                break;
            case R.id.tv_weichat_bind:
                break;
            case R.id.tv_weibo_bind:
                break;
            case R.id.btn_alter:
                break;
        }
    }
}

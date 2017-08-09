package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends SimpleActivity {


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

    @Override
    protected int getLayout() {
        return R.layout.activity_register;
    }

    @Override
    protected void initEventAndData() {
        tvWanfangProtocol.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvWanfangProtocol.getPaint().setAntiAlias(true);
        tvToLogin.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvToLogin.getPaint().setAntiAlias(true);
    }


    @OnClick({R.id.tv_return, R.id.tv_wanfang_protocol, R.id.btn_register, R.id.tv_to_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_wanfang_protocol:
                break;
            case R.id.btn_register:
                break;
            case R.id.tv_to_login:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            
                break;
        }
    }
}

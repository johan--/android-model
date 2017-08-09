package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FindPassWordActivity1 extends SimpleActivity {


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

    @Override
    protected int getLayout() {
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
                break;
            case R.id.btn_step:
                Intent intent = new Intent(this, FindPasswordActivity2.class);
                startActivity(intent);
                this.finish();
                break;
        }
    }
}

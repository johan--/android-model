package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class FindPasswordActivity2 extends SimpleActivity {

    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    @BindView(R.id.edit_password2)
    AppCompatEditText editPassword2;
    @BindView(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_password2;
    }

    @Override
    protected void initEventAndData() {

    }


    @OnClick({R.id.tv_return, R.id.btn_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.btn_submit:
                break;
        }
    }
}

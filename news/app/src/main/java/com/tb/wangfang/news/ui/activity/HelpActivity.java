package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HelpActivity extends SimpleActivity {


    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected int getLayout() {
        return R.layout.activity_help;
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

    @OnClick({R.id.tv_return, R.id.tv_user_method, R.id.tv_question, R.id.tv_online_customer, R.id.tv_phone})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_user_method:
                break;
            case R.id.tv_question:
                Intent intent2 = new Intent(this, NormalQuestionActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_online_customer:
                Intent intent = new Intent(this, QuestionActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_phone:
                break;
        }
    }
}

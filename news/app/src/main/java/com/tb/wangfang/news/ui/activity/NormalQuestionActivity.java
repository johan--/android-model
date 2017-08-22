package com.tb.wangfang.news.ui.activity;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.OnClick;

public class NormalQuestionActivity extends SimpleActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_normal_question;
    }

    @Override
    protected void initEventAndData() {

    }

    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}

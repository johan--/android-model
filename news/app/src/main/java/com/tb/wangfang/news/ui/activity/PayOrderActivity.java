package com.tb.wangfang.news.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PayOrderActivity extends SimpleActivity {


    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_article_title)
    TextView tvArticleTitle;
    @BindView(R.id.tv_articl_name)
    TextView tvArticlName;
    @BindView(R.id.tv_price)
    TextView tvPrice;

    @Override
    protected int getLayout() {
        return R.layout.activity_pay_order;
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

    @OnClick({R.id.tv_return, R.id.btn_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                break;
            case R.id.btn_pay:
                break;
        }
    }
}

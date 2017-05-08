package com.tb.wangfang.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.presenter.MainPresenter;

import butterknife.BindView;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @BindView(R.id.tv_main)
    TextView tvMain;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            mPresenter.setNightModeState(false);
        } else {


        }
        mPresenter.getDailyData();
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }
}

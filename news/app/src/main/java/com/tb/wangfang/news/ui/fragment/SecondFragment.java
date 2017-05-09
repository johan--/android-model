package com.tb.wangfang.news.ui.fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.presenter.SecondPresenter;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View {

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second;
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
getFragmentComponent().inject(this);
    }
}
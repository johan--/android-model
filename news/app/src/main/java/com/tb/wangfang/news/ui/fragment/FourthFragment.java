package com.tb.wangfang.news.ui.fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FourthContract;
import com.tb.wangfang.news.presenter.FourthPresenter;

/**
 * Created by tangbin on 2017/5/9.
 */

public class FourthFragment extends BaseFragment<FourthPresenter> implements FourthContract.View {

    public static FourthFragment newInstance() {
        FourthFragment fragment = new FourthFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fourth;
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
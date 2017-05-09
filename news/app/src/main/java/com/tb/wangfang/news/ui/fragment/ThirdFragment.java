package com.tb.wangfang.news.ui.fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.presenter.ThirdPresenter;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {

    public static ThirdFragment newInstance() {
        ThirdFragment fragment = new ThirdFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_third;
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

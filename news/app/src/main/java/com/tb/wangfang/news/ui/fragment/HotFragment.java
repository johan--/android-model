package com.tb.wangfang.news.ui.fragment;

import android.os.Bundle;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.HotContract;
import com.tb.wangfang.news.presenter.HotPresenter;


public class HotFragment extends BaseFragment<HotPresenter> implements HotContract.View {

    public static HotFragment newInstance() {
        HotFragment fragment = new HotFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_hot;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected void initInject() {
       getFragmentComponent().inject(this);
    }
}

package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.OtherContract;
import com.tb.wangfang.news.presenter.OtherPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends BaseFragment<OtherPresenter> implements OtherContract.View {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_blank;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected void initInject() {
    getFragmentComponent().inject(this);
    }
}

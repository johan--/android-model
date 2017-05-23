package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.QuickSeeContract;
import com.tb.wangfang.news.presenter.QuickSeePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuickSeeFragment extends BaseFragment<QuickSeePresenter> implements QuickSeeContract.View {


    public QuickSeeFragment() {
        // Required empty public constructor
    }




    @Override
    protected int getLayoutId() {
        return R.layout.fragment_quick_see;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected void initInject() {
getFragmentComponent().inject(this);
    }
}

package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.widget.SearchEditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.Unbinder;
import io.grpc.ManagedChannel;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsertJournalFragment extends SimpleFragment {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.et_search)
    SearchEditText etSearch;
    @BindView(R.id.rl_sign_one)
    RelativeLayout rlSignOne;
    @BindView(R.id.rv_menu)
    RecyclerView rvMenu;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    Unbinder unbinder;


    @Override
    protected int getLayoutId() {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);
        return R.layout.fragment_insert_journal;
    }

    @Override
    protected void initEventAndData() {

    }


}

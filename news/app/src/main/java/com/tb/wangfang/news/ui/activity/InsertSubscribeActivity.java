package com.tb.wangfang.news.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.fragment.InsertJournalFragment;
import com.tb.wangfang.news.ui.fragment.InsertKeywordFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;

public class InsertSubscribeActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tl_project)
    TabLayout tlProject;
    @BindView(R.id.vp_item)
    ViewPager vpItem;
    Fragment[] fragments = new Fragment[2];
    String[] tabTitle = new String[]{"关键词", "期刊订阅"};

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_insert_subscribe;
    }

    @Override
    protected void initEventAndData() {
        tlProject.addTab(tlProject.newTab().setText(tabTitle[0]));
        tlProject.addTab(tlProject.newTab().setText(tabTitle[1]));
        fragments[0] = new InsertKeywordFragment();
        fragments[1] = new InsertJournalFragment();
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), fragments);
        tlProject.setTabMode(TabLayout.MODE_FIXED);
        vpItem.setAdapter(viewPageAdapter);
        tlProject.setupWithViewPager(vpItem);
        vpItem.setCurrentItem(0);
    }


    @OnClick({R.id.tv_return, R.id.tv_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                break;
            case R.id.tv_cancel:
                break;
        }
    }

    class ViewPageAdapter extends FragmentPagerAdapter {
        Fragment[] fragments;

        public ViewPageAdapter(FragmentManager fm, Fragment[] fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitle[position];
        }
    }
}

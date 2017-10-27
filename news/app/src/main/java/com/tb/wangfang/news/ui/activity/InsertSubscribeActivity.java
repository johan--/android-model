package com.tb.wangfang.news.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.fragment.InsertJournalFragment;
import com.tb.wangfang.news.ui.fragment.InsertKeywordFragment;
import com.tb.wangfang.news.ui.fragment.MyJournalFragment;

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
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    Fragment[] fragments = new Fragment[2];
    String[] tabTitle = new String[]{"关键词", "期刊订阅"};
    private String TAG = "InsertSubscribeActivity";

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
        vpItem.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 1) {
                    tvCancel.setVisibility(View.GONE);
                } else {
                    tvCancel.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!TextUtils.isEmpty(getIntent().getStringExtra("type")) && getIntent().getStringExtra("type").equals(MyJournalFragment.JOURNAL_TYPE)) {
            vpItem.setCurrentItem(1);
        }

    }

    @OnClick({R.id.tv_return, R.id.tv_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_cancel:
                finish();
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

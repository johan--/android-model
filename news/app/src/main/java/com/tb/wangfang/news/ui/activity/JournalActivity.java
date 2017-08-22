package com.tb.wangfang.news.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.fragment.JournalPeriodFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class JournalActivity extends SimpleActivity {


    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_book)
    ImageView ivBook;
    @BindView(R.id.tv_journal_name)
    TextView tvJournalName;
    @BindView(R.id.tv_label)
    TextView tvLabel;
    @BindView(R.id.tv_chinese_name)
    TextView tvChineseName;
    @BindView(R.id.tv_en_name)
    TextView tvEnName;
    @BindView(R.id.tv_national_num)
    TextView tvNationalNum;
    @BindView(R.id.tv_china_num)
    TextView tvChinaNum;
    @BindView(R.id.tv_edit_aprtment)
    TextView tvEditAprtment;
    @BindView(R.id.tv_sign_six)
    TextView tvSignSix;
    @BindView(R.id.tv_period)
    TextView tvPeriod;
    @BindView(R.id.tl_time)
    TabLayout tlTime;
    @BindView(R.id.vp_period)
    ViewPager vpPeriod;
    JournalPeriodFragment[] yearFragment;
    String[] mTabTitle;

    @Override
    protected int getLayout() {
        return R.layout.activity_journal;
    }

    @Override
    protected void initEventAndData() {

        tlTime.addTab(tlTime.newTab().setText("2017"));
        tlTime.addTab(tlTime.newTab().setText("2016"));
        tlTime.addTab(tlTime.newTab().setText("2015"));
        tlTime.addTab(tlTime.newTab().setText("2014"));
        tlTime.addTab(tlTime.newTab().setText("2013"));
        tlTime.setMinimumWidth(App.SCREEN_WIDTH / 4);
        yearFragment = new JournalPeriodFragment[5];
        mTabTitle = new String[5];
        for (int i = 0; i < 5; i++) {
            yearFragment[i] = new JournalPeriodFragment();
            mTabTitle[i] = i + 2014 + "";
        }

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), yearFragment);
        tlTime.setTabMode(TabLayout.MODE_SCROLLABLE);
        vpPeriod.setAdapter(viewPageAdapter);
        tlTime.setupWithViewPager(vpPeriod);
        vpPeriod.setCurrentItem(0);


    }

    @OnClick({R.id.tv_return, R.id.tv_order, R.id.tv_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_order:
                break;
            case R.id.tv_share:
                break;
        }
    }

    class ViewPageAdapter extends FragmentPagerAdapter {
        JournalPeriodFragment[] yearFragment;

        public ViewPageAdapter(FragmentManager fm, JournalPeriodFragment[] yearFragment) {
            super(fm);
            this.yearFragment = yearFragment;
        }

        @Override
        public Fragment getItem(int position) {
            return yearFragment[position];
        }

        @Override
        public int getCount() {
            return yearFragment.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabTitle[position];
        }
    }
}

package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.ui.fragment.MyJournalFragment;
import com.tb.wangfang.news.ui.fragment.SubscribeKeyFragment;
import com.tb.wangfang.news.widget.PopSubscribe;

import butterknife.BindView;
import butterknife.OnClick;

public class MySubscribeActivity extends SimpleActivity {


    @BindView(R.id.tl_project)
    TabLayout tlProject;
    @BindView(R.id.vp_item)
    ViewPager vpItem;
    @BindView(R.id.rl_titlebar)
    RelativeLayout rlTitleBar;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    Fragment[] fragments = new Fragment[2];
    String[] tabTitle = new String[]{"关键词", "期刊订阅"};

    @Override
    protected int getLayout() {
        return R.layout.activity_my_subscribe;
    }

    @Override
    protected void initEventAndData() {
        tlProject.addTab(tlProject.newTab().setText(tabTitle[0]));
        tlProject.addTab(tlProject.newTab().setText(tabTitle[1]));
        fragments[0] = new SubscribeKeyFragment();
        fragments[1] = new MyJournalFragment();
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), fragments);
        tlProject.setTabMode(TabLayout.MODE_FIXED);
        vpItem.setAdapter(viewPageAdapter);
        tlProject.setupWithViewPager(vpItem);
        vpItem.setCurrentItem(0);

    }

    @OnClick({R.id.iv_go_back, R.id.iv_menu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_go_back:
                finish();
                break;
            case R.id.iv_menu:
                final PopSubscribe popSubscribe = new PopSubscribe(this);
                popSubscribe.showPopupWindow(ivMenu);
                popSubscribe.getContentView().findViewById(R.id.tv_insert_subscribe).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MySubscribeActivity.this, InsertSubscribeActivity.class);
                        startActivity(intent);
                        popSubscribe.dismiss();
                    }
                });
                popSubscribe.getContentView().findViewById(R.id.tv_manage_subscribe).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MySubscribeActivity.this, ManageSubscribeActivity.class);
                        startActivity(intent);
                        popSubscribe.dismiss();
                    }
                });
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

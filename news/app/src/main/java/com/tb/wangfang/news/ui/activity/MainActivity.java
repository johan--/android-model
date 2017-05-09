package com.tb.wangfang.news.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.presenter.MainPresenter;
import com.tb.wangfang.news.ui.fragment.FirstFragment;
import com.tb.wangfang.news.ui.fragment.FourthFragment;
import com.tb.wangfang.news.ui.fragment.SecondFragment;
import com.tb.wangfang.news.ui.fragment.ThirdFragment;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.BottomBar;
import com.tb.wangfang.news.widget.BottomBarTab;

import butterknife.BindView;
import me.yokeyword.fragmentation.SupportFragment;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {
    // 再点一次退出程序时间设置
    private static final long WAIT_TIME = 2000L;
    @BindView(R.id.fl_container)
    FrameLayout flContainer;
    @BindView(R.id.bottomBar)
    BottomBar bottomBar;
    private long TOUCH_TIME = 0;
    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;
    public static final int FOURTH = 3;
    private SupportFragment[] mFragments = new SupportFragment[4];


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
//            mPresenter.setNightModeState(false);
            mFragments[FIRST] = FirstFragment.newInstance();
            mFragments[SECOND] = SecondFragment.newInstance();
            mFragments[THIRD] = ThirdFragment.newInstance();
            mFragments[FOURTH] = FourthFragment.newInstance();

            loadMultipleRootFragment(R.id.fl_container, FIRST,
                    mFragments[FIRST],
                    mFragments[SECOND],
                    mFragments[THIRD],
                    mFragments[FOURTH]);
        } else {
            mFragments[FIRST] = findFragment(FirstFragment.class);
            mFragments[SECOND] = findFragment(SecondFragment.class);
            mFragments[THIRD] = findFragment(ThirdFragment.class);
            mFragments[FOURTH] = findFragment(FourthFragment.class);

        }
        initView();
        mPresenter.getDailyData();
    }

    private void initView() {
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.addItem(new BottomBarTab(this, R.drawable.ic_action_action_search))
                .addItem(new BottomBarTab(this, R.drawable.ic_action_navigation_arrow_back))
                .addItem(new BottomBarTab(this, R.drawable.ic_action_navigation_close))
                .addItem(new BottomBarTab(this, R.drawable.ic_action_stat_share));

        bottomBar.setOnTabSelectedListener(new BottomBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, int prePosition) {
                showHideFragment(mFragments[position], mFragments[prePosition]);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {
                SupportFragment currentFragment = mFragments[position];
                int count = currentFragment.getChildFragmentManager().getBackStackEntryCount();

                // 如果不在该类别Fragment的主页,则回到主页;
//                if (count > 1) {
//                    if (currentFragment instanceof ZhihuFirstFragment) {
//                        currentFragment.popToChild(FirstHomeFragment.class, false);
//                    } else if (currentFragment instanceof ZhihuSecondFragment) {
//                        currentFragment.popToChild(ViewPagerFragment.class, false);
//                    } else if (currentFragment instanceof ZhihuThirdFragment) {
//                        currentFragment.popToChild(ShopFragment.class, false);
//                    } else if (currentFragment instanceof ZhihuFourthFragment) {
//                        currentFragment.popToChild(MeFragment.class, false);
//                    }
//                    return;
//                }



            }
        });
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
        getActivityComponent().inject(this);
    }

    @Override
    public void onBackPressedSupport() {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            finish();
        } else
            TOUCH_TIME = System.currentTimeMillis();
        ToastUtil.show(getString(R.string.press_again_exit));
    }

}

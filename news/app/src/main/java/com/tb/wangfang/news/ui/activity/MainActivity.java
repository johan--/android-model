package com.tb.wangfang.news.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.component.UpdateService;
import com.tb.wangfang.news.presenter.MainPresenter;
import com.tb.wangfang.news.ui.fragment.FirstFragment;
import com.tb.wangfang.news.ui.fragment.FourthFragment;
import com.tb.wangfang.news.ui.fragment.SecondFragment;
import com.tb.wangfang.news.ui.fragment.ThirdFragment;
import com.tbruyelle.rxpermissions2.RxPermissions;

import butterknife.BindView;
import butterknife.OnClick;
import me.yokeyword.fragmentation.SupportFragment;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    // Used to load the 'native-lib' library on application startup.

    // 再点一次退出程序时间设置
    private static final long WAIT_TIME = 2000L;
    @BindView(R.id.tv_home)
    TextView tvHome;
    @BindView(R.id.tv_find)
    TextView tvFind;
    @BindView(R.id.tv_focus)
    TextView tvFocus;
    @BindView(R.id.tv_me)
    TextView tvMe;
    @BindView(R.id.main_vp)
    ViewPager mainVp;


    private long TOUCH_TIME = 0;
    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;
    public static final int FOURTH = 3;
    private SupportFragment[] mFragments = new SupportFragment[4];
    private int preSelected = 0;
    private String TAG = "MainActivity";

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//            mPresenter.setNightModeState(false);
        mFragments[FIRST] = FirstFragment.newInstance();
        mFragments[SECOND] = SecondFragment.newInstance();
        mFragments[THIRD] = ThirdFragment.newInstance();
        mFragments[FOURTH] = FourthFragment.newInstance();
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), mFragments);
        mainVp.setAdapter(adapter);

        initView();
    }

    private void initView() {

    }

    @Override
    protected void initEventAndData() {
        checkPermissions();
    }

    @Override
    public void showUpdateDialog(String versionContent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("检测到新版本!");
        builder.setMessage(versionContent);
        builder.setNegativeButton("取消", null);
        builder.setPositiveButton("马上更新", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                checkPermissions();
            }
        });
        builder.show();
    }

    private void checkPermissions() {
        mPresenter.checkPermissions(new RxPermissions(this));
    }

    @Override
    public void startDownloadService() {
        startService(new Intent(mContext, UpdateService.class));
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void onBackPressedSupport() {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            finish();
        } else {
            TOUCH_TIME = System.currentTimeMillis();
            Toast.makeText(this, R.string.press_again_exit, Toast.LENGTH_SHORT).show();
        }

    }


    @OnClick({R.id.tv_home, R.id.tv_find, R.id.tv_focus, R.id.tv_me})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_home:
                mainVp.setCurrentItem(0);
                setState(0);
                preSelected = 0;
                break;
            case R.id.tv_find:
                mainVp.setCurrentItem(1);
                setState(1);
                preSelected = 1;
                break;
            case R.id.tv_focus:
                mainVp.setCurrentItem(2);
                setState(2);
                preSelected = 2;
                break;
            case R.id.tv_me:
                mainVp.setCurrentItem(3);
                setState(3);
                preSelected = 3;
                break;
        }
    }


    private void setState(int i) {
        tvHome.setTextColor(getResources().getColor(R.color.text_table));
        tvFind.setTextColor(getResources().getColor(R.color.text_table));
        tvFocus.setTextColor(getResources().getColor(R.color.text_table));
        tvMe.setTextColor(getResources().getColor(R.color.text_table));
        Drawable top1 = getResources().getDrawable(R.mipmap.mainpage_icon);
        Drawable top2 = getResources().getDrawable(R.mipmap.search_page_icon);
        Drawable top3 = getResources().getDrawable(R.mipmap.treasure_chest_icon);
        Drawable top4 = getResources().getDrawable(R.mipmap.mine_page_icon);
        tvHome.setCompoundDrawablesWithIntrinsicBounds(null, top1, null, null);
        tvFind.setCompoundDrawablesWithIntrinsicBounds(null, top2, null, null);
        tvFocus.setCompoundDrawablesWithIntrinsicBounds(null, top3, null, null);
        tvMe.setCompoundDrawablesWithIntrinsicBounds(null, top4, null, null);
        switch (i) {
            case 0:
                Drawable tops1 = getResources().getDrawable(R.mipmap.mainpage_icon_selected);
                tvHome.setCompoundDrawablesWithIntrinsicBounds(null, tops1, null, null);
                tvHome.setTextColor(getResources().getColor(R.color.text_table_selected));
                break;
            case 1:
                Drawable tops2 = getResources().getDrawable(R.mipmap.search_page_icon_selected);
                tvFind.setCompoundDrawablesWithIntrinsicBounds(null, tops2, null, null);
                tvFind.setTextColor(getResources().getColor(R.color.text_table_selected));
                break;
            case 2:
                Drawable tops3 = getResources().getDrawable(R.mipmap.treasure_chest_icon_selected);
                tvFocus.setCompoundDrawablesWithIntrinsicBounds(null, tops3, null, null);
                tvFocus.setTextColor(getResources().getColor(R.color.text_table_selected));
                break;
            case 3:
                Drawable tops4 = getResources().getDrawable(R.mipmap.mine_page_selected);
                tvMe.setCompoundDrawablesWithIntrinsicBounds(null, tops4, null, null);
                tvMe.setTextColor(getResources().getColor(R.color.text_table_selected));
                break;
        }
    }

    public class FragAdapter extends FragmentPagerAdapter {

        private SupportFragment[] mFragments;

        public FragAdapter(FragmentManager fm, SupportFragment[] fragments) {
            super(fm);
            // TODO Auto-generated constructor stub
            mFragments = fragments;
        }

        @Override
        public SupportFragment getItem(int arg0) {
            // TODO Auto-generated method stub
            return mFragments[arg0];
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return mFragments.length;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (mFragments[FOURTH]!=null){
            mFragments[FOURTH].onActivityResult(requestCode, resultCode, data);
        }

    }
}

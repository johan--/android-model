package com.tb.wangfang.news.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.push.HuaweiPush;
import com.huawei.hms.support.api.push.TokenResult;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.MainContract;
import com.tb.wangfang.news.component.UpdateService;
import com.tb.wangfang.news.presenter.MainPresenter;
import com.tb.wangfang.news.ui.fragment.FirstFragment;
import com.tb.wangfang.news.ui.fragment.FourthFragment;
import com.tb.wangfang.news.ui.fragment.SecondFragment;
import com.tb.wangfang.news.ui.fragment.ThirdFragment;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;

import butterknife.BindView;
import butterknife.OnClick;
import me.yokeyword.fragmentation.SupportFragment;

import static com.huawei.hms.activity.BridgeActivity.EXTRA_RESULT;


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

    private long TOUCH_TIME = 0;
    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;
    public static final int FOURTH = 3;
    private static final int REQUEST_HMS_RESOLVE_ERROR = 1000;
    private SupportFragment[] mFragments = new SupportFragment[4];

    private String TAG = "MainActivity";
    private HuaweiApiClient mClient;
    private int prePosition = 0;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (SystemUtil.getSystem().equals(SystemUtil.SYS_EMUI)) {
            initHuaweiPush(this);
        }
        if (savedInstanceState == null) {
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

        mPresenter.reLogin();
        initView();



//        mPresenter.restorePersonnalMappingTable();
    }


    private void initView() {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: " + event.toString());
        return super.onTouchEvent(event);
    }

    private void initHuaweiPush(Context context) {
        mClient = new HuaweiApiClient.Builder(context)
                .addApi(HuaweiPush.PUSH_API)
                .addConnectionCallbacks(new HuaweiApiClient.ConnectionCallbacks() {
                    @Override
                    public void onConnected() {
                        getTokenSync();
                        Log.e(TAG, "HUAWEI onConnected, IsConnected: " + mClient.isConnected());

                    }

                    @Override
                    public void onConnectionSuspended(final int i) {
                        if (!MainActivity.this.isDestroyed() && !MainActivity.this.isFinishing()) {
                            mClient.connect();
                        }
                        Log.e(TAG, "HUAWEI onConnectionSuspended, cause: " + i + ", IsConnected:" +
                                " " +
                                mClient.isConnected());
                    }
                })
                .addOnConnectionFailedListener(new HuaweiApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull final ConnectionResult
                                                           connectionResult) {

                        Log.i(TAG, "HuaweiApiClient连接失败，错误码：" + connectionResult.getErrorCode());
                        if (HuaweiApiAvailability.getInstance().isUserResolvableError(connectionResult.getErrorCode())) {
                            final int errorCode = connectionResult.getErrorCode();
                            new Handler(getMainLooper()).post(new Runnable() {
                                @Override
                                public void run() {
                                    // 此方法必须在主线程调用
                                    HuaweiApiAvailability.getInstance().resolveError(MainActivity.this, errorCode, REQUEST_HMS_RESOLVE_ERROR);
                                }
                            });
                        } else {
                            //其他错误码请参见开发指南或者API文档
                        }
                    }
                })
                .build();
        mClient.connect();
    }

    /**
     * 使用同步接口来获取pushtoken
     * 结果通过广播的方式发送给应用，不通过标准接口的pendingResul返回
     * CP可以自行处理获取到token
     * 同步获取token和异步获取token的方法CP只要根据自身需要选取一种方式即可
     */
    private void getTokenSync() {
        if (!mClient.isConnected()) {
            Log.i(TAG, "获取token失败，原因：HuaweiApiClient未连接");
            mClient.connect();
            return;
        }

        //需要在子线程中调用函数
        new Thread() {

            public void run() {
                Log.i(TAG, "同步接口获取push token");
                PendingResult<TokenResult> tokenResult = HuaweiPush.HuaweiPushApi.getToken(mClient);
                TokenResult result = tokenResult.await();
                if (result.getTokenRes().getRetCode() == 0) {
                    //当返回值为0的时候表明获取token结果调用成功
                    Log.i(TAG, "获取push token 成功，等待广播");
                }
            }
        }.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mClient != null) {
            mClient.connect();
        }

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
    public void restart() {
        recreate();
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

                setState(0);
                showHideFragment(mFragments[0], mFragments[prePosition]);
                prePosition = 0;
                break;
            case R.id.tv_find:

                setState(1);
                showHideFragment(mFragments[1], mFragments[prePosition]);
                prePosition = 1;
                break;
            case R.id.tv_focus:

                setState(2);
                showHideFragment(mFragments[2], mFragments[prePosition]);
                prePosition = 2;
                break;
            case R.id.tv_me:

                setState(3);
                showHideFragment(mFragments[3], mFragments[prePosition]);
                prePosition = 3;
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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (mFragments[FOURTH] != null) {
            mFragments[FOURTH].onActivityResult(requestCode, resultCode, data);
        }
        if (requestCode == REQUEST_HMS_RESOLVE_ERROR) {
            if (resultCode == Activity.RESULT_OK) {

                int result = data.getIntExtra(EXTRA_RESULT, 0);

                if (result == ConnectionResult.SUCCESS) {
                    Log.i(TAG, "错误成功解决");
                    if (!mClient.isConnecting() && !mClient.isConnected()) {
                        mClient.connect();
                    }
                } else if (result == ConnectionResult.CANCELED) {
                    Log.i(TAG, "解决错误过程被用户取消");
                } else if (result == ConnectionResult.INTERNAL_ERROR) {
                    Log.i(TAG, "发生内部错误，重试可以解决");
                    //CP可以在此处重试连接华为移动服务等操作，导致失败的原因可能是网络原因等
                } else {
                    Log.i(TAG, "未知返回码");
                }
            } else {
                Log.i(TAG, "调用解决方案发生错误");
            }
        }


    }
}

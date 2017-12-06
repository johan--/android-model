package com.tb.wangfang.news.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.bean.JournalDetailBean;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.fragment.JournalPeriodFragment;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.subscribe.CancelSubscribeRequest;
import com.wanfang.subscribe.CancelSubscribeResponse;
import com.wanfang.subscribe.CancelSubscribeType;
import com.wanfang.subscribe.CheckPerioISSubscribeResponse;
import com.wanfang.subscribe.CheckPerioISSubscribedRequest;
import com.wanfang.subscribe.SubscribePerioRequest;
import com.wanfang.subscribe.SubscribePerioResponse;
import com.wanfang.subscribe.SubscribeServiceGrpc;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.sharesdk.onekeyshare.OnekeyShare;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;

import static com.tb.wangfang.news.R.id.tv_order;
import static com.tb.wangfang.news.app.Constants.SEARCH_DETAIL;

public class JournalActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_book)
    ImageView ivBook;
    @BindView(R.id.tv_journal_name)
    TextView tvJournalName;
    //    @BindView(R.id.tv_label)
//    TextView tvLabel;
    @BindView(R.id.tv_national_num)
    TextView tvNationalNum;
    @BindView(R.id.tv_china_num)
    TextView tvChinaNum;
    @BindView(R.id.tv_sign_six)
    TextView tvSignSix;
    @BindView(R.id.tv_period)
    TextView tvPeriod;
    @BindView(R.id.tl_time)
    TabLayout tlTime;
    @BindView(R.id.vp_period)
    ViewPager vpPeriod;
    @BindView(R.id.tv_more)
    TextView tvMore;
    JournalPeriodFragment[] yearFragment;
    String[] mTabTitle;
    @BindView(R.id.tv_order)
    TextView tvOrder;
    @BindView(R.id.ll_sign_one)
    LinearLayout llSignOne;
    @BindView(R.id.ll_label)
    LinearLayout llLabel;
    private MaterialDialog dialog;
    private String journalId;
    private String TAG = "JournalActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_journal;
    }

    @Override
    protected void initEventAndData() {
        journalId = getIntent().getStringExtra(Constants.ARTICLE_ID);
        dialog = new MaterialDialog.Builder(this).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();

        checkIsSubscribed();
        getDetail();


    }

    private void checkIsSubscribed() {
        final String userId = preferencesHelper.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return;
        }
        Single.create(new SingleOnSubscribe<CheckPerioISSubscribeResponse>() {
            @Override
            public void subscribe(SingleEmitter<CheckPerioISSubscribeResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                CheckPerioISSubscribedRequest request = CheckPerioISSubscribedRequest.newBuilder().setUserId(userId).setPerioId(journalId).build();
                CheckPerioISSubscribeResponse response = stub.checkIsSubscribed(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<CheckPerioISSubscribeResponse>() {
                    @Override
                    public void onSuccess(CheckPerioISSubscribeResponse response) {
                        Log.d(TAG, "onSuccess: " + response.toString());
                        tvOrder.setVisibility(View.VISIBLE);
                        if (response.getIsSubscribed()) {
                            tvOrder.setText("取消订阅");
                        } else {
                            tvOrder.setText("订阅");
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });
    }

    private void unSubscribe() {
        Single.create(new SingleOnSubscribe<CancelSubscribeResponse>() {
            @Override
            public void subscribe(SingleEmitter<CancelSubscribeResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                CancelSubscribeRequest request = CancelSubscribeRequest.newBuilder().setUserId(preferencesHelper.getUserId())
                        .setSubscribeId(journalId).setCancelType(CancelSubscribeType.DeletePerio).build();
                CancelSubscribeResponse response = stub.cancelSubscribe(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<CancelSubscribeResponse>() {
                    @Override
                    public void onSuccess(CancelSubscribeResponse response) {
                        Log.d(TAG, "onSuccess: " + response.toString());
                        if (response.getCancelSubscribeSuccess()) {
                            ToastUtil.show("取消订阅成功");
                            tvOrder.setText("订阅");
                        } else {
                            ToastUtil.show("取消订阅订阅失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });
    }

    private void subscribe() {
        Single.create(new SingleOnSubscribe<SubscribePerioResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioRequest request = SubscribePerioRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPerioId(journalId).build();
                SubscribePerioResponse response = stub.subscribePerio(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubscribePerioResponse>() {
                    @Override
                    public void onSuccess(SubscribePerioResponse subjectListResponse) {
                        Log.d(TAG, "onSuccess: " + subjectListResponse.toString());
                        if (subjectListResponse.getSubscribeSuccess()) {
                            ToastUtil.show("订阅成功");
                            tvOrder.setText("取消订阅");
                        } else {
                            ToastUtil.show("订阅失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });

    }

    private void getDetail() {
        dialog.show();
        OkHttpUtils.get().url(SEARCH_DETAIL).addParams("params", journalId).addParams("clstype", "periodical_info").build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                        ToastUtil.show("服务器异常");
                        llSignOne.setVisibility(View.VISIBLE);
                        dialog.dismiss();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.d(TAG, "onResponse: " + response);
                        Gson gson = new Gson();
                        JournalDetailBean bean = gson.fromJson(response, JournalDetailBean.class);
                        showDetail(bean);
                        initYearItem(bean);
                        dialog.dismiss();
                        llSignOne.setVisibility(View.VISIBLE);
                        initDialog(bean);


                    }
                });
    }

    private void initYearItem(JournalDetailBean bean) {
        ArrayList<JournalDetailBean.CommonYearBean> years = new ArrayList<>();
        if (bean.getCommon_year() != null && bean.getCommon_year().size() > 0) {
            for (int i = 0; i < bean.getCommon_year().size(); i++) {
                if (!bean.getCommon_year().get(i).getPId().equals("-1")) {
                    years.add(bean.getCommon_year().get(i));
                }
            }
            if (years.size() < 4) {
                tlTime.setMinimumWidth(App.SCREEN_WIDTH / years.size());
                tlTime.setTabMode(TabLayout.MODE_SCROLLABLE);
            } else {
                tlTime.setTabMode(TabLayout.MODE_SCROLLABLE);
                tlTime.setMinimumWidth(App.SCREEN_WIDTH / 4);
            }

            yearFragment = new JournalPeriodFragment[years.size()];
            mTabTitle = new String[years.size()];
            for (int i = 0; i < years.size(); i++) {
                tlTime.addTab(tlTime.newTab().setText(SystemUtil.getStringFromJsonarray(years.get(i).getShowName())));
                yearFragment[i] = new JournalPeriodFragment();
                yearFragment[i].setYear(SystemUtil.getStringFromJsonarray(years.get(i).getShowName()));
                yearFragment[i].setJournalId(journalId);
                mTabTitle[i] = SystemUtil.getStringFromJsonarray(years.get(i).getShowName());
            }
            ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), yearFragment);
            vpPeriod.setAdapter(viewPageAdapter);
            tlTime.setupWithViewPager(vpPeriod);
            vpPeriod.setCurrentItem(0);
        }


    }

    private void initDialog(JournalDetailBean bean) {
        dialog = new MaterialDialog.Builder(this)
                .customView(R.layout.journal_article_dialog, true)
                .positiveText("关闭")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                                @Override
                                public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                    dialog.dismiss();
                                }
                            }
                )
                .build();
        TextView tv_chiness_name = (TextView) dialog.findViewById(R.id.tv_chiness_name);
        TextView tv_english_name = (TextView) dialog.findViewById(R.id.tv_english_name);
        TextView tv_edit_aprtment = (TextView) dialog.findViewById(R.id.tv_edit_aprtment);
        TextView tv_international_num = (TextView) dialog.findViewById(R.id.tv_international_num);
        TextView tv_china_num = (TextView) dialog.findViewById(R.id.tv_china_num);
        TextView tv_period = (TextView) dialog.findViewById(R.id.tv_period);

        if (bean != null && bean.getData() != null && bean.getData().size() > 0) {
            tv_chiness_name.setText(bean.getData().get(0).getPerio_title02().toString());
            tv_english_name.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPinyin_title()));
            tv_edit_aprtment.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getEf_name()));
            tv_international_num.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getIssn()));
            tv_china_num.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getCn()));
            tv_period.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPublish_cycle()));
        }
    }

    private void showDetail(JournalDetailBean bean) {
        String imgUrl = "http://new.wanfangdata.com.cn/images/PeriodicalImages/" + journalId + "/" + journalId + ".jpg";
        Glide.with(this).load(imgUrl).into(ivBook);
        if (bean != null && bean.getData() != null && bean.getData().size() > 0) {
            tvTitle.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPerio_title02()));
            tvJournalName.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPerio_title02()));
            tvNationalNum.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getIssn()));
            tvChinaNum.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getCn()));
            tvPeriod.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPublish_cycle()));
            String corePeriostring = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getCore_perio());
            String[] corePerios = corePeriostring.split(" ");
            for (int i = 0; i < corePerios.length; i++) {
                LinearLayout.LayoutParams params = new AppBarLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.setMargins(SystemUtil.dp2px(2), 0, 0, 0);
                TextView textView = new TextView(this);
                textView.setTextSize(10);
                textView.setPadding(SystemUtil.dp2px(2), SystemUtil.dp2px(2), SystemUtil.dp2px(2), SystemUtil.dp2px(2));
                textView.setTextColor(getResources().getColor(R.color.white));
                textView.setLayoutParams(params);
                if (corePerios[i].equals("北大核心")) {
                    textView.setBackgroundResource(R.mipmap.source_bdhx_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("CSSCI")) {
                    textView.setBackgroundResource(R.mipmap.source_cssci_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("ESTPCD")) {
                    textView.setBackgroundResource(R.mipmap.source_cstpcd_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("EI")) {
                    textView.setBackgroundResource(R.mipmap.source_ei_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("ISTIC")) {
                    textView.setBackgroundResource(R.mipmap.source_istic_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("NJU")) {
                    textView.setBackgroundResource(R.mipmap.source_nju_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("PKU")) {
                    textView.setBackgroundResource(R.mipmap.pku_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("SCI")) {
                    textView.setBackgroundResource(R.mipmap.source_sci_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("CSSCI")) {
                    textView.setBackgroundResource(R.mipmap.source_cssci_icon);
                    llLabel.addView(textView);
                } else if (corePerios[i].equals("CSTPCD")) {
                    textView.setBackgroundResource(R.mipmap.source_cstpcd_icon);
                    llLabel.addView(textView);
                }

            }


        }


    }

    @OnClick({R.id.tv_return, tv_order, R.id.tv_share, R.id.tv_more})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case tv_order:
                if (tvOrder.getText().toString().equals("订阅")) {
                    subscribe();
                } else {
                    unSubscribe();
                }
                break;
            case R.id.tv_share:
                showShare();
                break;
            case R.id.tv_more:
                dialog.show();
                break;
        }
    }

    private void showShare() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // 分享时Notification的图标和文字  2.5.9以后的版本不     调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle("分享");
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

        // 启动分享GUI
        oks.show(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
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

package com.tb.wangfang.news.ui.activity;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.alipay.sdk.app.PayTask;
import com.baidu.mobstat.StatService;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.component.RxBus;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.AuthResult;
import com.tb.wangfang.news.utils.PayResult;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.wanfang.bind.WFCardBindServiceGrpc;
import com.wanfang.bind.WFCardBlanceRequest;
import com.wanfang.bind.WfCardBlanceResponse;
import com.wanfang.personal.BALENCETYPE;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.UserGetBalenceRequest;
import com.wanfang.personal.UserGetBalenceResponse;
import com.wanfang.read.ReadResponse;
import com.wanfang.trade.AccountId;
import com.wanfang.trade.TradeServiceGrpc;
import com.wanfang.trade.UnifiedorderRequest;
import com.wanfang.trade.UnifiedorderResponse;

import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

import static com.tb.wangfang.news.R.id.btn_pay;

public class PayOrderActivity extends SimpleActivity {

    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_article_title)
    TextView tvArticleTitle;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(btn_pay)
    Button btnPay;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.tv_articl_name)
    TextView tvArticlName;
    @BindView(R.id.iv_remian_gou)
    ImageView ivRemianGou;
    @BindView(R.id.tv_remain_sum)
    TextView tvRemainSum;
    @BindView(R.id.tv_remain_insufficient)
    TextView tvRemainInsufficient;
    @BindView(R.id.iv_remain_green_gou)
    ImageView ivRemainGreenGou;
    @BindView(R.id.rl_remain)
    RelativeLayout rlRemain;
    @BindView(R.id.iv_sign_two)
    ImageView ivSignTwo;
    @BindView(R.id.iv_wanfang_gou)
    ImageView ivWanfangGou;
    @BindView(R.id.tv_wanfang_card_sum)
    TextView tvWanfangCardSum;
    @BindView(R.id.iv_wanfang_green_gou)
    ImageView ivWanfangGreenGou;
    @BindView(R.id.rl_wanfagn_card)
    RelativeLayout rlWanfagnCard;
    @BindView(R.id.iv_sign_three)
    ImageView ivSignThree;
    @BindView(R.id.rl_weichat)
    RelativeLayout rlWeichat;
    @BindView(R.id.iv_sign_four)
    ImageView ivSignFour;
    @BindView(R.id.rl_zhifubao)
    RelativeLayout rlZhifubao;
    @BindView(R.id.iv_weichat_green_gou)
    ImageView ivWeichatGreenGou;
    @BindView(R.id.iv_zhifubao_green_gou)
    ImageView ivZhifubaoGreenGou;
    private IWXAPI api;
    private ReadResponse readResponse;
    private final String TAG = "PayOrderActivity";
    private static final int SDK_PAY_FLAG = 1;
    private static final int SDK_AUTH_FLAG = 2;
    private UnifiedorderResponse unifiedorderResponse;
    String type = "";

    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SDK_PAY_FLAG: {
                    @SuppressWarnings("unchecked")
                    PayResult payResult = new PayResult((Map<String, String>) msg.obj);
                    /**
                     对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
                     */
                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息
                    String resultStatus = payResult.getResultStatus();
                    // 判断resultStatus 为9000则代表支付成功
                    if (TextUtils.equals(resultStatus, "9000")) {
                        // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
                        Toast.makeText(PayOrderActivity.this, "支付成功,请点击阅读", Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                        Toast.makeText(PayOrderActivity.this, "支付失败", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case SDK_AUTH_FLAG: {
                    @SuppressWarnings("unchecked")
                    AuthResult authResult = new AuthResult((Map<String, String>) msg.obj, true);
                    String resultStatus = authResult.getResultStatus();

                    // 判断resultStatus 为“9000”且result_c// 为“200”则代表授权成功，具体状态码代表含义可参考授权接口文档
                    if (TextUtils.equals(resultStatus, "9000") && TextUtils.equals(authResult.getResultCode(), "200")) {
                        // 获取alipay_open_id，调支付时作为参数extern_token 的value
                        // 传入，则支付账户为该授权账户
                        Toast.makeText(PayOrderActivity.this,
                                "授权成功\n" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        // 其他状态值则为授权失败
                        Toast.makeText(PayOrderActivity.this,
                                "授权失败" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT).show();

                    }
                    break;
                }
                default:
                    break;
            }
        }


    };
    private MaterialDialog materialDialog;
    private String author;
    private String journal;
    private String time;
    protected CompositeDisposable mCompositeDisposable;
    private ImageView[] iv_green_gous;

    protected void unSubscribe() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }
    }

    protected void addSubscribe(Disposable subscription) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(subscription);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unSubscribe();
    }

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);

        return R.layout.activity_pay_order;
    }

    @Override
    protected void initEventAndData() {
        iv_green_gous = new ImageView[]{ivRemainGreenGou, ivWanfangGreenGou, ivWeichatGreenGou, ivZhifubaoGreenGou};


        registerEvent();


        api = WXAPIFactory.createWXAPI(PayOrderActivity.this, Constants.APP_ID);
        api.registerApp(Constants.APP_ID);
        readResponse = (ReadResponse) getIntent().getSerializableExtra("response");
        tvArticleTitle.setText(readResponse.getTitle());
        tvPrice.setText(readResponse.getPrice());
        String s = "";
        String articleType = getIntent().getStringExtra("type");
        if (articleType.equals("perio_artical")) {
            s += "[期刊论文]";
        } else if (articleType.equals("degree_artical")) {
            s += "[学位论文]";
        } else if (articleType.equals("patent_element")) {
            s += "[专利]";
        } else if (articleType.equals("conf_artical")) {
            s += "[会议]";
        } else if (articleType.equals("standards")) {
            s += "[标准]";
        } else if (articleType.equals("legislations")) {
            s += "[法规]";
        } else if (articleType.equals("tech_result")) {
            s += "[成果]";
        }
        author = getIntent().getStringExtra("author");
        journal = getIntent().getStringExtra("journal");
        time = getIntent().getStringExtra("time");
        s += " " + author;
        s += "-" + journal + "-";
        s += time;
        tvArticlName.setText(s);
        getWalletNum();


    }

    private void getWFCardBalance() {
        Single.create(new SingleOnSubscribe<WfCardBlanceResponse>() {
            @Override
            public void subscribe(SingleEmitter<WfCardBlanceResponse> e) throws Exception {

                WFCardBindServiceGrpc.WFCardBindServiceBlockingStub stub = WFCardBindServiceGrpc.newBlockingStub(managedChannel);

                WFCardBlanceRequest request = WFCardBlanceRequest.newBuilder().setUserId(preferencesHelper.getUserId()).build();
                WfCardBlanceResponse response = stub.getWFCardBlance(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<WfCardBlanceResponse>() {
            @Override
            public void onSuccess(WfCardBlanceResponse response) {
                Log.e(TAG, "onSuccess: " + response.toString());
                if (!response.hasError()) {
                    tvWanfangCardSum.setText(response.getBlance() + "元");
                    if (Double.parseDouble(response.getBlance()) >= Double.parseDouble(readResponse.getPrice()) && ivRemainGreenGou.getVisibility() == View.GONE) {
                        selectMethod(1);
                        type = "WFChargeCard";
                    }
                }
            }


            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.getMessage());

                ToastUtil.shortShow(" 服务器错误");

            }
        });
    }


    private void getWalletNum() {
        Single.create(new SingleOnSubscribe<UserGetBalenceResponse>() {
            @Override
            public void subscribe(SingleEmitter<UserGetBalenceResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);

                UserGetBalenceRequest userGetBalenceRequest = UserGetBalenceRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setBalenceType(BALENCETYPE.NORMAL).build();
                UserGetBalenceResponse response = stub.getBalance(userGetBalenceRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UserGetBalenceResponse>() {
            @Override
            public void onSuccess(UserGetBalenceResponse userGetBalenceResponse) {
                Log.e(TAG, "onSuccess: " + userGetBalenceResponse);
                tvRemainSum.setText(userGetBalenceResponse.getBalence() + "元");
                if (userGetBalenceResponse.getBalence() >= Double.parseDouble(readResponse.getPrice())) {
                    selectMethod(0);
                    type = "Person";
                }
                getWFCardBalance();
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("访问服务器错误");
            }
        });
    }

    private void selectMethod(int i) {

        for (int j = 0; j < iv_green_gous.length; j++) {
            iv_green_gous[j].setVisibility(View.GONE);

        }
        iv_green_gous[i].setVisibility(View.VISIBLE);

    }

    private void registerEvent() {
        addSubscribe(
                RxBus.getDefault().toFlowable(String.class).subscribeWith(new DisposableSubscriber<String>() {
                    @Override
                    public void onNext(String s) {
                        Log.d(TAG, "onNext: " + s);
                        if (s.equals("pay success")) {
                            finish();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                }));

    }

    private void getOrders(final String type) {
        materialDialog = new MaterialDialog.Builder(PayOrderActivity.this).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();
        materialDialog.show();
        Single.create(new SingleOnSubscribe<UnifiedorderResponse>() {
            @Override
            public void subscribe(SingleEmitter<UnifiedorderResponse> e) throws Exception {
                TradeServiceGrpc.TradeServiceBlockingStub stub = TradeServiceGrpc.newBlockingStub(managedChannel);
                AccountId accountId = AccountId.newBuilder().setKey(preferencesHelper.getUserId()).setType(type).build();
                UnifiedorderRequest request = UnifiedorderRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setTransferOut(accountId).setSafeTransactionString(readResponse.getSafeTransactionString()).build();
                UnifiedorderResponse response = stub.unifiedorder(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UnifiedorderResponse>() {
            @Override
            public void onSuccess(UnifiedorderResponse unifiedorderResponse) {
                materialDialog.dismiss();
                Log.d(TAG, "onSuccess: " + unifiedorderResponse);
                if (type.equals("Alipay")) {
                    payByZhiFuBao(unifiedorderResponse);
                } else if (type.equals("Weixin")) {
//                    PayUtil.payWeiXin(PayOrderActivity.this, unifiedorderResponse.getPrepayId());
                    payByWeichat(unifiedorderResponse);
                } else if (type.equals("WFChargeCard") || type.equals("Person")) {
                    if (type.equals("Person")) {
                        StatService.onEvent(PayOrderActivity.this, "buy", "余额支付", 1);
                    } else {
                        StatService.onEvent(PayOrderActivity.this, "buy", "万方卡支付", 1);
                    }

                    if (unifiedorderResponse.hasError()) {
                        ToastUtil.shortShow(unifiedorderResponse.getError().getErrorMessage().getErrorReason());
                    } else {
                        ToastUtil.shortShow("支付成功,请点击阅读");
                        finish();
                    }
                }

            }

            @Override
            public void onError(Throwable e) {
                materialDialog.dismiss();
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


    private void payByZhiFuBao(UnifiedorderResponse unifiedorderResponse) {
        StatService.onEvent(PayOrderActivity.this, "buy", "支付宝支付", 1);
        final String orderInfo = unifiedorderResponse.getSign();
        Log.d(TAG, "payByZhiFuBao: " + unifiedorderResponse.getSign());
        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                PayTask alipay = new PayTask(PayOrderActivity.this);
                Map<String, String> result = alipay.payV2(orderInfo, true);
                Log.i("msp", result.toString());

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

    private void payByWeichat(UnifiedorderResponse unifiedorderResponse) {
        StatService.onEvent(PayOrderActivity.this, "buy", "微信支付", 1);
        btnPay.setEnabled(false);
        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID);
        PayReq req = new PayReq();
        req.appId = unifiedorderResponse.getAppId();
        req.partnerId = unifiedorderResponse.getPartnerId();
        req.prepayId = unifiedorderResponse.getPrepayId();
        req.nonceStr = unifiedorderResponse.getNoncestr();
        req.timeStamp = unifiedorderResponse.getTimeStamp();
        req.packageValue = unifiedorderResponse.getPackage();
        req.sign = unifiedorderResponse.getSign();
        // 在支付之前，如果应用没有注册到微信，应该先调用IWXMsg.registerApp将应用注册到微信
        api.sendReq(req);
        btnPay.setEnabled(true);
    }


    @OnClick({R.id.tv_return, R.id.rl_remain, R.id.rl_wanfagn_card, R.id.rl_weichat, R.id.rl_zhifubao, btn_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.rl_remain:
                type = "Person";
                selectMethod(0);
                break;
            case R.id.rl_wanfagn_card:

                type = "WFChargeCard";
                selectMethod(1);
                break;
            case R.id.rl_weichat:

                type = "Weixin";
                selectMethod(2);
                break;
            case R.id.rl_zhifubao:

                type = "Alipay";
                selectMethod(3);
                break;
            case btn_pay:
                getOrders(type);
                break;
        }
    }
}

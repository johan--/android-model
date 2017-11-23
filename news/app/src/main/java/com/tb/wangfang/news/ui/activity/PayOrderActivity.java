package com.tb.wangfang.news.ui.activity;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.alipay.sdk.app.PayTask;
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
import com.tb.wangfang.news.utils.PayUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
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

import static com.tb.wangfang.news.R.id.tv_articl_name;

public class PayOrderActivity extends SimpleActivity {

    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_article_title)
    TextView tvArticleTitle;
    @BindView(tv_articl_name)
    TextView tvArticlName;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(R.id.btn_pay)
    Button btnPay;
    private IWXAPI api;
    private ReadResponse readResponse;
    private final String TAG = "PayOrderActivity";
    private static final int SDK_PAY_FLAG = 1;
    private static final int SDK_AUTH_FLAG = 2;

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
                        Toast.makeText(PayOrderActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
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

                    // 判断resultStatus 为“9000”且result_code
                    // 为“200”则代表授权成功，具体状态码代表含义可参考授权接口文档
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

    @OnClick({R.id.tv_return, R.id.btn_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.btn_pay:
                materialDialog = new MaterialDialog.Builder(this)
                        .title("选择支付方式")
                        .items(R.array.payMethod)
                        .itemsCallbackSingleChoice(
                                0, new MaterialDialog.ListCallbackSingleChoice() {
                                    @Override
                                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                        if (which == 0) {
                                            getOrders("Alipay");
                                        } else if (which == 1) {
                                            getOrders("Weixin");

                                        } else if (which == 2) {
                                            getOrders("WFChargeCard");
                                        }

                                        return true;
                                    }
                                }
                        )
                        .positiveText(R.string.md_choose_label)
                        .show();

                break;
        }
    }

    private void getOrders(final String type) {
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
                Log.d(TAG, "onSuccess: " + unifiedorderResponse);
                if (unifiedorderResponse.getStatus().equals("1")) {
                    ToastUtil.show("支付成功");
                    finish();
                } else {
                    ToastUtil.show("支付失败");
                }
                if (type.equals("Alipay")) {
                    payByZhiFuBao(unifiedorderResponse);
                } else if (type.equals("Weixin")) {
                    PayUtil.payWeiXin(PayOrderActivity.this, unifiedorderResponse.getPrepayId());
//                    payByWeichat(unifiedorderResponse);
                } else {
                    PayByBalance(unifiedorderResponse);
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void PayByBalance(UnifiedorderResponse unifiedorderResponse) {


    }

    private void payByZhiFuBao(UnifiedorderResponse unifiedorderResponse) {
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
        Toast.makeText(PayOrderActivity.this, "正常调起支付", Toast.LENGTH_SHORT).show();
        // 在支付之前，如果应用没有注册到微信，应该先调用IWXMsg.registerApp将应用注册到微信
        api.sendReq(req);
        btnPay.setEnabled(true);
    }


}

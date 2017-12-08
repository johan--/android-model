package com.tb.wangfang.news.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.alipay.sdk.app.PayTask;
import com.baidu.mobstat.StatService;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.RemainChargeAdapter;
import com.tb.wangfang.news.utils.AuthResult;
import com.tb.wangfang.news.utils.PayResult;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.PopCharge;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.wanfang.bind.WFCardBindServiceGrpc;
import com.wanfang.bind.WFCardBlanceRequest;
import com.wanfang.bind.WfCardBlanceResponse;
import com.wanfang.charge.ChargeRequest;
import com.wanfang.charge.ChargeResponse;
import com.wanfang.charge.ChargeServiceGrpc;
import com.wanfang.charge.TransferIn;
import com.wanfang.personal.BALENCETYPE;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.UserGetBalenceRequest;
import com.wanfang.personal.UserGetBalenceResponse;
import com.wanfang.personal.UserGetTradeListRequest;
import com.wanfang.personal.UserGetTradeListResponse;

import java.util.ArrayList;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;


public class MyWalletActivity extends SimpleActivity implements CompoundButton.OnCheckedChangeListener {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_remain_sum)
    TextView tvRemainSum;
    @BindView(R.id.tv_wanfang_card_sum)
    TextView tvWanfangCardSum;
    @BindView(R.id.rv_item)
    RecyclerView rvItem;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
    private String TAG = "MyWalletActivity";
    private TradeListAdapter adapter;
    private ArrayList<UserGetTradeListResponse.TradeTransaction> tradeTransactions = new ArrayList<>();
    private CheckBox kZhifubao;
    private CheckBox ckWeixin;
    private String ChargeNum;
    private CheckBox ckZhifubao;
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
                        Toast.makeText(MyWalletActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
                    } else {
                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                        Toast.makeText(MyWalletActivity.this, "支付失败", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(MyWalletActivity.this,
                                "授权成功\n" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        // 其他状态值则为授权失败
                        Toast.makeText(MyWalletActivity.this,
                                "授权失败" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT).show();

                    }

                    break;
                }
                default:

                    break;
            }
        }
    };

    private IWXAPI api;
    private EditText etChargeNum;
    private RemainChargeAdapter rcAdapter;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_my_wallet;
    }

    @Override
    protected void initEventAndData() {

        StatService.onEvent(this, "qianbao", "进入目录", 1);
        rvItem.setLayoutManager(new LinearLayoutManager(this));

        adapter = new TradeListAdapter(tradeTransactions);

        rvItem.setAdapter(adapter);
//        adapter.setEmptyView(R.layout.normal_empty_layout);
        getWalletNum();
        getWFCardBalance();
        getTradeHis();

    }

    private void getWFCardBalance() {
        {
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
                    }
                }


                @Override
                public void onError(Throwable e) {
                    Log.e(TAG, "onError: " + e.getMessage());

                    ToastUtil.shortShow(" 服务器错误");

                }
            });
        }
    }

    private void getTradeHis() {
        Single.create(new SingleOnSubscribe<UserGetTradeListResponse>() {
            @Override
            public void subscribe(SingleEmitter<UserGetTradeListResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);

                UserGetTradeListRequest userGetTradeListRequest = UserGetTradeListRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setBalenceType(BALENCETYPE.NORMAL).build();
                UserGetTradeListResponse response = stub.getTradeList(userGetTradeListRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UserGetTradeListResponse>() {
            @Override
            public void onSuccess(UserGetTradeListResponse userGetBalenceResponse) {
                Log.e(TAG, "onSuccess: " + userGetBalenceResponse);
                if (userGetBalenceResponse == null || userGetBalenceResponse.getTradeTransactionList() == null || userGetBalenceResponse.getTradeTransactionList().size() == 0) {
                    rvItem.setVisibility(View.GONE);
                } else {
                    adapter.setNewData(userGetBalenceResponse.getTradeTransactionList());
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: grpc" + e.getMessage());
                ToastUtil.show("访问服务器错误");
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
                tvRemainSum.setText(userGetBalenceResponse.getBalence() + "");
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("访问服务器错误");
            }
        });
    }


    @OnClick({R.id.tv_return, R.id.btn_bind, R.id.btn_recharge})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.btn_bind:
                Intent intent = new Intent(this, BindCardActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_recharge:
                StatService.onEvent(this, "chongzhi", "点击充值", 1);
                PopCharge popCharge = new PopCharge(this);
                popCharge.showPopupWindow(tvReturn);
                RecyclerView rvCharge = (RecyclerView) popCharge.getContentView().findViewById(R.id.rv_charge);
                Button positiveAction = (Button) popCharge.getContentView().findViewById(R.id.btn_charge);
                positiveAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (rcAdapter.getSelectPoint() == -1) {
                            ToastUtil.shortShow("请选择支付金额");
                            return;
                        }
                        new MaterialDialog.Builder(MyWalletActivity.this)
                                .title("请选择充值方式")
                                .items(R.array.payMethod2)
                                .itemsCallbackSingleChoice(
                                        0, new MaterialDialog.ListCallbackSingleChoice() {
                                            @Override
                                            public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                                if (text.equals("微信")) {
                                                    Pay("Weixin");
                                                } else {
                                                    Pay("Alipay");
                                                }
                                                return true;
                                            }
                                        })
                                .positiveText("充值")
                                .show();
                    }
                });

                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
                rvCharge.setLayoutManager(gridLayoutManager);
                rcAdapter = new RemainChargeAdapter();
                rvCharge.setAdapter(rcAdapter);

                rcAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                        ChargeNum = rcAdapter.getItem(position);
                        rcAdapter.setSelectPoint(position);
                        rcAdapter.notifyDataSetChanged();
                    }
                });


                break;
        }
    }

    private void Pay(final String alipay) {
        Single.create(new SingleOnSubscribe<ChargeResponse>() {
            @Override
            public void subscribe(SingleEmitter<ChargeResponse> e) throws Exception {
                ChargeServiceGrpc.ChargeServiceBlockingStub stub = ChargeServiceGrpc.newBlockingStub(managedChannel);
                TransferIn rransferin = TransferIn.newBuilder().setType("Person").setKey(preferencesHelper.getUserId()).build();
                ChargeRequest request = ChargeRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setLoginToken(preferencesHelper.getLoginToken()).setPayType(alipay)
                        .setTurnover(ChargeNum).setTransferIn(rransferin).setProductTitle("个人账户充值").setProductDetail("个人账户充值").build();
                ChargeResponse response = stub.charge(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ChargeResponse>() {
            @Override
            public void onSuccess(ChargeResponse unifiedorderResponse) {

                Log.d(TAG, "onSuccess: " + unifiedorderResponse);
                if (alipay.equals("Alipay")) {
                    payByZhifubao(unifiedorderResponse);
                } else {
//                    PayUtil.payWeiXin(MyWalletActivity.this, unifiedorderResponse.getPrepayId());
                    payByWeixing(unifiedorderResponse);
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void payByWeixing(ChargeResponse unifiedorderResponse) {
        StatService.onEvent(this, "chongzhi", "微信充值", 1);
        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID);
        PayReq req = new PayReq();
        req.appId = unifiedorderResponse.getAppId();
        req.partnerId = unifiedorderResponse.getPartnerId();
        req.prepayId = unifiedorderResponse.getPrepayId();
        req.nonceStr = unifiedorderResponse.getNoncestr();
        req.timeStamp = unifiedorderResponse.getTimeStamp();
        req.packageValue = unifiedorderResponse.getPackage();
        req.sign = unifiedorderResponse.getSign();
        req.extData = "app data"; // optional
        Toast.makeText(MyWalletActivity.this, "正常调起支付", Toast.LENGTH_SHORT).show();
        // 在支付之前，如果应用没有注册到微信，应该先调用IWXMsg.registerApp将应用注册到微信
        api.sendReq(req);


    }

    private void payByZhifubao(ChargeResponse unifiedorderResponse) {
        StatService.onEvent(this, "chongzhi", "支付宝充值", 1);
        final String orderInfo = unifiedorderResponse.getSign();
        Log.d(TAG, "payByZhiFuBao: " + unifiedorderResponse.getSign());
        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                PayTask alipay = new PayTask(MyWalletActivity.this);
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


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (buttonView.getId() == R.id.ck_zhifubao && ckZhifubao.isChecked()) {
            ckWeixin.setChecked(false);
        }
        if (buttonView.getId() == R.id.ck_weixing && ckWeixin.isChecked()) {
            ckZhifubao.setChecked(false);
        }
    }
}

package com.tb.wangfang.news.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.wanfang.trade.TradeServiceGrpc;
import com.wanfang.trade.UnifiedorderRequest;
import com.wanfang.trade.UnifiedorderResponse;

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

public class PayOrderActivity extends SimpleActivity {

    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_article_title)
    TextView tvArticleTitle;
    @BindView(R.id.tv_articl_name)
    TextView tvArticlName;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(R.id.btn_pay)
    Button btnPay;
    private IWXAPI api;

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

    }

    @OnClick({R.id.tv_return, R.id.btn_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                break;
            case R.id.btn_pay:
                getOrders();
                break;
        }
    }

    private void getOrders() {
        Single.create(new SingleOnSubscribe<UnifiedorderResponse>() {
            @Override
            public void subscribe(SingleEmitter<UnifiedorderResponse> e) throws Exception {
                TradeServiceGrpc.TradeServiceBlockingStub stub = TradeServiceGrpc.newBlockingStub(managedChannel);
                UnifiedorderRequest request = UnifiedorderRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setSafeTransactionString("").build();
                UnifiedorderResponse response = stub.unifiedorder(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UnifiedorderResponse>() {
            @Override
            public void onSuccess(UnifiedorderResponse unifiedorderResponse) {
                payByWeichat(unifiedorderResponse);
            }

            @Override
            public void onError(Throwable e) {

            }
        });
    }

    private void payByWeichat(UnifiedorderResponse unifiedorderResponse) {
        btnPay.setEnabled(false);
        api = WXAPIFactory.createWXAPI(this, "wxb4ba3c02aa476ea1");
        PayReq req = new PayReq();
        //req.appId = "wxf8b4f85f3a794e77";  // 测试用appId
        req.appId = unifiedorderResponse.getAppId();
        req.partnerId = unifiedorderResponse.getPartnerId();
        req.prepayId = unifiedorderResponse.getPrepayId();
        req.nonceStr = unifiedorderResponse.getNoncestr();
        req.timeStamp = unifiedorderResponse.getTimeStamp();
        req.packageValue = unifiedorderResponse.getPackage();
        req.sign = unifiedorderResponse.getSign();
        req.extData = "app data"; // optional
        Toast.makeText(PayOrderActivity.this, "正常调起支付", Toast.LENGTH_SHORT).show();
        // 在支付之前，如果应用没有注册到微信，应该先调用IWXMsg.registerApp将应用注册到微信
        api.sendReq(req);
        btnPay.setEnabled(true);
    }
}

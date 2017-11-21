package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.BALENCETYPE;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.UserGetBalenceRequest;
import com.wanfang.personal.UserGetBalenceResponse;
import com.wanfang.personal.UserGetTradeListRequest;
import com.wanfang.personal.UserGetTradeListResponse;

import java.util.ArrayList;

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

public class MyWalletActivity extends SimpleActivity {
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
    private String TAG = "MyWalletActivity";
    private TradeListAdapter adapter;
    private ArrayList<UserGetTradeListResponse.TradeTransaction> tradeTransactions = new ArrayList<>();

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


        rvItem.setLayoutManager(new LinearLayoutManager(this));

        adapter = new TradeListAdapter(tradeTransactions);

        rvItem.setAdapter(adapter);
//        adapter.setEmptyView(R.layout.normal_empty_layout);
        getWalletNum();
        getTradeHis();

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
                break;
            case R.id.btn_recharge:
                break;
        }
    }
}

package com.tb.wangfang.news.ui.activity;

import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.protobuf.Any;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.MyOrderAdapter;
import com.wanfang.trade.MyOrdersRequest;
import com.wanfang.trade.MyOrdersResponse;
import com.wanfang.trade.TradeServiceGrpc;

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

public class MyOrderActivity extends SimpleActivity implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    private MyOrderAdapter myOrderAdapter;
    @BindView(R.id.rv_order)
    RecyclerView rvOrder;
    private int page = 1;
    private final int PAGE_SIZE = 20;

    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private String TAG = "MyOrderActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_my_order;
    }

    @Override
    protected void initEventAndData() {
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        rvOrder.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        myOrderAdapter = new MyOrderAdapter(null);
        myOrderAdapter.setOnLoadMoreListener(this, rvOrder);
        myOrderAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        myOrderAdapter.setPreLoadNumber(2);
        myOrderAdapter.setEmptyView(R.layout.normal_empty_layout);
        rvOrder.setAdapter(myOrderAdapter);
        myOrderAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//                Intent intent=new Intent(MyOrderActivity.this, DocDetailActivity.class);
//                intent.putExtra(Constants.ARTICLE_ID,((MyOrdersResponse.Result)adapter.getData().get(position)).get)
            }
        });
        getOrderData();
    }

    private void getOrderData() {
        swipeLayout.setEnabled(false);
        Single.create(new SingleOnSubscribe<MyOrdersResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyOrdersResponse> e) throws Exception {
                TradeServiceGrpc.TradeServiceBlockingStub stub = TradeServiceGrpc.newBlockingStub(managedChannel);
                MyOrdersRequest request = MyOrdersRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageNumber(page).setPageSize(PAGE_SIZE).build();
                MyOrdersResponse response = stub.getMyOrders(request);
                Any any = Any.newBuilder().build();
                e.onSuccess(response);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<MyOrdersResponse>() {
                    @Override
                    public void onSuccess(MyOrdersResponse myOrdersResponse) {
                        Log.d(TAG, "onSuccess: " + myOrdersResponse.getHasMore());
                        myOrderAdapter.addData(myOrdersResponse.getResultsList());
                        swipeLayout.setEnabled(true);
                        swipeLayout.setRefreshing(false);
                        myOrderAdapter.setEnableLoadMore(true);
                        myOrderAdapter.loadMoreComplete();
                        if (!myOrdersResponse.getHasMore()) {
                            myOrderAdapter.loadMoreEnd(true);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        swipeLayout.setEnabled(true);
                        myOrderAdapter.setEnableLoadMore(true);
                        swipeLayout.setRefreshing(false);
                        myOrderAdapter.loadMoreComplete();
                    }
                });
    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onRefresh() {
        myOrderAdapter.setEnableLoadMore(false);
        page = 1;
        myOrderAdapter.setNewData(null);
        getOrderData();
    }

    @Override
    public void onLoadMoreRequested() {
        swipeLayout.setEnabled(false);
        page++;
        getOrderData();
    }


}

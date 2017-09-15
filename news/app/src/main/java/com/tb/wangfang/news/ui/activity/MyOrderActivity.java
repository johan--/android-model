package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.ui.adapter.MyOrderAdapter;
import com.wanfang.personal.Any;
import com.wanfang.personal.MyOrdersRequest;
import com.wanfang.personal.MyOrdersResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

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

public class MyOrderActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    private MyOrderAdapter myOrderAdapter;
    @BindView(R.id.rv_order)
    RecyclerView rvOrder;

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
        rvOrder.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        myOrderAdapter = new MyOrderAdapter(null);
        rvOrder.setAdapter(myOrderAdapter);
        myOrderAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });
        Single.create(new SingleOnSubscribe<MyOrdersResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyOrdersResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
             MyOrdersRequest request = MyOrdersRequest.newBuilder().setUserId("tb").build();
              MyOrdersResponse response = stub.getMyOrders(request);
                Any any=Any.newBuilder().build();

                e.onSuccess(response);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<MyOrdersResponse>() {
                    @Override
                    public void onSuccess(MyOrdersResponse myOrdersResponse) {
                        myOrderAdapter.setNewData(myOrdersResponse.getResultsList());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });


    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}

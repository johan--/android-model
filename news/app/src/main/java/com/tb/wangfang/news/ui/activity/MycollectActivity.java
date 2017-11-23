package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.MyCollectAdapter;
import com.wanfang.collect.CollectBody;
import com.wanfang.collect.CollectServiceGrpc;
import com.wanfang.collect.MyCollectRequest;
import com.wanfang.collect.MyCollectResponse;

import java.util.ArrayList;
import java.util.List;

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

public class MycollectActivity extends SimpleActivity implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    MyCollectAdapter adapter;
    @BindView(R.id.rv_collect)
    RecyclerView rvCollect;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private int page = 1;
    private String TAG = "MycollectActivity";
    private ArrayList<CollectBody> arrayList;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_mycollect;
    }

    @Override
    protected void initEventAndData() {
        getMyCollect();

        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        arrayList = new ArrayList<>();
        adapter = new MyCollectAdapter(arrayList);
        adapter.setOnLoadMoreListener(this, rvCollect);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        adapter.setPreLoadNumber(10);
        rvCollect.setLayoutManager(new LinearLayoutManager(this));
        rvCollect.setAdapter(adapter);
        adapter.setEmptyView(R.layout.normal_empty_layout);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                CollectBody collectBody = (CollectBody) adapter.getData().get(position);
                Intent intent = new Intent(MycollectActivity.this, DocDetailActivity.class);
                intent.putExtra(Constants.ARTICLE_TYPE, collectBody.getDocuType());
                intent.putExtra(Constants.ARTICLE_ID, collectBody.getDocuId());
                startActivity(intent);
            }
        });
    }

    private void getMyCollect() {
        Single.create(new SingleOnSubscribe<MyCollectResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyCollectResponse> e) throws Exception {
                CollectServiceGrpc.CollectServiceBlockingStub stub = CollectServiceGrpc.newBlockingStub(managedChannel);

                MyCollectRequest request = MyCollectRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageNumber(page).setPageSize(20).build();
                MyCollectResponse response = stub.getMyCollect(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyCollectResponse>() {
            @Override
            public void onSuccess(MyCollectResponse myCollectResponse) {

                List<Any> myCollects = myCollectResponse.getResultsList();
                for (int i = 0; i < myCollects.size(); i++) {
                    Any any = myCollectResponse.getResultsList().get(i);
                    try {
                        CollectBody collectBody = any.unpack(CollectBody.class);
                        arrayList.add(collectBody);
                    } catch (InvalidProtocolBufferException e) {
                        e.printStackTrace();
                    }
                }
                adapter.setNewData(arrayList);
                swipeLayout.setEnabled(true);
                swipeLayout.setRefreshing(false);
                adapter.setEnableLoadMore(true);
                adapter.loadMoreComplete();
                if (!myCollectResponse.getHasMore()) {
                    adapter.loadMoreEnd(false);
                }
                Log.d(TAG, "onSuccess: " + myCollectResponse.getResultsList().toString());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                swipeLayout.setEnabled(true);
                adapter.setEnableLoadMore(true);
                swipeLayout.setRefreshing(false);
                adapter.loadMoreComplete();
            }
        });
    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onRefresh() {
        adapter.setEnableLoadMore(false);
        page = 1;
        adapter.setNewData(null);
        arrayList.clear();
        getMyCollect();
    }

    @Override
    public void onLoadMoreRequested() {
        swipeLayout.setEnabled(false);
        page++;
        getMyCollect();
    }
}

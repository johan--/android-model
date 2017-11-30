package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.MainPageDetailAdapter;
import com.wanfang.main.Content;
import com.wanfang.main.ContentServiceGrpc;
import com.wanfang.main.SerMainContent;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class MainDetailActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    ArrayList<String> arrayList = new ArrayList<>();
    public static final String TYPE_ONE = "0";//科技动态
    public static final String TYPE_TWO = "1";//基金会议
    public static final String TYPE_THREE = "2";//每周优选
    public static final String TYPE_FOUR = "3";//每周优选
    private String type;
    private ManagedChannel managedChannel2;
    private String TAG = "MainDetailActivity";
    private MainPageDetailAdapter adapter;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        this.managedChannel2 = ManagedChannelBuilder.forAddress("10.20.13.179", 8081)
                .usePlaintext(true)
                .build();
        return R.layout.activity_main_detail;
    }

    @Override
    protected void initEventAndData() {
        type = getIntent().getStringExtra("type");
        switch (type) {
            case TYPE_ONE:
                tvPageTitle.setText("科技动态");
                break;

            case TYPE_TWO:
                tvPageTitle.setText("基金会议");
                break;
            case TYPE_THREE:
                tvPageTitle.setText("每周优选");
                break;
            case TYPE_FOUR:
                tvPageTitle.setText("科技动态");
                break;
        }
        getData();
        adapter = new MainPageDetailAdapter(null);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Content.ContentDetail detail = (Content.ContentDetail) adapter.getData().get(position);
                WebViewActivity.startThisFromActivity(MainDetailActivity.this, detail.getUrl(), detail.getTitle(), "");
            }
        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvDetail.setAdapter(adapter);
        rvDetail.setLayoutManager(manager);

    }

    private void getData() {
        Single.create(new SingleOnSubscribe<SerMainContent.ContentResponse>() {
            @Override
            public void subscribe(SingleEmitter<SerMainContent.ContentResponse> e) throws Exception {
                ContentServiceGrpc.ContentServiceBlockingStub stub = ContentServiceGrpc.newBlockingStub(managedChannel2);
                Content.ContentRequest request = Content.ContentRequest.newBuilder().setPage(1).setPageSize(20).addCategories("最新资讯").build();
                SerMainContent.ContentResponse reply = stub.searchContent(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SerMainContent.ContentResponse>() {
            @Override
            public void onSuccess(SerMainContent.ContentResponse Reply) {
                Log.d(TAG, "onSuccess: " + Reply.toString());
                adapter.setNewData(Reply.getContentsList());

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}

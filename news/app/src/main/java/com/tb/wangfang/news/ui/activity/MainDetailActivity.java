package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.MainPageDetailAdapter;
import com.tb.wangfang.news.ui.adapter.RecommendJournalAdapter;
import com.wanfang.home.GetFoundListResponse;
import com.wanfang.home.GetHomeListReqeust;
import com.wanfang.home.GetLastPerioRequest;
import com.wanfang.home.GetLastPerioResponse;
import com.wanfang.home.HOMELISTTYPE;
import com.wanfang.home.HomeServiceGrpc;

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

public class MainDetailActivity extends SimpleActivity implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    ArrayList<GetFoundListResponse.HomeListMessage> arrayList;
    ArrayList<GetLastPerioResponse.LastPerioMessage> journalArrayList;
    public static final String TYPE_ONE = "0";//基金会议
    public static final String TYPE_TWO = "1";//科技动态基金会议
    public static final String TYPE_THREE = "2";//每周优选
    public static final String TYPE_FOUR = "3";//每周优选
    private String type;
    private String TAG = "MainDetailActivity";
    private MainPageDetailAdapter adapter;
    private RecommendJournalAdapter journalAdapter;
    private int page = 1;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_main_detail;
    }

    @Override
    protected void initEventAndData() {
        type = getIntent().getStringExtra("type");
        switch (type) {
            case TYPE_ONE:
                tvPageTitle.setText("基金会议");
                break;

            case TYPE_TWO:
                tvPageTitle.setText("科技动态");
                break;
            case TYPE_THREE:
                tvPageTitle.setText("每周优选");
                break;
            case TYPE_FOUR:
                tvPageTitle.setText("期刊");
                break;
        }

        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));

        if (type.equals(TYPE_FOUR)) {
            journalArrayList = new ArrayList<>();
            journalAdapter = new RecommendJournalAdapter(this, journalArrayList);
            journalAdapter.setOnLoadMoreListener(this, rvDetail);
            journalAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
            journalAdapter.setPreLoadNumber(10);
            LinearLayoutManager manager = new LinearLayoutManager(this);
            rvDetail.setLayoutManager(manager);
            rvDetail.setAdapter(journalAdapter);
            getJournalData();
            journalAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                    Intent intent = new Intent(MainDetailActivity.this, JournalActivity.class);
                    intent.putExtra(Constants.ARTICLE_ID, ((GetLastPerioResponse.LastPerioMessage) adapter.getData().get(position)).getPerioId());
                    startActivity(intent);
                }
            });
        } else {
            arrayList = new ArrayList<>();
            adapter = new MainPageDetailAdapter(arrayList);
            adapter.setOnLoadMoreListener(this, rvDetail);
            adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
            adapter.setPreLoadNumber(10);
            LinearLayoutManager manager = new LinearLayoutManager(this);
            rvDetail.setLayoutManager(manager);
            rvDetail.setAdapter(adapter);
            getData();
            adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                    GetFoundListResponse.HomeListMessage detail = (GetFoundListResponse.HomeListMessage) adapter.getData().get(position);
                    if (!TextUtils.isEmpty(detail.getTitle())) {
                        WebViewActivity.startThisFromActivity(MainDetailActivity.this, detail.getLinkUrl(), detail.getTitle(), "");
                    }

                }
            });
        }


    }

    private void getJournalData() {
        Single.create(new SingleOnSubscribe<GetLastPerioResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetLastPerioResponse> e) throws Exception {
                HomeServiceGrpc.HomeServiceBlockingStub stub = HomeServiceGrpc.newBlockingStub(managedChannel);
                GetLastPerioRequest request = GetLastPerioRequest.newBuilder().setPageNumber(1).setPageSize(20).build();
                GetLastPerioResponse reply = stub.getLastPerio(request);
                e.onSuccess(reply);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GetLastPerioResponse>() {
            @Override
            public void onSuccess(GetLastPerioResponse Reply) {
                Log.d(TAG, "onSuccess: " + Reply.toString());
                journalArrayList.addAll(Reply.getPerioMessageList());

                journalAdapter.setNewData(journalArrayList);
                swipeLayout.setEnabled(true);
                swipeLayout.setRefreshing(false);
                journalAdapter.setEnableLoadMore(true);
                journalAdapter.loadMoreComplete();
                if (!Reply.getHasMore()) {
                    journalAdapter.loadMoreEnd(false);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
                swipeLayout.setEnabled(true);
                journalAdapter.setEnableLoadMore(true);
                swipeLayout.setRefreshing(false);
                journalAdapter.loadMoreComplete();
            }
        });
    }

    private void getData() {
        Single.create(new SingleOnSubscribe<GetFoundListResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetFoundListResponse> e) throws Exception {
                HomeServiceGrpc.HomeServiceBlockingStub stub = HomeServiceGrpc.newBlockingStub(managedChannel);
                GetHomeListReqeust request = null;
                if (type.equals(TYPE_ONE)) {
                    request = GetHomeListReqeust.newBuilder().setPageNumber(page).setPageSize(20).setHomeListType(HOMELISTTYPE.TYPE_FOUNDE).build();
                } else if (type.equals(TYPE_TWO)) {
                    request = GetHomeListReqeust.newBuilder().setPageNumber(page).setPageSize(20).setHomeListType(HOMELISTTYPE.TYPE_CONFERENCE).build();
                }
                GetFoundListResponse reply = stub.getHomeList(request);
                e.onSuccess(reply);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GetFoundListResponse>() {
            @Override
            public void onSuccess(GetFoundListResponse Reply) {
                Log.d(TAG, "onSuccess: " + Reply.toString());
                arrayList.addAll(Reply.getHomeListMessageList());
                adapter.setNewData(Reply.getHomeListMessageList());
                adapter.setNewData(arrayList);
                swipeLayout.setEnabled(true);
                swipeLayout.setRefreshing(false);
                adapter.setEnableLoadMore(true);
                adapter.loadMoreComplete();
                if (!Reply.getHasMore()) {
                    adapter.loadMoreEnd(false);
                }
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
        if (type.equals(TYPE_FOUR)) {
            journalAdapter.setEnableLoadMore(false);
            page = 1;
            journalAdapter.setNewData(null);
            journalArrayList.clear();
            getJournalData();
        } else {
            adapter.setEnableLoadMore(false);
            page = 1;
            adapter.setNewData(null);
            arrayList.clear();
            getData();
        }

    }

    @Override
    public void onLoadMoreRequested() {
        if (type.equals(TYPE_FOUR)) {
            swipeLayout.setEnabled(false);
            page++;
            getJournalData();
        } else {
            swipeLayout.setEnabled(false);
            page++;
            getData();
        }
    }
}

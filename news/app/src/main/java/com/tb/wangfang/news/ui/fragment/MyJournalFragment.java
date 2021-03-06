package com.tb.wangfang.news.ui.fragment;


import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.activity.InsertSubscribeActivity;
import com.tb.wangfang.news.ui.activity.JournalActivity;
import com.tb.wangfang.news.ui.adapter.MyJournalAdapter;
import com.wanfang.subscribe.SubscribePerioListRequest;
import com.wanfang.subscribe.SubscribePerioListResponse;
import com.wanfang.subscribe.SubscribeServiceGrpc;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyJournalFragment extends SimpleFragment implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.rv_journal)
    RecyclerView rvJournal;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private List<SubscribePerioListResponse.SubscribePerioMessage> journalLists;
    private MyJournalAdapter adapter;
    private String TAG = "MyJournalFragment";
    public static final String JOURNAL_TYPE = "journal";
    private int page = 1;

    public MyJournalFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);
        return R.layout.fragment_my_journal;
    }

    @Override
    protected void initEventAndData() {
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        journalLists = new ArrayList<>();
        rvJournal.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyJournalAdapter(getActivity(), journalLists);
        adapter.setOnLoadMoreListener(this, rvJournal);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        adapter.setPreLoadNumber(2);
        View view = getActivity().getLayoutInflater().inflate(R.layout.foot_get_more, (ViewGroup) rvJournal.getParent(), false);
        TextView tvGetMore = (TextView) view.findViewById(R.id.tv_get_more);
        tvGetMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InsertSubscribeActivity.class);
                intent.putExtra("type", JOURNAL_TYPE);
                startActivity(intent);
            }
        });
        adapter.addFooterView(view);
        rvJournal.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), JournalActivity.class);
                intent.putExtra(Constants.ARTICLE_ID, ((SubscribePerioListResponse.SubscribePerioMessage) adapter.getData().get(position)).getPerioId());
                startActivity(intent);
            }
        });
        getMyJournal();
    }

    private void getMyJournal() {

        Single.create(new SingleOnSubscribe<SubscribePerioListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioListRequest request = SubscribePerioListRequest.newBuilder().setPageSize(20).setPageNumber(page).setUserId(preferencesHelper.getUserId()).build();
                SubscribePerioListResponse response = stub.getSubscribePerioList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribePerioListResponse>() {
            @Override
            public void onSuccess(SubscribePerioListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                journalLists = response.getSubscribePerioList();
                adapter.addData(journalLists);
                swipeLayout.setEnabled(true);
                swipeLayout.setRefreshing(false);
                adapter.setEnableLoadMore(true);
                adapter.loadMoreComplete();
                if (!response.getHasMore()) {
                    adapter.loadMoreEnd(true);
                }
            }

            @Override
            public void onError(Throwable e) {
                swipeLayout.setEnabled(true);
                adapter.setEnableLoadMore(true);
                swipeLayout.setRefreshing(false);
                adapter.loadMoreComplete();
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


    @Override
    public void onRefresh() {
        adapter.setEnableLoadMore(false);
        page = 1;
        adapter.setNewData(null);
        getMyJournal();
    }

    @Override
    public void onLoadMoreRequested() {
        swipeLayout.setEnabled(false);
        page++;
        getMyJournal();
    }
}

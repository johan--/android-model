package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
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
public class MyJournalFragment extends SimpleFragment {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.rv_journal)
    RecyclerView rvJournal;
    private List<SubscribePerioListResponse.SubscribePerioMessage> journalLists;
    private MyJournalAdapter adapter;
    private String TAG = "MyJournalFragment";

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
        journalLists = new ArrayList<>();
        rvJournal.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyJournalAdapter(getActivity(), journalLists);
        rvJournal.setAdapter(adapter);

        getMyJournal();

    }

    private void getMyJournal() {

        Single.create(new SingleOnSubscribe<SubscribePerioListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioListRequest request = SubscribePerioListRequest.newBuilder().setPageSize(20).setPageNumber(1).setUserId(preferencesHelper.getUserId()).build();
                SubscribePerioListResponse response = stub.getSubscribePerioList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribePerioListResponse>() {
            @Override
            public void onSuccess(SubscribePerioListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                journalLists = response.getSubscribePerioList();
                adapter.setNewData(journalLists);

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


}

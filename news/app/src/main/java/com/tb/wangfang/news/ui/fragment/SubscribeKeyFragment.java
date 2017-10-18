package com.tb.wangfang.news.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.KeyWordArticleAdapter;
import com.tb.wangfang.news.ui.adapter.SubscribeLineWordAdapter;
import com.wanfang.subscribe.SubscribeDocListRequest;
import com.wanfang.subscribe.SubscribeDocListResponse;
import com.wanfang.subscribe.SubscribeKeywordListRequest;
import com.wanfang.subscribe.SubscribeKeywordListResponse;
import com.wanfang.subscribe.SubscribeKeywordMessage;
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



public class SubscribeKeyFragment extends SimpleFragment {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.iv_spread_item)
    ImageView ivSpreadItem;
    @BindView(R.id.rv_key_word)
    RecyclerView rvKeyWord;
    @BindView(R.id.rv_doc)
    RecyclerView rvDoc;
    String TAG = "SubscribeKeyFragment";
    private int pageNum = 1;
    private List<SubscribeKeywordMessage> keyWords;
    private List<SubscribeDocListResponse.SubscribeDocMessage> DocLists;
    private SubscribeLineWordAdapter adapter;
    private KeyWordArticleAdapter docAdapter;

    public SubscribeKeyFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);
        return R.layout.fragment_subscribe_key;
    }

    @Override
    protected void initEventAndData() {
        keyWords = new ArrayList<>();
        final StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        rvKeyWord.setLayoutManager(staggeredGridLayoutManager);
        adapter = new SubscribeLineWordAdapter(keyWords);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter1, View view, int position) {
                adapter.setSelectedPosition(position);
                adapter.notifyDataSetChanged();
                staggeredGridLayoutManager.scrollToPosition(position);
                getDocList(adapter.getData().get(position));
            }
        });
        rvKeyWord.setAdapter(adapter);
        rvDoc.setLayoutManager(new LinearLayoutManager(getActivity()));
        DocLists = new ArrayList<>();
        docAdapter = new KeyWordArticleAdapter(DocLists);
        rvDoc.setAdapter(docAdapter);
        getKeyWord();


    }

    private void getDocList(final SubscribeKeywordMessage subscribeKeywordMessage) {
        Single.create(new SingleOnSubscribe<SubscribeDocListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeDocListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);

                SubscribeDocListRequest request = SubscribeDocListRequest.newBuilder().setPageSize(20).setPageNumber(pageNum).setSubscribeKeyword(subscribeKeywordMessage).build();
                SubscribeDocListResponse response = stub.getSubscribeDocListByKeyword(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeDocListResponse>() {
            @Override
            public void onSuccess(SubscribeDocListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                DocLists = response.getSubscribeDocList();
                docAdapter.setNewData(DocLists);

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }



    private void getKeyWord() {
        Single.create(new SingleOnSubscribe<SubscribeKeywordListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeKeywordListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);

                SubscribeKeywordListRequest request = SubscribeKeywordListRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageSize(20).setPageNumber(1).build();
                SubscribeKeywordListResponse response = stub.getSubscribeKeywordList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeKeywordListResponse>() {
            @Override
            public void onSuccess(SubscribeKeywordListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                keyWords = response.getSubscribeKeywordList();
                adapter.setNewData(keyWords);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


}

package com.tb.wangfang.news.ui.fragment;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.wanfang.subscribe.SubscribeKeywordListRequest;
import com.wanfang.subscribe.SubscribeKeywordListResponse;
import com.wanfang.subscribe.SubscribeKeywordMessage;
import com.wanfang.subscribe.SubscribeServiceGrpc;

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
    @BindView(R.id.rv_)
    RecyclerView rv;
    String TAG = "SubscribeKeyFragment";

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
        getKeyWord();

    }

    private void getKeyWord() {
        Single.create(new SingleOnSubscribe<SubscribeKeywordListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeKeywordListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
           String s=     preferencesHelper.getUserId();
                SubscribeKeywordListRequest request = SubscribeKeywordListRequest.newBuilder().setUserId(s).setPageNumber(1).setPageSize(20).build();
                SubscribeKeywordListResponse response = stub.getSubscribeKeywordList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeKeywordListResponse>() {
            @Override
            public void onSuccess(SubscribeKeywordListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                List<SubscribeKeywordMessage> keyWords = response.getSubscribeKeywordList();
            }
            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: "+e.getMessage());
            }
        });
    }


}

package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.MyCollectAdapter;
import com.wanfang.personal.MyCollectRequest;
import com.wanfang.personal.MyCollectResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

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

public class MycollectActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    MyCollectAdapter adapter;
    @BindView(R.id.rv_collect)
    RecyclerView rvCollect;
    private String TAG = "MycollectActivity";

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
        Single.create(new SingleOnSubscribe<MyCollectResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyCollectResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                MyCollectRequest request = MyCollectRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageNumber(1).setPageSize(20).build();
                MyCollectResponse response = stub.getMyCollect(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyCollectResponse>() {
            @Override
            public void onSuccess(MyCollectResponse myCollectResponse) {
                Log.d(TAG, "onSuccess: " + myCollectResponse.getResultsList().toString());
            }

            @Override
            public void onError(Throwable e) {

            }
        });
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrayList.add("" + i);
        }
        adapter = new MyCollectAdapter(arrayList);
        rvCollect.setLayoutManager(new LinearLayoutManager(this));
        rvCollect.setAdapter(adapter);
    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}

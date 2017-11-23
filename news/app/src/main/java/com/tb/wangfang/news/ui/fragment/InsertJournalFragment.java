package com.tb.wangfang.news.ui.fragment;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.activity.JournalActivity;
import com.tb.wangfang.news.ui.adapter.InsertJournalRightAdapter;
import com.tb.wangfang.news.ui.adapter.JournalMenuAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.SearchEditText;
import com.wanfang.subscribe.AddSubscribePerioTreeListRequest;
import com.wanfang.subscribe.AddSubscribePerioTreeListResponse;
import com.wanfang.subscribe.CancelSubscribeRequest;
import com.wanfang.subscribe.CancelSubscribeResponse;
import com.wanfang.subscribe.CancelSubscribeType;
import com.wanfang.subscribe.SubscribePerioListSearchRequest;
import com.wanfang.subscribe.SubscribePerioListSearchResponse;
import com.wanfang.subscribe.SubscribePerioRequest;
import com.wanfang.subscribe.SubscribePerioResponse;
import com.wanfang.subscribe.SubscribeServiceGrpc;

import java.util.ArrayList;

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
public class InsertJournalFragment extends SimpleFragment implements BaseQuickAdapter.RequestLoadMoreListener {
    private static final String TAG = "InsertJournalFragment";
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.et_search)
    SearchEditText etSearch;
    @BindView(R.id.rl_sign_one)
    RelativeLayout rlSignOne;
    @BindView(R.id.rv_menu)
    RecyclerView rvMenu;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    private int page = 1;
    private AddSubscribePerioTreeListResponse.AddSubscribeTreeItemMessage selectedItme;
    private JournalMenuAdapter menuAdapter;

    private InsertJournalRightAdapter detailAdapter;


    @Override
    protected int getLayoutId() {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);
        return R.layout.fragment_insert_journal;
    }

    @Override
    protected void initEventAndData() {

        rvMenu.setLayoutManager(new LinearLayoutManager(getActivity()));
        menuAdapter = new JournalMenuAdapter(null);
        rvMenu.setAdapter(menuAdapter);
        menuAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                menuAdapter.setSeletedPosition(position);
                menuAdapter.notifyDataSetChanged();
                page = 1;
                selectedItme = menuAdapter.getData().get(position);
                getRightJorunal(selectedItme, page);
            }
        });
        getJournalKey();
        rvDetail.setLayoutManager(new LinearLayoutManager(getActivity()));
        detailAdapter = new InsertJournalRightAdapter(null, getActivity());
        detailAdapter.setOnLoadMoreListener(this, rvDetail);
        detailAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        detailAdapter.setPreLoadNumber(2);
        rvDetail.setAdapter(detailAdapter);
        detailAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), JournalActivity.class);
                intent.putExtra(Constants.ARTICLE_ID, detailAdapter.getData().get(position).getPerioId());
                startActivity(intent);
            }
        });
        detailAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (view.getId() == R.id.btn_subscribe_state) {
                    if (detailAdapter.getData().get(position).getIsSubscribed()) {
                        unSubscribe((SubscribePerioListSearchResponse.PerioListSearchMessage) adapter.getData().get(position), position);
                    } else {
                        subscribe((SubscribePerioListSearchResponse.PerioListSearchMessage) adapter.getData().get(position), position);
                    }

                }
            }
        });


    }

    private void unSubscribe(final SubscribePerioListSearchResponse.PerioListSearchMessage perioListSearchMessage, final int position) {
        Single.create(new SingleOnSubscribe<CancelSubscribeResponse>() {
            @Override
            public void subscribe(SingleEmitter<CancelSubscribeResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                CancelSubscribeRequest request = CancelSubscribeRequest.newBuilder().setUserId(preferencesHelper.getUserId())
                        .setSubscribeId(perioListSearchMessage.getPerioId()).setCancelType(CancelSubscribeType.DeletePerio).build();

                CancelSubscribeResponse response = stub.cancelSubscribe(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<CancelSubscribeResponse>() {
                    @Override
                    public void onSuccess(CancelSubscribeResponse response) {
                        Log.d(TAG, "onSuccess: " + response.toString());
                        if (response.getCancelSubscribeSuccess()) {
                            ToastUtil.show("取消订阅成功");
                            SubscribePerioListSearchResponse.PerioListSearchMessage searchMessage = detailAdapter.getData().get(position);
                            SubscribePerioListSearchResponse.PerioListSearchMessage newSearchMessage = searchMessage.toBuilder().setIsSubscribed(false).build();
                            ArrayList<SubscribePerioListSearchResponse.PerioListSearchMessage> arrayList = new ArrayList<SubscribePerioListSearchResponse.PerioListSearchMessage>(detailAdapter.getData());
                            arrayList.set(position, newSearchMessage);
                            detailAdapter.setNewData(arrayList);
                            detailAdapter.notifyDataSetChanged();
                        } else {
                            ToastUtil.show("取消订阅订阅失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });

    }

    private void subscribe(final SubscribePerioListSearchResponse.PerioListSearchMessage perioListSearchMessage, final int position) {
        Single.create(new SingleOnSubscribe<SubscribePerioResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioRequest request = SubscribePerioRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPerioId(perioListSearchMessage.getPerioId()).build();
                SubscribePerioResponse response = stub.subscribePerio(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubscribePerioResponse>() {
                    @Override
                    public void onSuccess(SubscribePerioResponse subjectListResponse) {
                        Log.d(TAG, "onSuccess: " + subjectListResponse.toString());
                        if (subjectListResponse.getSubscribeSuccess()) {
                            ToastUtil.show("订阅成功");
                            SubscribePerioListSearchResponse.PerioListSearchMessage searchMessage = detailAdapter.getData().get(position);
                            SubscribePerioListSearchResponse.PerioListSearchMessage newSearchMessage = searchMessage.toBuilder().setIsSubscribed(true).build();
                            ArrayList<SubscribePerioListSearchResponse.PerioListSearchMessage> arrayList = new ArrayList<SubscribePerioListSearchResponse.PerioListSearchMessage>(detailAdapter.getData());
                            arrayList.set(position, newSearchMessage);
                            detailAdapter.setNewData(arrayList);
                            detailAdapter.notifyDataSetChanged();
                        } else {
                            ToastUtil.show("订阅失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });

    }

    private void getJournalKey() {
        Single.create(new SingleOnSubscribe<AddSubscribePerioTreeListResponse>() {
            @Override
            public void subscribe(SingleEmitter<AddSubscribePerioTreeListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                AddSubscribePerioTreeListRequest request = AddSubscribePerioTreeListRequest.newBuilder().build();
                AddSubscribePerioTreeListResponse response = stub.getAddSubscribePerioTreeList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<AddSubscribePerioTreeListResponse>() {
                    @Override
                    public void onSuccess(AddSubscribePerioTreeListResponse subjectListResponse) {
                        Log.d(TAG, "onSuccess: " + subjectListResponse.getTreeItemList().toString());
                        menuAdapter.setNewData(subjectListResponse.getTreeItemList());
                        if (subjectListResponse != null && subjectListResponse.getTreeItemList() != null && subjectListResponse.getTreeItemList().size() > 0) {
                            selectedItme = subjectListResponse.getTreeItemList().get(0);
                            getRightJorunal(selectedItme, page);
                            menuAdapter.setSeletedPosition(0);
                        } else {
                            menuAdapter.setEmptyView(R.layout.normal_empty_layout);
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });
    }

    private void getRightJorunal(final AddSubscribePerioTreeListResponse.AddSubscribeTreeItemMessage addSubscribeTreeItemMessage, final int page) {
        Single.create(new SingleOnSubscribe<SubscribePerioListSearchResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioListSearchResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioListSearchRequest request = SubscribePerioListSearchRequest.newBuilder().setValue(addSubscribeTreeItemMessage.getValue()).setPageNumber(page).setPageSize(20)
                        .setUserId(preferencesHelper.getUserId()).setSelectOrder("start_year02").build();
                SubscribePerioListSearchResponse response = stub.getAddSubscribePerioSearchList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubscribePerioListSearchResponse>() {
                    @Override
                    public void onSuccess(SubscribePerioListSearchResponse subjectListResponse) {
                        Log.d(TAG, "onSuccess: " + subjectListResponse.getSearchPeriosList());
                        detailAdapter.setNewData(subjectListResponse.getSearchPeriosList());
                        detailAdapter.setEnableLoadMore(true);
                        detailAdapter.loadMoreComplete();
                        if (!subjectListResponse.getHasMore()) {
                            detailAdapter.loadMoreEnd(false);
                        }
                        if (detailAdapter == null || detailAdapter.getData() == null || detailAdapter.getData().size() == 0) {
                            detailAdapter.setEmptyView(R.layout.normal_empty_layout);
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onSuccess: " + e.getMessage());
                        ToastUtil.show("网络出错");
                    }
                });

    }


    @Override
    public void onLoadMoreRequested() {
        page++;
        getRightJorunal(selectedItme, page);
    }
}

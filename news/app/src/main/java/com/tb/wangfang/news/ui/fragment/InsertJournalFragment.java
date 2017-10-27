package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.JournalMenuAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.SearchEditText;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.SubjectListRequest;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.SubjectMessage;

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
public class InsertJournalFragment extends SimpleFragment {
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
    private List<SubjectMessage> subjectMessages = new ArrayList<>();
    private JournalMenuAdapter menuAdapter;


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
        menuAdapter = new JournalMenuAdapter(subjectMessages);
        rvMenu.setAdapter(menuAdapter);
        menuAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                menuAdapter.setSeletedPosition(position);
                menuAdapter.notifyDataSetChanged();
            }
        });
        getJournalKey();
    }

    private void getJournalKey() {
        Single.create(new SingleOnSubscribe<SubjectListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubjectListResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                SubjectListRequest request = SubjectListRequest.newBuilder().build();
                SubjectListResponse response = stub.getSubjectList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubjectListResponse>() {
                    @Override
                    public void onSuccess(SubjectListResponse subjectListResponse) {
                        Log.d(TAG, "onSuccess: " + subjectListResponse.getSubjectList().toString());
                        subjectMessages.clear();
                        subjectMessages = subjectListResponse.getSubjectList().getSubSubjectList();
                        menuAdapter.setNewData(subjectMessages);
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });
    }


}

package com.tb.wangfang.news.ui.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.ShourceTypeAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.subscribe.DocType;
import com.wanfang.subscribe.SourceType;
import com.wanfang.subscribe.SubscribeDocTypeListRequest;
import com.wanfang.subscribe.SubscribeDocTypeListResponse;
import com.wanfang.subscribe.SubscribeKeywordRequest;
import com.wanfang.subscribe.SubscribeKeywordResponse;
import com.wanfang.subscribe.SubscribeServiceGrpc;
import com.wanfang.subscribe.SubscribeSourceTypeListRequest;
import com.wanfang.subscribe.SubscribeSourceTypeListResponse;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
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
public class InsertKeywordFragment extends SimpleFragment {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.et_keyword)
    EditText etKeyword;
    @BindView(R.id.tv_num_limit)
    TextView tvNumLimit;
    @BindView(R.id.rv_source_type)
    RecyclerView rvSourceType;
    @BindView(R.id.et_email)
    EditText etEmail;
    int num = 20;
    Unbinder unbinder;
    private String TAG = "InsertKeywordFragment";
    private ShourceTypeAdapter adapter;
    private List<DocType> docTypes;

    public InsertKeywordFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);


        return R.layout.fragment_insert_keyword;
    }

    @Override
    protected void initEventAndData() {
        rvSourceType.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        etKeyword.addTextChangedListener(new TextWatcher() {
            private CharSequence wordNum;//记录输入的字数
            private int selectionStart;
            private int selectionEnd;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                wordNum = s;//实时记录输入的字数
            }

            @Override
            public void afterTextChanged(Editable s) {
                int number = s.length();
                //TextView显示剩余字数
                tvNumLimit.setText(number + "/" + num);
                selectionStart = etKeyword.getSelectionStart();
                selectionEnd = etKeyword.getSelectionEnd();
                if (wordNum.length() > num) {
                    //删除多余输入的字（不会显示出来）
                    s.delete(selectionStart - 1, selectionEnd);
                    int tempSelection = selectionEnd;
                    etKeyword.setText(s);
                    etKeyword.setSelection(tempSelection);//设置光标在最后
                }
            }
        });


        getSubscribeSource();
        getSubscribeDocType();
    }

    private void getSubscribeDocType() {
        Single.create(new SingleOnSubscribe<SubscribeDocTypeListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeDocTypeListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);

                SubscribeDocTypeListRequest request = SubscribeDocTypeListRequest.newBuilder().build();
                SubscribeDocTypeListResponse response = stub.getSubscribeDocTypeList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeDocTypeListResponse>() {
            @Override
            public void onSuccess(SubscribeDocTypeListResponse response) {
                docTypes = response.getDocTypeList();
                Log.d(TAG, "onSuccess: " + docTypes.toString());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void getSubscribeSource() {
        Single.create(new SingleOnSubscribe<SubscribeSourceTypeListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeSourceTypeListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);

                SubscribeSourceTypeListRequest request = SubscribeSourceTypeListRequest.newBuilder().build();
                SubscribeSourceTypeListResponse response = stub.getSubscribeSourceTypeList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeSourceTypeListResponse>() {
            @Override
            public void onSuccess(SubscribeSourceTypeListResponse response) {
                if (response != null && response.getSourceTypeList() != null) {
                    adapter = new ShourceTypeAdapter(response.getSourceTypeList());
                    adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
                        @Override
                        public void onItemChildClick(BaseQuickAdapter adapter1, View view, int position) {
                            adapter.getSourceSelected()[position] = !adapter.getSourceSelected()[position];
                            adapter.notifyDataSetChanged();
                        }
                    });
                    rvSourceType.setAdapter(adapter);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


    @OnClick(R.id.btn_complete)
    public void onViewClicked() {
        String keyword = etKeyword.getText().toString();
        if (!TextUtils.isEmpty(keyword) && !TextUtils.isEmpty(keyword.trim())) {
            ArrayList<SourceType> sourceTypes = new ArrayList<>();
            for (int i = 0; i < adapter.getData().size(); i++) {
                if (adapter.getSourceSelected()[i]) {
                    sourceTypes.add(adapter.getData().get(i));
                }
            }
            if (sourceTypes.size() > 0) {

                submitKeyWord(keyword, sourceTypes);
            } else {
                ToastUtil.show("请至少选择一个订阅来源");
            }

        } else {
            ToastUtil.show("请输入订阅关键字");
        }
    }

    private void submitKeyWord(final String keyword, final ArrayList<SourceType> sourceTypes) {
        Single.create(new SingleOnSubscribe<SubscribeKeywordResponse>() {


            @Override
            public void subscribe(SingleEmitter<SubscribeKeywordResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribeKeywordRequest request;
                SubscribeKeywordRequest.Builder builder = SubscribeKeywordRequest.newBuilder().setUserId(preferencesHelper.getUserId()).addAllSourceType(sourceTypes).setKeyword(keyword).addAllDocType(docTypes);
                if (!TextUtils.isEmpty(etEmail.getText().toString()) && !TextUtils.isEmpty(etEmail.getText().toString().trim())) {
                    builder.setEmail(etEmail.getText().toString().trim()).setShouldUpdateEmail(true);
                    request = builder.build();
                } else {
                    request = builder.build();
                }
                SubscribeKeywordResponse response = stub.subscribeKeyword(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeKeywordResponse>() {
            @Override
            public void onSuccess(SubscribeKeywordResponse response) {
                if (response.getSubscribeSuccess()) {
                    ToastUtil.show("添加成功");
                } else {
                    ToastUtil.show("添加失败");
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }
}

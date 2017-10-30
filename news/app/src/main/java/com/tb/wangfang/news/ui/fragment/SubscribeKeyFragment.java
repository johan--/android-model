package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleFragment;
import com.tb.wangfang.news.di.component.DaggerFragmentComponent;
import com.tb.wangfang.news.di.module.FragmentModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.activity.DocDetailActivity;
import com.tb.wangfang.news.ui.activity.InsertSubscribeActivity;
import com.tb.wangfang.news.ui.adapter.KeyWordArticleAdapter;
import com.tb.wangfang.news.ui.adapter.SubscribeLineWordAdapter;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.widget.FlowLayout;
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
import butterknife.OnClick;
import butterknife.Unbinder;
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
    Unbinder unbinder;
    Unbinder unbinder1;
    private int pageNum = 1;
    private List<SubscribeKeywordMessage> keyWords;
    private List<SubscribeDocListResponse.SubscribeDocMessage> DocLists;
    private SubscribeLineWordAdapter adapter;
    private KeyWordArticleAdapter docAdapter;
    private MaterialDialog dialog;
    private TextView[] flowTvs;

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
        View view = getActivity().getLayoutInflater().inflate(R.layout.foot_get_more, (ViewGroup) rvKeyWord.getParent(), false);
        TextView tvGetMore = (TextView) view.findViewById(R.id.tv_get_more);
        tvGetMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InsertSubscribeActivity.class);
                startActivity(intent);
            }
        });
        docAdapter.addFooterView(view);
        docAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), DocDetailActivity.class);
                intent.putExtra(Constants.ARTICLE_TYPE, DocLists.get(position).getDocuType());
                intent.putExtra(Constants.ARTICLE_ID, DocLists.get(position).getDocId());
                startActivity(intent);
            }
        });

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

                SubscribeKeywordListRequest request = SubscribeKeywordListRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageNumber(1).build();
                SubscribeKeywordListResponse response = stub.getSubscribeKeywordList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeKeywordListResponse>() {
            @Override
            public void onSuccess(SubscribeKeywordListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                keyWords.clear();
                for (int i = 0; i < response.getSubscribeKeywordList().size(); i++) {
                    keyWords.add(response.getSubscribeKeywordList().get(i));
                }
                SubscribeKeywordMessage subscribeKeywordMessageAll = SubscribeKeywordMessage.newBuilder().setUserId(preferencesHelper.getUserId()).setKeyword("全部").build();
                keyWords.add(0, subscribeKeywordMessageAll);
                adapter.setNewData(keyWords);
                getDocList(subscribeKeywordMessageAll);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }


    @OnClick({R.id.iv_spread_item})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_spread_item:
                dialog = new MaterialDialog.Builder(getActivity())
                        .title("全部关键词订阅")
                        .customView(R.layout.item_flow_layout, true)
                        .positiveText("确定")
                        .negativeText("取消")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                            }
                        }).onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                dialog.dismiss();
                            }
                        }).onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                dialog.dismiss();
                            }
                        })
                        .build();
                FlowLayout flContent = (FlowLayout) dialog.getCustomView().findViewById(R.id.fl_content);
                flowTvs = new TextView[keyWords.size()];
                for (int i = 0; i < keyWords.size(); i++) {
                    TextView textView = new TextView(getActivity());
                    textView.setTextSize(12);
                    textView.setGravity(Gravity.CENTER);

                    textView.setText(keyWords.get(i).getKeyword());

                    ViewGroup.LayoutParams vglp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(vglp);
                    params.setMargins(SystemUtil.dp2px(getActivity(), 8), SystemUtil.dp2px(8), SystemUtil.dp2px(8), SystemUtil.dp2px(8));
                    textView.setBackgroundResource(R.drawable.item_flow_gray_frame);
                    textView.setTextColor(getResources().getColor(R.color.gray_text_6));
                    textView.setLayoutParams(params);
                    final int finalI = i;
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < flowTvs.length; j++) {
                                TextView itemTv = flowTvs[j];
                                itemTv.setBackgroundResource(R.drawable.item_flow_gray_frame);
                                itemTv.setTextColor(getResources().getColor(R.color.gray_text_6));
                            }
                            v.setBackgroundResource(R.drawable.itme_flow_blue_frame);
                            ((TextView) v).setTextColor(getResources().getColor(R.color.white));
                            getDocList(keyWords.get(finalI));
                            adapter.setSelectedPosition(finalI);
                        }
                    });
                    flowTvs[i] = textView;
                    flContent.addView(textView);
                }
                dialog.show();
                break;

        }
    }
}

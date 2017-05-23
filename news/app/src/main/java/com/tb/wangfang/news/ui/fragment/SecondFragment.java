package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.folioreader.activity.FolioActivity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.presenter.SecondPresenter;
import com.tb.wangfang.news.ui.adapter.SearchDocumentAdapter;
import com.tb.wangfang.news.widget.SearchEditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View, BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {


    @BindView(R.id.filter_edit)
    SearchEditText filterEdit;
    @BindView(R.id.btn_confirm)
    Button btnConfirm;
    @BindView(R.id.rv_history)
    RecyclerView rvHistory;
    @BindView(R.id.rl_history_content)
    RelativeLayout rlHistoryContent;
    @BindView(R.id.rv_content)
    RecyclerView rvContent;
    Unbinder unbinder;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();
    private ArrayList<HistoryDocItem> historyDocItemArrayList = new ArrayList<>();
    private SearchDocumentAdapter docAdapter;

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second;
    }

    @Override
    protected void initEventAndData() {
        docAdapter = new SearchDocumentAdapter(searchDocItemArrayList);
        docAdapter.setOnLoadMoreListener(this, rvHistory);
        docAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
//        pullToRefreshAdapter.setPreLoadNumber(3);
        rvHistory.setAdapter(docAdapter);
        mPresenter.searchAllHistory();
    }

//    @OnClick(R.id.btn_assest)
//    void btnAssest(View view) {
//        ToastUtil.shortShow("为什么不触发assest");
//        openEpub(FolioActivity.EpubSourceType.ASSESTS, "abc.epub", 0);
//    }
//
//    @OnClick(R.id.btn_raw)
//    void btnRaw(View view) {
//        ToastUtil.shortShow("为什么不触发raw");
//        openEpub(FolioActivity.EpubSourceType.ASSESTS, "aayesha.epub", 0);
//    }

    private void openEpub(FolioActivity.EpubSourceType sourceType, String path, int rawID) {
        Intent intent = new Intent(getActivity(), FolioActivity.class);
        if (rawID != 0) {
            intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_PATH, rawID);
        } else {
            intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_PATH, path);
        }
        intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_TYPE, sourceType);
        startActivity(intent);
    }


    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @OnClick(R.id.btn_confirm)
    public void search() {
        if (!TextUtils.isEmpty(filterEdit.getText().toString()) && TextUtils.isEmpty(filterEdit.getText().toString().trim())) {
            mPresenter.searchAndStore(filterEdit.getText().toString().trim());
        }
    }


    @Override
    public void initView() {
        filterEdit.setShakeAnimation();

    }

    @Override
    public void showSearchresult(List<SearchDocItem> searchDocItems) {
        rlHistoryContent.setVisibility(View.GONE);
        rvContent.setVisibility(View.VISIBLE);

    }

    @Override
    public void showHistoryItem(List<HistoryDocItem> historyDocItems) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onRefresh() {
        docAdapter.setEnableLoadMore(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                docAdapter.setNewData(mPresenter.searchAndStore("das"));
                swipeLayout.setRefreshing(false);
                docAdapter.setEnableLoadMore(true);
            }
        }, 1000);
    }

    @Override
    public void onLoadMoreRequested() {

    }
}
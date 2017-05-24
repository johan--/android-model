package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

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
import butterknife.OnClick;

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
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();
    private ArrayList<HistoryDocItem> historyDocItemArrayList = new ArrayList<>();
    private SearchDocumentAdapter docAdapter;
    private int page = 1;
    private static final int PAGE_SIZE = 20;
    private boolean isErr;

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
        for (int i = 0; i < 20; i++) {
            searchDocItemArrayList.add(new SearchDocItem(i + ""));
        }
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        rvContent.setLayoutManager(new LinearLayoutManager(getActivity()));
        docAdapter = new SearchDocumentAdapter(searchDocItemArrayList);
        docAdapter.setOnLoadMoreListener(this, rvContent);
        docAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        docAdapter.setPreLoadNumber(3);
        rvContent.setAdapter(docAdapter);

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
        if (!TextUtils.isEmpty(filterEdit.getText().toString()) && !TextUtils.isEmpty(filterEdit.getText().toString().trim())) {
            page = 1;
            mPresenter.searchAndStore(filterEdit.getText().toString().trim(), page);
        }
    }


    @Override
    public void initView() {
        filterEdit.setShakeAnimation();

    }


    @Override
    public void showHistoryItem(List<HistoryDocItem> historyDocItems) {

    }

    @Override
    public void refreshView(List<SearchDocItem> searchDocItems) {
        rlHistoryContent.setVisibility(View.GONE);
        rvContent.setVisibility(View.VISIBLE);
        docAdapter.setNewData(searchDocItems);
        isErr = false;
//        mCurrentCounter = PAGE_SIZE;
        swipeLayout.setRefreshing(false);
        docAdapter.setEnableLoadMore(true);

    }

    @Override
    public void loadMoreView(List<SearchDocItem> searchDocItems) {
        swipeLayout.setEnabled(false);
        if (searchDocItems.size() < PAGE_SIZE) {
            docAdapter.loadMoreEnd(false);
        } else {
            if (isErr) {
                docAdapter.addData(searchDocItems);
                docAdapter.loadMoreComplete();
            } else {
                isErr = true;
                Toast.makeText(getContext(), R.string.network_err, Toast.LENGTH_LONG).show();
                docAdapter.loadMoreFail();
            }
            swipeLayout.setEnabled(true);
        }

    }


    @Override
    public void onRefresh() {
        if (!TextUtils.isEmpty(filterEdit.getText().toString()) && TextUtils.isEmpty(filterEdit.getText().toString().trim())) {
            page = 1;
            docAdapter.setEnableLoadMore(false);
            mPresenter.searchAndStore(filterEdit.getText().toString().trim(), page);


        }

    }

    @Override
    public void onLoadMoreRequested() {
        mPresenter.searchAndStore(filterEdit.getText().toString().trim(), page++);
    }
}
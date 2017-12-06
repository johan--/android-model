package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.HotSearchBean;
import com.tb.wangfang.news.presenter.SecondPresenter;
import com.tb.wangfang.news.ui.activity.FilterDocActivity;
import com.tb.wangfang.news.ui.adapter.HistoryItemAdapter;
import com.tb.wangfang.news.ui.adapter.HotAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.DividerGridItemDecoration;
import com.tb.wangfang.news.widget.SearchEditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View {

    @BindView(R.id.rv_history)
    RecyclerView rvHistory;
    @BindView(R.id.et_search)
    SearchEditText etSearch;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.btn_delete_history)
    Button btnDeleteHistory;
    Unbinder unbinder;
    @BindView(R.id.rv_hot)
    RecyclerView rvHot;
    @BindView(R.id.ll_history)
    LinearLayout llHistory;
    private ArrayList<HistoryDocItem> historyDocItemArrayList = new ArrayList<>();
    private ArrayList<String> hotDocArrayList = new ArrayList<>();
    private HistoryItemAdapter historyAdapter;
    private String TAG = "SecondFragment";
    private HotAdapter hotAdapter;

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //热门搜索词
        rvHot.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvHot.addItemDecoration(new DividerGridItemDecoration(getActivity()));
        hotAdapter = new HotAdapter(null);
        rvHot.setAdapter(hotAdapter);
        hotAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), FilterDocActivity.class);
                intent.putExtra("text", ((HotSearchBean) hotAdapter.getData().get(position)).getWords());
                startActivity(intent);
            }
        });

        //历史记录
        rvHistory.setLayoutManager(new LinearLayoutManager(getActivity()));
        historyAdapter = new HistoryItemAdapter(historyDocItemArrayList);
        rvHistory.setAdapter(historyAdapter);
        historyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), FilterDocActivity.class);
                intent.putExtra("text", historyAdapter.getData().get(position).getText());
                startActivity(intent);
            }
        });
        historyAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (view.getId() == R.id.iv_delete_item) {
                    HistoryDocItem docItem = (HistoryDocItem) adapter.getData().get(position);
                    mPresenter.deleteHistory(docItem);
                    mPresenter.searchAllHistory();
                }
            }
        });
    }


    @Override
    protected void initEventAndData() {
        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    if (!TextUtils.isEmpty(etSearch.getText().toString()) && !TextUtils.isEmpty(etSearch.getText().toString().trim())) {
                        HistoryDocItem docItem = new HistoryDocItem();
                        docItem.setText(etSearch.getText().toString());
                        docItem.setTime(System.currentTimeMillis() / 1000);
                        mPresenter.stotyHistory(docItem);
                        Intent intent = new Intent(getActivity(), FilterDocActivity.class);
                        intent.putExtra("text", etSearch.getText().toString().trim());
                        startActivity(intent);
                    } else {
                        ToastUtil.shortShow("请输入搜索关键字");
                    }
                }
                return false;
            }
        });
        mPresenter.getHotDoc();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.searchAllHistory();
        mPresenter.getHotDoc();
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

//    private void openEpub(FolioActivity.EpubSourceType sourceType, String path, int rawID) {
//        Intent intent = new Intent(getActivity(), FolioActivity.class);
//        if (rawID != 0) {
//            intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_PATH, rawID);
//        } else {
//            intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_PATH, path);
//        }
//        intent.putExtra(FolioActivity.INTENT_EPUB_SOURCE_TYPE, sourceType);
//        startActivity(intent);
//    }


    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @OnClick(R.id.btn_delete_history)
    public void deleteHistory() {

        new MaterialDialog.Builder(getActivity())
                .content("确定清空检索历史")
                .positiveText("确定")
                .negativeText("取消").onPositive(new MaterialDialog.SingleButtonCallback() {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                mPresenter.deleteAllHistry();
            }
        }).show();


    }

    @Override
    public void initView() {

    }


    @Override
    public void showHistoryItem(List<HistoryDocItem> historyDocItems) {
        historyDocItemArrayList.clear();
        //去重
        for (int i = 0; i < historyDocItems.size(); i++) {
            if (!historyDocItemArrayList.contains(historyDocItems.get(i)) && historyDocItemArrayList.size() < 13) {
                historyDocItemArrayList.add(historyDocItems.get(i));
            }
        }
        historyAdapter.setNewData(historyDocItemArrayList);
        if (historyDocItems.size() == 0) {
            llHistory.setVisibility(View.GONE);
        } else {
            llHistory.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void showHotSearchWord(   ArrayList<HotSearchBean> hotSearchBeans) {

        hotAdapter.setNewData(hotSearchBeans);
    }


}
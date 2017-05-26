package com.tb.wangfang.news.ui.fragment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.presenter.SecondPresenter;

import java.util.List;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View {
    @Override
    public void initView() {

    }

    @Override
    public void showHistoryItem(List<HistoryDocItem> historyDocItems) {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second;
    }

    @Override
    protected void initEventAndData() {

    }


//    @BindView(R.id.filter_edit)
//    SearchEditText filterEdit;
//    @BindView(R.id.rv_history)
//    RecyclerView rvHistory;
//    private ArrayList<HistoryDocItem> historyDocItemArrayList = new ArrayList<>();
//    private HistoryItemAdapter historyAdapter;
//
    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }
//
//    @Override
//    protected int getLayoutId() {
//
//        return R.layout.fragment_second;
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        rvHistory.setLayoutManager(new LinearLayoutManager(getActivity()));
//        historyAdapter = new HistoryItemAdapter(historyDocItemArrayList);
//        rvHistory.setAdapter(historyAdapter);
//
//    }
//
//    @Override
//    protected void initEventAndData() {
//        filterEdit.setOnDeleteListener(new SearchEditText.onDeleteListener() {
//            @Override
//            public void onDelete() {
//
//            }
//        });
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        mPresenter.searchAllHistory();
//    }
////    @OnClick(R.id.btn_assest)
////    void btnAssest(View view) {
////        ToastUtil.shortShow("为什么不触发assest");
////        openEpub(FolioActivity.EpubSourceType.ASSESTS, "abc.epub", 0);
////    }
////
////    @OnClick(R.id.btn_raw)
////    void btnRaw(View view) {
////        ToastUtil.shortShow("为什么不触发raw");
////        openEpub(FolioActivity.EpubSourceType.ASSESTS, "aayesha.epub", 0);
////    }
//
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
//
//
//    @Override
//    protected void initInject() {
//        getFragmentComponent().inject(this);
//    }
//
//    @OnClick(R.id.btn_confirm)
//    public void search() {
//        if (!TextUtils.isEmpty(filterEdit.getText().toString()) && !TextUtils.isEmpty(filterEdit.getText().toString().trim())) {
//            Intent intent = new Intent(getActivity(), FilterDocActivity.class);
//            intent.putExtra("text", filterEdit.getText().toString().trim());
//            startActivity(intent);
//        } else {
//            ToastUtil.shortShow("请输入搜索关键字");
//        }
//    }
//
//    @OnClick(R.id.btn_delete_history)
//    public void deleteHistory() {
//
////        new MaterialDialog.Builder(getActivity())
////                .title("提示")
////                .content("确定清空检索历史")
////                .positiveText("确定")
////                .negativeText("取消").onPositive(new MaterialDialog.SingleButtonCallback() {
////            @Override
////            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
////                mPresenter.deleteAllHistry();
////            }
////        }).show();
//
//
//    }
//
//    @Override
//    public void initView() {
//        filterEdit.setShakeAnimation();
//    }
//
//
//    @Override
//    public void showHistoryItem(List<HistoryDocItem> historyDocItems) {
//        historyDocItemArrayList.clear();
//        //去重
//        for (int i = 0; i < historyDocItems.size(); i++) {
//            if (!historyDocItemArrayList.contains(historyDocItems.get(i)) && historyDocItemArrayList.size() < 13) {
//                historyDocItemArrayList.add(historyDocItems.get(i));
//            }
//        }
//        historyAdapter.setNewData(historyDocItemArrayList);
//
//
//    }


}
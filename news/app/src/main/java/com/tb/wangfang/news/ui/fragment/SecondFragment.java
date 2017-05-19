package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.folioreader.activity.FolioActivity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.presenter.SecondPresenter;
import com.tb.wangfang.news.utils.ToastUtil;

import butterknife.OnClick;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View {


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

    }

    @OnClick(R.id.btn_assest)
    void btnAssest(View view) {
        ToastUtil.shortShow("为什么不触发assest");
        openEpub(FolioActivity.EpubSourceType.ASSESTS, "abc.epub", 0);
    }

    @OnClick(R.id.btn_raw)
    void btnRaw(View view) {
        ToastUtil.shortShow("为什么不触发raw");
        openEpub(FolioActivity.EpubSourceType.ASSESTS, "aayesha.epub", 0);
    }

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
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


}
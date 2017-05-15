package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.folioreader.activity.FolioActivity;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.presenter.SecondPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondFragment extends BaseFragment<SecondPresenter> implements SecondContract.View {

    @BindView(R.id.btn_raw)
    Button btnRaw;
    @BindView(R.id.btn_assest)
    Button btnAssest;
    Unbinder unbinder;

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
        btnAssest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpub(FolioActivity.EpubSourceType.ASSESTS, "abc.epub", 0);
            }
        });
    }

    @OnClick(R.id.btn_assest)
    public void btnAssest() {

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
}
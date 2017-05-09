package com.tb.wangfang.news.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.presenter.FirstPresenter;

import static org.jsoup.nodes.Entities.EscapeMode.base;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FirstFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View {

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initEventAndData() {

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

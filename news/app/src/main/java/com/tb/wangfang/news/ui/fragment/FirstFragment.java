package com.tb.wangfang.news.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FirstContract;
import com.tb.wangfang.news.presenter.FirstPresenter;
import com.youth.banner.Banner;

import java.util.List;

import butterknife.BindView;


public class FirstFragment extends BaseFragment<FirstPresenter> implements FirstContract.View {

    private static final String TAG = "FirstFragment";

    @BindView(R.id.banner)
    Banner banner;




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
        mPresenter.getDailyData();


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @Override
    public void showSpanner(List<String> imgUrl) {

        banner.setImageLoader(mPresenter.getImageLoader());
        //设置图片集合
        banner.setImages(imgUrl);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

}

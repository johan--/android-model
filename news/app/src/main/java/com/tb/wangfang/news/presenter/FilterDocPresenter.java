package com.tb.wangfang.news.presenter;

import android.util.Log;

import com.google.gson.Gson;
import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.bean.SearchFilterListBean;
import com.tb.wangfang.news.model.bean.SearchReplyBean;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

import static com.tb.wangfang.news.app.Constants.SEARCH_LIST_CONTENT;
import static com.tb.wangfang.news.app.Constants.SEARCH_LIST_NAVIGATION;

/**
 * Created by tangbin on 2017/5/25.
 */

public class FilterDocPresenter extends RxPresenter<FilterDocContract.View> implements FilterDocContract.Presenter {
    private ManagedChannel managedChannel;
    private String TAG = "FilterDocPresenter";

    @Inject
    public FilterDocPresenter(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;

    }


    @Override
    public void search(String text, int page, String navigation, String startTime, String endTime, String sort) {
        OkHttpUtils
                .get()
                .url(SEARCH_LIST_CONTENT)
                .addParams("params", "标题:" + text)
                .addParams("page", String.valueOf(page)).addParams("pageSize", 20 + "")
                .addParams("navigation", navigation)
                .addParams("startDate", startTime)
                .addParams("endDate", endTime)
                .addParams("sortField", sort)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if ("{}".equals(response)) {
                            mView.loadSearchContent(null);
                        } else {
                            Log.d(TAG, "onResponse: " + response);
                            Gson gson = new Gson();
                            SearchReplyBean searchReplyBean = gson.fromJson(response, SearchReplyBean.class);
                            if (mView!=null){
                                mView.loadSearchContent(searchReplyBean);
                            }

                        }

                    }

                });
    }

    @Override
    public void searchNavigation(String params, String navigation, String startDate, String endDate) {
        OkHttpUtils
                .get()
                .url(SEARCH_LIST_NAVIGATION)
                .addParams("params", "标题:" + params)
                .addParams("navigation", navigation).addParams("startDate", startDate).addParams("endDate", endDate)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if ("{}".equals(response)) {
                            mView.loadFilterView(null);
                        } else {
                            Log.d(TAG, "onResponse: " + response);
                            Gson gson = new Gson();
                            SearchFilterListBean searchFilterListBean = gson.fromJson(response, SearchFilterListBean.class);
                            if (mView!=null){
                                mView.loadFilterView(searchFilterListBean);
                            }

                        }

                    }

                });
    }
}

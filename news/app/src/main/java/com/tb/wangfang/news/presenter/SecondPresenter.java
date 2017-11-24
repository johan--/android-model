package com.tb.wangfang.news.presenter;

import android.util.Log;

import com.google.gson.Gson;
import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.HotSearchBean;
import com.tb.wangfang.news.model.db.RealmHelper;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

import static com.tb.wangfang.news.app.Constants.HOT_SEARCH_WORDS;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondPresenter extends RxPresenter<SecondContract.View> implements SecondContract.Presenter {
    private final RealmHelper realmHelper;
    private ManagedChannel managedChannel;
    private String TAG = "SecondPresenter";

    @Inject
    public SecondPresenter(ManagedChannel managedChannel, RealmHelper realmHelper) {
        this.managedChannel = managedChannel;
        this.realmHelper = realmHelper;
    }


    @Override
    public void searchAllHistory() {

        mView.showHistoryItem(realmHelper.findAllHistoryItem());
    }

    @Override
    public void deleteAllHistry() {
        realmHelper.deleteHistoryAll();
        mView.showHistoryItem(new ArrayList<HistoryDocItem>());
    }

    @Override
    public void stotyHistory(HistoryDocItem item) {

        realmHelper.save(item);
    }

    @Override
    public void deleteHistory(HistoryDocItem item) {
        realmHelper.deleteHis(item);
    }

    @Override
    public void getHotDoc() {
        OkHttpUtils
                .get()
                .url(HOT_SEARCH_WORDS)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.d(TAG, "onResponse: " + response);
                        Gson gson = new Gson();
                        HotSearchBean searchBean = gson.fromJson(response, HotSearchBean.class);
                        if (mView!=null){
                            mView.showHotSearchWord(searchBean);
                        }


                    }

                });
    }
}




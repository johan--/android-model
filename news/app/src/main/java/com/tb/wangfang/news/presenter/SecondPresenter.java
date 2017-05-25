package com.tb.wangfang.news.presenter;

import android.os.Handler;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondPresenter extends RxPresenter<SecondContract.View> implements SecondContract.Presenter {
    private DataManager mDataManager;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();

    @Inject
    public SecondPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }


    @Override
    public void searchAndStore(final String text, final int page) {

        HistoryDocItem docItem = new HistoryDocItem();
        docItem.setText(text);
        docItem.setTime(System.currentTimeMillis() / 1000);
        mDataManager.save(docItem);


        if (searchDocItemArrayList != null) {
            searchDocItemArrayList.clear();
        }
        for (int i = 0; i < 20; i++) {
            searchDocItemArrayList.add(new SearchDocItem(i + ""));
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (page == 1) {

                    mView.refreshView(searchDocItemArrayList);
                } else {
                    mView.loadMoreView(searchDocItemArrayList);
                }
            }
        }, 1000);


    }

    @Override
    public void searchAllHistory() {

        mView.showHistoryItem(mDataManager.findAllHistoryItem());
    }

    @Override
    public void deleteAllHistry() {
        mDataManager.deleteHistoryAll();
        mView.showHistoryItem(new ArrayList<HistoryDocItem>());
    }


}

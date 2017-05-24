package com.tb.wangfang.news.presenter;

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
    public void searchAndStore(String text, int page) {
        mDataManager.save(new HistoryDocItem(text));
        if (searchDocItemArrayList != null ) {
            searchDocItemArrayList.clear();
        }
        for (int i = 0; i < 20; i++) {
            searchDocItemArrayList.add(new SearchDocItem(i + ""));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (page == 1) {
            mView.showSearchresult(searchDocItemArrayList);
        } else {
            mView.loadMore(searchDocItemArrayList);
        }


    }

    @Override
    public void searchAllHistory() {
        mView.showHistoryItem(mDataManager.findAllHistoryItem());
    }


}

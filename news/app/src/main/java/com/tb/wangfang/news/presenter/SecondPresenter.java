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
    public void searchAndStore(String text) {
        mDataManager.save(new HistoryDocItem(text));
        if (searchDocItemArrayList != null) {
            searchDocItemArrayList.clear();
        }
        searchDocItemArrayList.add(new SearchDocItem("1"));
        searchDocItemArrayList.add(new SearchDocItem("2"));
        mView.showSearchresult(searchDocItemArrayList);

    }

    @Override
    public void searchAllHistory() {
        mView.showHistoryItem(mDataManager.findAllHistoryItem());
    }

}

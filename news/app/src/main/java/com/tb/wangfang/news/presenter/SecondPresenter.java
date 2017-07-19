package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.db.RealmHelper;

import java.util.ArrayList;

import javax.inject.Inject;

import io.grpc.ManagedChannel;

/**
 * Created by tangbin on 2017/5/9.
 */

public class SecondPresenter extends RxPresenter<SecondContract.View> implements SecondContract.Presenter {
    private final RealmHelper realmHelper;
    private ManagedChannel managedChannel;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();

    @Inject
    public SecondPresenter(ManagedChannel managedChannel, RealmHelper realmHelper) {
        this.managedChannel = managedChannel;
        this.realmHelper=realmHelper;
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


}

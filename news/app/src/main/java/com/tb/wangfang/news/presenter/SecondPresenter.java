package com.tb.wangfang.news.presenter;

import android.content.Intent;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.SecondContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.http.response.WXHttpResponse;
import com.tb.wangfang.news.ui.activity.FilterDocActivity;
import com.tb.wangfang.news.utils.RxUtil;
import com.tb.wangfang.news.widget.CommonSubscriber;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

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


//        if (searchDocItemArrayList != null) {
//            searchDocItemArrayList.clear();
//        }
//        for (int i = 0; i < 20; i++) {
//            searchDocItemArrayList.add(new SearchDocItem(i + ""));
//        }
        Flowable<WXHttpResponse<List<SearchDocItem>>> observable;
        observable = mDataManager.fetchWechatSearchListInfo(20, page, text);
        addSubscribe(observable
                .compose(RxUtil.<WXHttpResponse<List<SearchDocItem>>>rxSchedulerHelper())
                .compose(RxUtil.<List<SearchDocItem>>handleWXResult())
                .subscribeWith(new CommonSubscriber<List<SearchDocItem>>(mView) {
                    @Override
                    public void onNext(List<SearchDocItem> wxItemBeen) {
                        if (page == 1) {
                            mView.refreshView(wxItemBeen);
                        } else {
                            mView.loadMoreView(wxItemBeen);
                        }
                    }
                })
        );


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

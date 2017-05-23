package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.HotContract;
import com.tb.wangfang.news.model.DataManager;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/23.
 */

public class HotPresenter extends RxPresenter<HotContract.View> implements HotContract.Presenter{
    private final DataManager mDataManager;

    @Inject
    public HotPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }
}

package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.DataManager;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/25.
 */

public class FilterDocPresenter extends RxPresenter<FilterDocContract.View> implements FilterDocContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public FilterDocPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;

    }
}

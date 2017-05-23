package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.QuickSeeContract;
import com.tb.wangfang.news.model.DataManager;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/23.
 */

public class QuickSeePresenter extends RxPresenter<QuickSeeContract.View> implements QuickSeeContract.Presenter {
    private final DataManager mDataManager;

    @Inject
    public QuickSeePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }
}

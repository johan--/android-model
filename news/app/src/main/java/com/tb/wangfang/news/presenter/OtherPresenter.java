package com.tb.wangfang.news.presenter;

import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.OtherContract;
import com.tb.wangfang.news.model.DataManager;

import javax.inject.Inject;

/**
 * Created by tangbin on 2017/5/23.
 */

public class OtherPresenter extends RxPresenter<OtherContract.View> implements OtherContract.Presenter {

    private final DataManager mDataManager;

    @Inject
    public OtherPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }
}

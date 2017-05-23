package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;

/**
 * Created by tangbin on 2017/5/23.
 */

public interface HotContract {
    interface View extends BaseView {


    }

    interface Presenter extends BasePresenter<View> {


    }
}

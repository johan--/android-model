package com.tb.wangfang.news.base;

/**
 * Created by tangbin on 2017/5/8.
 */

public interface BasePresenter<T extends BaseView>{

    void attachView(T view);

    void detachView();
}

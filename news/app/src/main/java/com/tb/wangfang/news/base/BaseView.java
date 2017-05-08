package com.tb.wangfang.news.base;

/**
 * Created by tangbin on 2017/5/8.
 */
public interface BaseView {

    void showErrorMsg(String msg);

    void useNightMode(boolean isNight);

    //=======  State  =======
    void stateError();

    void stateLoading();

    void stateMain();
}

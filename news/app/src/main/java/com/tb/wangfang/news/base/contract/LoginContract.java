package com.tb.wangfang.news.base.contract;

import com.tb.wangfang.news.base.BasePresenter;
import com.tb.wangfang.news.base.BaseView;
import com.wanfang.personal.LoginResponse;

/**
 * Created by tangbin on 2017/8/3.
 */

public interface LoginContract {
    interface View extends BaseView {
        void loginSuccess(LoginResponse response);

        void showCountDown(int num);

    }

    interface Presenter extends BasePresenter<View> {
        void AccountLogin(String account, String passWord);

        void getPhoneCaptcha(String phone);
    }
}

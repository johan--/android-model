package com.tb.wangfang.news.model.prefs;

import com.wanfang.personal.LoginResponse;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface PreferencesHelper {

    void setTextSizeState(String state);

    String getTextSizeState();

    void setLoginState(boolean state);

    boolean getLoginState();

    void storeLoginInfo(LoginResponse response);

    String getUserId();


}

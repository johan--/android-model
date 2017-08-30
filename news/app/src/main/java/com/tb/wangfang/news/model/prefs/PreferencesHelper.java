package com.tb.wangfang.news.model.prefs;

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


}

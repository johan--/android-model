package com.tb.wangfang.news.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.wanfang.personal.LoginResponse;

import javax.inject.Inject;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public class ImplPreferencesHelper implements PreferencesHelper {

    private static final boolean DEFAULT_NIGHT_MODE = false;
    private static final boolean DEFAULT_NO_IMAGE = false;
    private static final boolean DEFAULT_AUTO_SAVE = true;

    private static final String SHAREDPREFERENCES_NAME = "my_sp";

    private final SharedPreferences mSPrefs;

    @Inject
    public ImplPreferencesHelper() {
        mSPrefs = App.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
    }


    @Override
    public void setTextSizeState(String state) {
        mSPrefs.edit().putString(Constants.TEXT_SIZE, state).apply();
    }

    @Override
    public String getTextSizeState() {
        return mSPrefs.getString(Constants.TEXT_SIZE, "1");
    }

    @Override
    public void setLoginState(boolean state) {
        mSPrefs.edit().putBoolean(Constants.LOGIN_STATE, state).apply();
    }

    @Override
    public boolean getLoginState() {
        return mSPrefs.getBoolean(Constants.LOGIN_STATE, false);
    }

    @Override
    public void storeLoginInfo(LoginResponse response) {
        mSPrefs.edit().putString(Constants.USER_AVATAR, response.getUserAvatarUrl()).putString(Constants.USER_ID, response.getUserId())
                .putString(Constants.USER_NAME, response.getUserName()).putString(Constants.LOGIN_TOKEN, response.getLoginToken()).apply();
    }

    @Override
    public String getUserId() {
        return mSPrefs.getString(Constants.USER_ID, "");
    }

    @Override
    public String getLoginToken() {
        return mSPrefs.getString(Constants.LOGIN_TOKEN, "");
    }

    @Override
    public String getUserAvatar() {
        return mSPrefs.getString(Constants.USER_AVATAR, "");
    }

    @Override
    public String getUserName() {
        return mSPrefs.getString(Constants.USER_NAME, "");
    }

    @Override
    public void setUserAvatar(String url) {
        mSPrefs.edit().putString(Constants.USER_AVATAR, url).apply();
    }
}

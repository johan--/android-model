package com.tb.wangfang.news.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;

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
}

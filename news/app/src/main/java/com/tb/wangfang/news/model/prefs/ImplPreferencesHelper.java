package com.tb.wangfang.news.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.model.bean.KeyValueListBean;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.SubjectListResponse;

import com.wanfang.personal.UserRolesListResponse;

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
    public void setTextSizeState(float state) {
        mSPrefs.edit().putFloat(Constants.TEXT_SIZE, state).apply();
    }

    @Override
    public float getTextSizeState() {
        return mSPrefs.getFloat(Constants.TEXT_SIZE, 1f);
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
    public void storeLoginInfo(LoginResponse response, String password) {

        mSPrefs.edit().putString(Constants.USER_AVATAR, response.getUserAvatarUrl()).putString(Constants.USER_ID, response.getUserId())
                .putString(Constants.USER_NAME, response.getUserRealName()).putString(Constants.LOGIN_TOKEN, response.getLoginToken()).apply();
    }

    @Override
    public String getPassword() {
        return mSPrefs.getString(Constants.PASS_WORD, "");
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

    @Override
    public void storeUserRolesMap(UserRolesListResponse userRolesListResponse) {
        Gson gson = new Gson();
        KeyValueListBean bean = new KeyValueListBean();
        bean.setHashMap(userRolesListResponse.getRolesMap());
        mSPrefs.edit().putString(Constants.USER_ROLES_MAP, gson.toJson(bean)).apply();
    }

    @Override
    public void storeSubjectMap(SubjectListResponse subjectListResponse) {
        Gson gson = new Gson();

        mSPrefs.edit().putString(Constants.SUBJECT_MAP, gson.toJson(subjectListResponse)).apply();
    }

    @Override
    public void storeEducationMap(EducationLevelListResponse EducationLevelListResponse) {
        Gson gson = new Gson();
        KeyValueListBean bean = new KeyValueListBean();
        bean.setHashMap(EducationLevelListResponse.getEducationLevelsMap());
        mSPrefs.edit().putString(Constants.EDUCATION_MAP, gson.toJson(bean)).apply();
    }

    @Override
    public KeyValueListBean getUserRolesMap() {
        Gson gson = new Gson();
        String json = mSPrefs.getString(Constants.USER_ROLES_MAP, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        return gson.fromJson(json, KeyValueListBean.class);
    }

    @Override
    public SubjectListResponse getSubjectMap() {
        Gson gson = new Gson();
        String json = mSPrefs.getString(Constants.SUBJECT_MAP, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        return gson.fromJson(json, SubjectListResponse.class);
    }

    @Override
    public KeyValueListBean getEducationMap() {
        Gson gson = new Gson();
        String json = mSPrefs.getString(Constants.EDUCATION_MAP, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        return gson.fromJson(json, KeyValueListBean.class);
    }
}

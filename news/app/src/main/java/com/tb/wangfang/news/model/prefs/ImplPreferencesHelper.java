package com.tb.wangfang.news.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.model.bean.KeyValueListBean;
import com.tb.wangfang.news.utils.DateUtils;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.UserRolesListResponse;

import java.util.Date;

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
    private String TAG = "ImplPreferencesHelper";

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
        if (!state) {
            mSPrefs.edit().clear().apply();
        }
    }

    @Override
    public boolean getLoginState() {
        return mSPrefs.getBoolean(Constants.LOGIN_STATE, false);
    }

    @Override
    public void storeLoginInfo(LoginResponse response, String password) {

        mSPrefs.edit().putString(Constants.USER_AVATAR, response.getUserAvatarUrl()).putString(Constants.USER_ID, response.getUserId())
                .putString(Constants.USER_NAME, response.getUserRealName()).putString(Constants.LOGIN_TOKEN, response.getLoginToken()).putString(Constants.PASS_WORD, password).apply();
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

    @Override
    public boolean CheckSmsTen() {
        SharedPreferences sharedPreferences = App.getInstance().getSharedPreferences("my_sp", Context.MODE_APPEND);
        int num = 0;
        Date dateNow = new Date(System.currentTimeMillis());
        String timeString = sharedPreferences.getString(Constants.SMS_RECORD, "");
        String[] times = timeString.split(",");
        for (int i = 0; i < times.length; i++) {
            Date date = DateUtils.parseDate(times[i], "yyyy-MM-dd HH:mm");
            if (date == null) {
                continue;
            }
            long differHour = DateUtils.calculateDifferentMinute(date, dateNow);
            if (differHour <= 60) {
                num++;
            }
        }
        //只保留最近11条记录
        StringBuilder builder = new StringBuilder();
        Log.e(TAG, "CheckSmsTen: lenth" + times.length);
        if (times.length > 11) {
            for (int i = times.length - 1; i >= 0; i--) {

                builder.append("," + times[i]);
                Log.d(TAG, "CheckSmsTen: " + i);
            }

            mSPrefs.edit().putString(Constants.SMS_RECORD, builder.toString()).apply();
        }

        if (num > 10) {
            return false;
        }
        return true;
    }

    @Override
    public void putCurrentTime() {
        SharedPreferences sharedPreferences = App.getInstance().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
        String oldData = sharedPreferences.getString(Constants.SMS_RECORD, "");
        SharedPreferences.Editor editor = sharedPreferences.edit();//获取编辑器
        editor.putString(Constants.SMS_RECORD, oldData + DateUtils.formatDate("yyyy-MM-dd HH:mm") + ",");
        editor.commit();//提交修改
    }

    @Override
    public void setLoginMethod(String method) {
        mSPrefs.edit().putString(Constants.loginMethod, method).apply();
    }

    @Override
    public String getLoginMethod() {
        return mSPrefs.getString(Constants.loginMethod, "");
    }
}

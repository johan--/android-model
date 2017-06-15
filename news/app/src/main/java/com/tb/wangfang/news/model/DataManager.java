package com.tb.wangfang.news.model;


import com.tb.wangfang.news.model.bean.DailyListBean;
import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.model.bean.HistoryDocItem;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.model.db.DBHelper;
import com.tb.wangfang.news.model.http.HttpHelper;
import com.tb.wangfang.news.model.http.response.WXHttpResponse;
import com.tb.wangfang.news.model.prefs.PreferencesHelper;

import java.util.List;

import io.reactivex.Flowable;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @desciption:
 */

public class DataManager implements HttpHelper, DBHelper, PreferencesHelper {

    HttpHelper mHttpHelper;
    DBHelper mDbHelper;
    PreferencesHelper mPreferencesHelper;

    public DataManager(HttpHelper httpHelper, DBHelper dbHelper, PreferencesHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
    }

    @Override
    public boolean getNightModeState() {
        return mPreferencesHelper.getNightModeState();
    }

    @Override
    public void setNightModeState(boolean state) {
        mPreferencesHelper.setNightModeState(state);
    }

    @Override
    public boolean getNoImageState() {
        return mPreferencesHelper.getNoImageState();
    }

    @Override
    public void setNoImageState(boolean state) {
        mPreferencesHelper.setNoImageState(state);
    }

    @Override
    public boolean getAutoCacheState() {
        return mPreferencesHelper.getAutoCacheState();
    }

    @Override
    public void setAutoCacheState(boolean state) {
        mPreferencesHelper.setAutoCacheState(state);
    }

    @Override
    public Flowable<DailyListBean> fetchDailyListInfo() {
        return mHttpHelper.fetchDailyListInfo();
    }

    @Override
    public Flowable<WXHttpResponse<List<SearchDocItem>>> fetchWechatSearchListInfo(int num, int page, String word) {
        return mHttpHelper.fetchWechatSearchListInfo(num, page, word);
    }


    @Override
    public void save(DownInfo info) {
        mDbHelper.save(info);
    }

    @Override
    public void update(DownInfo info,int state) {
        mDbHelper.update(info,state);
    }

    @Override
    public void deleteDowninfo(DownInfo info) {
        mDbHelper.deleteDowninfo(info);
    }

    @Override
    public DownInfo queryDownBy(long id) {
        return mDbHelper.queryDownBy(id);
    }

    @Override
    public DownInfo queryDownBy(String url) {
        return mDbHelper.queryDownBy(url);
    }

    @Override
    public List<DownInfo> queryDownAll() {
        return mDbHelper.queryDownAll();
    }

    @Override
    public void save(HistoryDocItem item) {
        mDbHelper.save(item);
    }

    @Override
    public void deleteHistoryAll() {
        mDbHelper.deleteHistoryAll();
    }

    @Override
    public List<HistoryDocItem> findAllHistoryItem() {
        return mDbHelper.findAllHistoryItem();
    }
}


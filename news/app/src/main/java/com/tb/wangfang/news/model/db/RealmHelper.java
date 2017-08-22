package com.tb.wangfang.news.model.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.tb.greendao.gen.DaoMaster;
import com.tb.greendao.gen.DaoSession;
import com.tb.greendao.gen.HistoryDocItemDao;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.model.bean.HistoryDocItem;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by codeest on 16/8/16.
 */

public class RealmHelper implements DBHelper {

    private RealmHelper dbHelp;
    private final static String dbName = "tests_db";
    private DaoMaster.DevOpenHelper openHelper;
    private Context context;

    @Inject
    public RealmHelper(App app) {
        context = App.getInstance();
        openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);


    }

    /**
     * 获取可读数据库
     */
    private SQLiteDatabase getReadableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getReadableDatabase();
        return db;
    }

    /**
     * 获取可写数据库
     */
    private SQLiteDatabase getWritableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getWritableDatabase();
        return db;
    }

    @Override
    public void save(HistoryDocItem item) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        HistoryDocItemDao downInfoDao = daoSession.getHistoryDocItemDao();
        downInfoDao.delete(item);
        downInfoDao.insert(item);
    }

    @Override
    public void deleteHis(HistoryDocItem item) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        HistoryDocItemDao downInfoDao = daoSession.getHistoryDocItemDao();
        downInfoDao.delete(item);
    }

    @Override
    public void deleteHistoryAll() {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        HistoryDocItemDao historyDocItemDao = daoSession.getHistoryDocItemDao();
        historyDocItemDao.deleteAll();
    }

    @Override
    public List<HistoryDocItem> findAllHistoryItem() {
        DaoMaster daoMaster = new DaoMaster(getReadableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        HistoryDocItemDao historyDocItemDao = daoSession.getHistoryDocItemDao();
        QueryBuilder<HistoryDocItem> qb = historyDocItemDao.queryBuilder().orderDesc(HistoryDocItemDao.Properties.Time);
        return qb.list();
    }


}

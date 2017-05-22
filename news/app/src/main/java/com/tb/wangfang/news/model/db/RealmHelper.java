package com.tb.wangfang.news.model.db;


import com.tb.wangfang.news.model.bean.DownInfo;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Created by codeest on 16/8/16.
 */

public class RealmHelper implements DBHelper {

    private static final String DB_NAME = "myRealm.realm";

    private Realm mRealm;

    @Inject
    public RealmHelper() {
        mRealm = Realm.getInstance(new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .name(DB_NAME)
                .build());
    }

    @Override
    public void save(DownInfo info) {
        mRealm.beginTransaction();
        mRealm.copyToRealmOrUpdate(info);
        mRealm.commitTransaction();
    }

    @Override
    public void update(DownInfo info) {
        mRealm.beginTransaction();
        mRealm.copyToRealmOrUpdate(info);
        mRealm.commitTransaction();
    }

    @Override
    public void deleteDowninfo(DownInfo info) {
        DownInfo data = mRealm.where(DownInfo.class).equalTo("id", info.getId()).findFirst();
        mRealm.beginTransaction();
        if (data != null) {
            data.deleteFromRealm();
        }
        mRealm.commitTransaction();
    }

    @Override
    public DownInfo queryDownBy(long Id) {
        return mRealm.where(DownInfo.class).equalTo("id", Id).findFirst();
    }

    @Override
    public List<DownInfo> queryDownAll() {


        RealmResults<DownInfo> dogs = mRealm.where(DownInfo.class).findAll();

        return mRealm.copyFromRealm(dogs);
    }
}

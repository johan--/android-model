package com.tb.wangfang.news.model.bean;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tangbin on 2017/5/23.
 */

public class HistoryDocItem extends RealmObject {
    @PrimaryKey
    private long id;
    private String text;

    public HistoryDocItem(String text) {
        this.text = text;
    }
}

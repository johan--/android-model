package com.tb.wangfang.news.model.bean;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tangbin on 2017/5/23.
 */


public class HistoryDocItem extends RealmObject {
    @PrimaryKey
    private String id;

    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

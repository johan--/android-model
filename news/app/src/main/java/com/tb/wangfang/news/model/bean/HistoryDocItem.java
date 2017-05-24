package com.tb.wangfang.news.model.bean;

<<<<<<< HEAD
=======
import io.realm.RealmObject;
>>>>>>> 5c92c93e675a05e15657463087682632f0d9ae3c
import io.realm.annotations.PrimaryKey;

/**
 * Created by tangbin on 2017/5/23.
 */

<<<<<<< HEAD
public class HistoryDocItem {
    @PrimaryKey
    private String id;
=======
public class HistoryDocItem extends RealmObject {
    @PrimaryKey
    private long id;
>>>>>>> 5c92c93e675a05e15657463087682632f0d9ae3c
    private String text;

    public HistoryDocItem(String text) {
        this.text = text;
    }
}

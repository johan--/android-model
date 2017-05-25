package com.tb.wangfang.news.model.bean;


import io.realm.RealmObject;

/**
 * Created by tangbin on 2017/5/23.
 */


public class HistoryDocItem extends RealmObject {
    private long time;

    private String text;

    public long getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryDocItem docItem = (HistoryDocItem) o;

        return text.equals(docItem.text);

    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

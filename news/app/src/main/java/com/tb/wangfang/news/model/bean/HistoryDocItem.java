package com.tb.wangfang.news.model.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by tangbin on 2017/5/23.
 */

@Entity
public class HistoryDocItem {
    private long time;

    private String text;

    public long getTime() {
        return time;
    }

    @Generated(hash = 15921219)
    public HistoryDocItem(long time, String text) {
        this.time = time;
        this.text = text;
    }

    @Generated(hash = 1510618610)
    public HistoryDocItem() {
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

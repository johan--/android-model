package com.tb.wangfang.news.model.bean;

/**
 * Created by tangbin on 2017/5/23.
 */

public class SearchDocItem {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SearchDocItem(String text) {
        this.text = text;
    }
}

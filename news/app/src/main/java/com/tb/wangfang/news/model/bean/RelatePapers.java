package com.tb.wangfang.news.model.bean;

/**
 * Created by tangbin on 2017/11/13.
 */

public class RelatePapers {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String type;
    private String id;
    private String title;
}

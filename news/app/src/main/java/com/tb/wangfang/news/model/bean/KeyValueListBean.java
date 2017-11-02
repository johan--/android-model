package com.tb.wangfang.news.model.bean;

import java.util.Map;

/**
 * Created by tangbin on 2017/11/2.
 */

public class KeyValueListBean {
    public Map<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    Map<String,String> hashMap;
}

package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by tangbin on 2017/8/22.
 */

public class ItemQuestion implements MultiItemEntity {
    private int itemType;

    public ItemQuestion(int itemType, String imgUrl) {
        this.itemType = itemType;
        this.imgUrl = imgUrl;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private String imgUrl;

    @Override
    public int getItemType() {
        return itemType;
    }
}

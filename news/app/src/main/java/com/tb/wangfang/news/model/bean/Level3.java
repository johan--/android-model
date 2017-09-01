package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;

/**
 * Created by tangbin on 2017/9/1.
 */

public class Level3 implements MultiItemEntity {
    public String text;
    int parentId = -1;
    int childId = -1;

    boolean isSelected = false;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override

    public int getItemType() {
        return FilterExpandAdapter.TYPE_LEVEL_3;
    }
}

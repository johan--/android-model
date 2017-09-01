package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;

/**
 * Created by tangbin on 2017/9/1.
 */

public class Level2 extends AbstractExpandableItem<Level3> implements MultiItemEntity {
    String text;
    int seletedPosition = -1;

    public int getSeletedPosition() {
        return seletedPosition;
    }

    public void setSeletedPosition(int seletedPosition) {
        this.seletedPosition = seletedPosition;
    }

    @Override
    public int getItemType() {
        return FilterExpandAdapter.TYPE_LEVEL_2;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
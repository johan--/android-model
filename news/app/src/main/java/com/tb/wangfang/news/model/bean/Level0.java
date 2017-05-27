package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;

/**
 * Created by tangbin on 2017/5/27.
 */

public class Level0 extends AbstractExpandableItem<Level1> implements MultiItemEntity {
    String text;

    @Override
    public int getItemType() {
        return FilterExpandAdapter.TYPE_LEVEL_0;
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

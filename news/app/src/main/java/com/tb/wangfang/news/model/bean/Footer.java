package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;

/**
 * Created by tangbin on 2017/9/1.
 */

public class Footer implements MultiItemEntity {
    @Override
    public int getItemType() {
        return FilterExpandAdapter.TYPE_LEVEL_2;
    }
}

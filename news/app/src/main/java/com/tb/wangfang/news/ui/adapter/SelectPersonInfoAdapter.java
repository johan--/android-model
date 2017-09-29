package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.MapMessage;

import java.util.List;

/**
 * Created by tangbin on 2017/8/28.
 */

public class SelectPersonInfoAdapter extends BaseQuickAdapter<MapMessage, BaseViewHolder> {
    int type;

    public SelectPersonInfoAdapter(@Nullable List<MapMessage> data, int type) {
        super(R.layout.item_select_info, data);
        this.type = type;
    }

    @Override
    protected void convert(BaseViewHolder helper, MapMessage item) {

//        if (type == TYPE_JOB_TITLE || type == TYPE_UNIT_DEPARTMENT || type == TYPE_EDUCATION || type == TYPE_GRADUATE_SCHOOL_DEPARTMENT ||
//                type == TYPE_SUBJECT_TWO) {
//            helper.setText(R.id.tv_name, item.getValue()).setVisible(R.id.iv_step, false);
//
//        } else if (type == TYPE_UNIT || type == TYPE_GRADUATE_SCHOOL || type == TYPE_SUBJECT || type == TYPE_SUBJECT_ONE) {
//            helper.setText(R.id.tv_name, item.getValue()).setVisible(R.id.iv_step, true);
//        }
        if (item.isHasNext()) {
            helper.setText(R.id.tv_name, item.getValue()).setVisible(R.id.iv_step, true);
        } else {
            helper.setText(R.id.tv_name, item.getValue()).setVisible(R.id.iv_step, false);
        }
    }
}

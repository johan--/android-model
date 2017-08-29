package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;

import java.util.List;

import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_EDUCATION;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_GRADUATE_SCHOOL;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_GRADUATE_SCHOOL_DEPARTMENT;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_JOB_TITLE;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_SUBJECT;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_SUBJECT_ONE;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_SUBJECT_TWO;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_UNIT;
import static com.tb.wangfang.news.ui.activity.PersonEditListActivity.TYPE_UNIT_DEPARTMENT;

/**
 * Created by tangbin on 2017/8/28.
 */

public class SelectPersonInfoAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    int type;

    public SelectPersonInfoAdapter(@Nullable List<String> data, int type) {
        super(R.layout.item_select_info, data);
        this.type = type;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        if (type == TYPE_JOB_TITLE || type == TYPE_UNIT_DEPARTMENT || type == TYPE_EDUCATION || type == TYPE_GRADUATE_SCHOOL_DEPARTMENT ||
                type == TYPE_SUBJECT_TWO) {
            helper.setText(R.id.tv_name, item).setVisible(R.id.iv_step, false);

        } else if (type == TYPE_UNIT || type == TYPE_GRADUATE_SCHOOL || type == TYPE_SUBJECT || type == TYPE_SUBJECT_ONE) {
            helper.setText(R.id.tv_name, item).setVisible(R.id.iv_step, true);
        }

    }
}

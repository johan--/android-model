package com.tb.wangfang.news.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.ui.activity.PersonEditListActivity;

import java.util.List;

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

        if (type == PersonEditListActivity.TYPE_JOB_TITLE) {
            helper.setText(R.id.tv_name, item).setVisible(R.id.iv_step, false);

        } else if (type == PersonEditListActivity.TYPE_SUBJECT) {
            helper.setText(R.id.tv_name, item).setVisible(R.id.iv_step, true);
        } else if (type == PersonEditListActivity.TYPE_UNIT) {
            helper.setText(R.id.tv_name, item).setVisible(R.id.iv_step, false);
        }

    }
}

package com.tb.wangfang.news.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.JournalYearBean;
import com.tb.wangfang.news.utils.SystemUtil;

import java.util.List;

import static com.tb.wangfang.news.R.id.tv_period_name;

/**
 * Created by tangbin on 2017/8/16.
 */

public class JournalPeriodAdapter extends BaseQuickAdapter<JournalYearBean.DataBean, BaseViewHolder> {
    Context context;
    private String preIsue = "";
    private String forwardIsue = "";

    public JournalPeriodAdapter(Context context, @Nullable List<JournalYearBean.DataBean> data) {
        super(R.layout.item_article_period, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, JournalYearBean.DataBean item) {
        if (helper.getAdapterPosition() < getData().size() - 1) {
            forwardIsue = getData().get(helper.getAdapterPosition() + 1).getIssue_num().toString();
        } else {
            forwardIsue = "-1";
        }
        if (helper.getAdapterPosition() > 0) {
            preIsue = getData().get(helper.getAdapterPosition() - 1).getIssue_num().toString();
        } else {
            preIsue = "-1";
        }

        if (preIsue.equals(item.getIssue_num()) && forwardIsue.equals(item.getIssue_num())) {
            helper.getView(R.id.v_line_top).setVisibility(View.VISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.VISIBLE);
            helper.getView(tv_period_name).setVisibility(View.INVISIBLE);


        } else if (preIsue.equals(item.getIssue_num()) && !forwardIsue.equals(item.getIssue_num())) {
            helper.getView(R.id.v_line_top).setVisibility(View.VISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.INVISIBLE);
            helper.getView(tv_period_name).setVisibility(View.INVISIBLE);
        } else if (!preIsue.equals(item.getIssue_num()) && forwardIsue.equals(item.getIssue_num())) {
            helper.getView(R.id.v_line_top).setVisibility(View.INVISIBLE);
            helper.getView(R.id.v_line_bottom).setVisibility(View.VISIBLE);
            helper.getView(tv_period_name).setVisibility(View.VISIBLE);
            helper.setText(R.id.tv_period_name, SystemUtil.getObjectString(item.getIssue_num()) + "期");
        }
        helper.setText(R.id.tv_title, SystemUtil.getObjectString(item.getTitle()));

    }
}

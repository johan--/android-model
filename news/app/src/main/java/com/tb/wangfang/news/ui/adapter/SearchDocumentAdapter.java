package com.tb.wangfang.news.ui.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.model.bean.SearchReplyBean;
import com.tb.wangfang.news.utils.DateUtils;
import com.tb.wangfang.news.utils.SystemUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tangbin on 2017/5/23.
 */

public class SearchDocumentAdapter extends BaseQuickAdapter<SearchReplyBean.DataBean, BaseViewHolder> {

    public SearchDocumentAdapter(List<SearchReplyBean.DataBean> searchDocItemList) {

        super(R.layout.item_search_result, searchDocItemList);
    }

    @Override
    protected void convert(BaseViewHolder helper, SearchReplyBean.DataBean item) {
        if (item.getClass_type().equals("patent_element")) {
            helper.setText(R.id.tv_author, SystemUtil.getObjectString(item.getPatent_type()));
            helper.setText(R.id.tv_book_name, SystemUtil.getStringFromJsonarray(item.getApplicant_name()));

        } else if (item.getClass_type().equals("perio_artical")) {

            helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name()));

            if (item.getPerio_title02() != null) {
                helper.setText(R.id.tv_book_name, "《" + item.getPerio_title02().toString() + "》");
            }

        } else if (item.getClass_type().equals("degree_artical")) {

            helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name()));

            String s1 = "";
            String s2 = "";
            if (item.getUnit_name02() != null) {
                s2 = item.getUnit_name02().toString();
            }
            s1 = SystemUtil.getStringFromJsonarray(item.getMajor_name());
            helper.setText(R.id.tv_book_name, s1 + " " + s2);

            helper.setText(R.id.tv_period, SystemUtil.getStringFromJsonarray(item.getPublish_year()));


        } else if (item.getClass_type().equals("conf_artical")) {

            helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name()));

            if (item.getConf_year() != null) {
                helper.setText(R.id.tv_book_name, SystemUtil.getStringFromJsonarray(item.getConf_year()));
            }
            if (item.getConf_name() != null) {
                helper.setText(R.id.tv_period, SystemUtil.getStringFromJsonarray(item.getConf_name()));
            }
        } else if (item.getClass_type().equals("legislations")) {
            ArrayList<String> s = new ArrayList<>();
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getPublish_num()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getPublish_num()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getIssue_dept()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getIssue_dept()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getDb_name()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getDb_name()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getIssue_date02()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getIssue_date02()));
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromListPozhe(s));
        } else if (item.getClass_type().equals("standards")) {
            ArrayList<String> s = new ArrayList<>();
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getStand_num()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getStand_num()));
            }
            s.add("中外标准");
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getBelong_type()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getBelong_type()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getIssue_date()))) {
                Date date = DateUtils.parseDate(SystemUtil.getStringFromJsonarray(item.getIssue_date()));
                s.add(DateUtils.formatDate(date, "yyyy-MM"));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getStand_status()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getStand_status()));
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromList(s));
        } else if (item.getClass_type().equals("tech_result")) {
            ArrayList<String> s = new ArrayList<>();
            if (item.getClass_code() != null) {
                s.add(SystemUtil.getStringFromJsonarray(item.getClass_code()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getResult_type()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getResult_type()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getIndustry_name()))) {
                s.add(SystemUtil.getStringFromJsonarray(item.getIndustry_name()));
            }
            if (!TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(item.getRe_pubdate()))) {
                s.add("公布年份:" + SystemUtil.getStringFromJsonarray(item.getRe_pubdate()));
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromList(s));
        }
        if (item.getTitle() != null) {
            helper.setText(R.id.tv_articl_title, SystemUtil.getStringFromJsonarray(item.getTitle()));
        }
        if (!TextUtils.isEmpty(SystemUtil.getObjectString(item.getSummary()))) {
            helper.setText(R.id.tv_content, "摘要: " + item.getSummary().toString()).setVisible(R.id.tv_content, true);
        } else {
            helper.setVisible(R.id.tv_content, false);
        }
        if (item.getApp_date02() != null) {
            helper.setText(R.id.tv_period, item.getApp_date02().toString());
        }
        TextView textView = helper.getView(R.id.tv_author);
        TextView textView2 = helper.getView(R.id.tv_book_name);
        TextView textView3 = helper.getView(R.id.tv_period);
        if (TextUtils.isEmpty(textView.getText().toString()) && TextUtils.isEmpty(textView2.getText().toString()) && TextUtils.isEmpty(textView3.getText().toString())) {
            helper.getView(R.id.fl_content).setVisibility(View.GONE);
        } else {
            helper.getView(R.id.fl_content).setVisibility(View.VISIBLE);
        }

        helper.setText(R.id.tv_summary_num, "文摘阅读 : " + item.getAbstract_reading_num()).setText(R.id.tv_down_num, "下载 : " + item.getDownload_num())
                .setText(R.id.tv_link_num, "第三方链接 : " + item.getNote_num()).setText(R.id.tv_reference_num, "被引用 : " + item.getImport_num());
        helper.addOnClickListener(R.id.tv_book_name);

    }
}

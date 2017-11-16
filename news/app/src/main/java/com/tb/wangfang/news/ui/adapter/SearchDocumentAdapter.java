package com.tb.wangfang.news.ui.adapter;

import android.text.TextUtils;

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
            helper.setText(R.id.tv_author, item.getPatent_type().toString());
            if (item.getApplicant_name() != null && item.getApplicant_name().toString().startsWith("[")) {

                helper.setText(R.id.tv_book_name, SystemUtil.getStringFromJsonarray(item.getApplicant_name().toString()));


            } else if (item.getApplicant_name() != null) {
                helper.setText(R.id.tv_book_name, item.getApplicant_name().toString());
            }
        } else if (item.getClass_type().equals("perio_artical")) {
            if (item.getAuthors_name() != null && item.getAuthors_name().toString().startsWith("[")) {
                helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name().toString()));
            } else if (item.getAuthors_name() != null) {
                helper.setText(R.id.tv_author, item.getAuthors_name().toString());
            }
            if (item.getPerio_title02() != null) {
                helper.setText(R.id.tv_book_name, "《" + item.getPerio_title02().toString() + "》");
            }

        } else if (item.getClass_type().equals("degree_artical")) {
            if (item.getAuthors_name() != null && item.getAuthors_name().toString().startsWith("[")) {
                helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name().toString()));
            } else if (item.getAuthors_name() != null) {
                helper.setText(R.id.tv_author, item.getAuthors_name().toString());
            }
            String s1 = "";
            String s2 = "";
            if (item.getUnit_name02() != null) {
                s2 = item.getUnit_name02().toString();
            }
            if (item.getMajor_name() != null) {
                s1 = item.getMajor_name();
            }
            helper.setText(R.id.tv_book_name, s1 + " " + s2);
            if (item.getPublish_year() != null) {
                helper.setText(R.id.tv_period, item.getPublish_year());
            }


        } else if (item.getClass_type().equals("conf_artical")) {
            if (item.getAuthors_name() != null && item.getAuthors_name().toString().startsWith("[")) {
                helper.setText(R.id.tv_author, SystemUtil.getStringFromJsonarray(item.getAuthors_name().toString()));
            } else if (item.getAuthors_name() != null) {
                helper.setText(R.id.tv_author, item.getAuthors_name().toString());
            }
            if (item.getConf_year() != null) {
                helper.setText(R.id.tv_book_name, item.getConf_year());
            }
            if (item.getConf_name() != null) {
                helper.setText(R.id.tv_period, item.getConf_name());
            }
        } else if (item.getClass_type().equals("legislations")) {
            ArrayList<String> s = new ArrayList<>();
            if (!TextUtils.isEmpty(item.getPublish_num())) {
                s.add(item.getPublish_num());
            }
            if (!TextUtils.isEmpty(item.getIssue_dept())) {
                s.add(item.getIssue_dept());
            }
            if (!TextUtils.isEmpty(item.getDb_name())) {
                s.add(item.getDb_name());
            }
            if (!TextUtils.isEmpty(item.getIssue_date02())) {
                s.add(item.getIssue_date02());
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromListPozhe(s));
        } else if (item.getClass_type().equals("standards")) {
            ArrayList<String> s = new ArrayList<>();
            if (!TextUtils.isEmpty(item.getStand_num())) {
                s.add(item.getStand_num());
            }
            s.add("中外标准");
            if (!TextUtils.isEmpty(item.getBelong_type())) {
                s.add(item.getBelong_type());
            }
            if (!TextUtils.isEmpty(item.getIssue_date())) {
                Date date = DateUtils.parseDate(item.getIssue_date());
                s.add(DateUtils.formatDate(date, "yyyy-MM"));
            }
            if (!TextUtils.isEmpty(item.getStand_status())) {
                s.add(item.getStand_status());
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromList(s));
        } else if (item.getClass_type().equals("tech_result")) {
            ArrayList<String> s = new ArrayList<>();
            if (item.getClass_code() != null) {
                s.add(SystemUtil.getStringFromJsonarray(item.getClass_code().toString()));
            }
            if (!TextUtils.isEmpty(item.getResult_type())) {
                s.add(item.getResult_type());
            }
            if (!TextUtils.isEmpty(item.getIndustry_name())) {
                s.add(item.getIndustry_name());
            }
            if (!TextUtils.isEmpty(item.getRe_pubdate())) {
                s.add("公布年份:" + item.getRe_pubdate());
            }
            helper.setText(R.id.tv_author, SystemUtil.getStringFromList(s));
        }
        if (item.getTitle() != null) {
            helper.setText(R.id.tv_articl_title, item.getTitle().toString());
        }
        if (item.getSummary() != null) {
            helper.setText(R.id.tv_content, "摘要: " + item.getSummary().toString());
        } else {
            helper.setText(R.id.tv_content, "摘要: 无");
        }
        if (item.getApp_date02() != null) {
            helper.setText(R.id.tv_period, item.getApp_date02().toString());
        }
        helper.setText(R.id.tv_summary_num, "文摘阅读 : " + item.getAbstract_reading_num()).setText(R.id.tv_down_num, "下载 : " + item.getDownload_num())
                .setText(R.id.tv_link_num, "第三方链接 : " + item.getNote_num()).setText(R.id.tv_reference_num, "被引用 : " + item.getImport_num());
        helper.addOnClickListener(R.id.tv_book_name);

    }
}

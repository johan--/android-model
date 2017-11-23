package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/14.
 */

public class StandardsBean {


    /**
     * data : [{"id":"standards_261619","issue_date02":"2015","country":"中国","force_date":"2016-04-01 00:00:00","data_sort":1,"page_cnt":"33P.;A4","language":"汉语","tag_num":0,"is_full":"0","ccs_code_c":"M0","belong_type":"GBBASE","abstract_reading_num":0,"issue_date":"2015-09-11 00:00:00","ics_code":"01.040.35","stand_id":"261619","common_year":"2015","ccs_code":"M07","thirdparty_links_num":0,"import_num":0,"share_num":0,"common_sort_time":"2015-09-11 00:00:00","issue_unit":"CN-GB","is_force":"否","stand_status":"现行","source_db":"WF","collection_num":10,"download_num":0,"data_state":"add","stand_num":"GB/T 2900.96-2015","draft_unit":["中机生产力促进中心","中国科学院计算技术研究所","清华大学"],"fulltext_reading_num":0,"note_num":0,"updatetime":"2017-06-16 14:25:53","class_code":"M0","title":"电工术语 计算机网络技术","trans_stand":"Electrotechnical terminology.Computer network technology","summary":"本部分规定了计算机网络技术方面的通用术语。包括一般概念、网络管理、应用、漫游、登记、安全性、互联网术语、互联网应用、其他等方面的术语和定义。本部分适用于与计算机网络技术有关的所有行业。","keywords":"","class_type":"standards"}]
     * status : 200
     * message : success
     */

    private int status;
    private Object message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : standards_261619
         * issue_date02 : 2015
         * country : 中国
         * force_date : 2016-04-01 00:00:00
         * data_sort : 1
         * page_cnt : 33P.;A4
         * language : 汉语
         * tag_num : 0
         * is_full : 0
         * ccs_code_c : M0
         * belong_type : GBBASE
         * abstract_reading_num : 0
         * issue_date : 2015-09-11 00:00:00
         * ics_code : 01.040.35
         * stand_id : 261619
         * common_year : 2015
         * ccs_code : M07
         * thirdparty_links_num : 0
         * import_num : 0
         * share_num : 0
         * common_sort_time : 2015-09-11 00:00:00
         * issue_unit : CN-GB
         * is_force : 否
         * stand_status : 现行
         * source_db : WF
         * collection_num : 10
         * download_num : 0
         * data_state : add
         * stand_num : GB/T 2900.96-2015
         * draft_unit : ["中机生产力促进中心","中国科学院计算技术研究所","清华大学"]
         * fulltext_reading_num : 0
         * note_num : 0
         * updatetime : 2017-06-16 14:25:53
         * class_code : M0
         * title : 电工术语 计算机网络技术
         * trans_stand : Electrotechnical terminology.Computer network technology
         * summary : 本部分规定了计算机网络技术方面的通用术语。包括一般概念、网络管理、应用、漫游、登记、安全性、互联网术语、互联网应用、其他等方面的术语和定义。本部分适用于与计算机网络技术有关的所有行业。
         * keywords :
         * class_type : standards
         */

        private Object id;
        private Object issue_date02;
        private Object country;
        private Object force_date;
        private int data_sort;
        private Object page_cnt;
        private Object language;
        private int tag_num;

        private Object ccs_code_c;
        private Object belong_type;
        private int abstract_reading_num;
        private Object issue_date;
        private Object ics_code;
        private Object stand_id;
        private Object common_year;
        private Object ccs_code;
        private int thirdparty_links_num;
        private int import_num;
        private int share_num;
        private Object common_sort_time;
        private Object issue_unit;
        private Object is_force;
        private Object stand_status;
        private Object source_db;
        private int collection_num;
        private int download_num;
        private Object data_state;
        private Object stand_num;
        private int fulltext_reading_num;
        private int note_num;
        private Object updatetime;
        private Object class_code;
        private Object title;
        private Object trans_stand;
        private Object summary;
        private Object keywords;
        private Object class_type;
        private Object draft_unit;
        public Object getIs_fulltext() {
            return is_fulltext;
        }

        public void setIs_fulltext(Object is_fulltext) {
            this.is_fulltext = is_fulltext;
        }

        private Object is_fulltext;
        private Object is_full;
        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public Object getIssue_date02() {
            return issue_date02;
        }

        public void setIssue_date02(Object issue_date02) {
            this.issue_date02 = issue_date02;
        }

        public Object getCountry() {
            return country;
        }

        public void setCountry(Object country) {
            this.country = country;
        }

        public Object getForce_date() {
            return force_date;
        }

        public void setForce_date(Object force_date) {
            this.force_date = force_date;
        }

        public int getData_sort() {
            return data_sort;
        }

        public void setData_sort(int data_sort) {
            this.data_sort = data_sort;
        }

        public Object getPage_cnt() {
            return page_cnt;
        }

        public void setPage_cnt(Object page_cnt) {
            this.page_cnt = page_cnt;
        }

        public Object getLanguage() {
            return language;
        }

        public void setLanguage(Object language) {
            this.language = language;
        }

        public int getTag_num() {
            return tag_num;
        }

        public void setTag_num(int tag_num) {
            this.tag_num = tag_num;
        }

        public Object getIs_full() {
            return is_full;
        }

        public void setIs_full(Object is_full) {
            this.is_full = is_full;
        }

        public Object getCcs_code_c() {
            return ccs_code_c;
        }

        public void setCcs_code_c(Object ccs_code_c) {
            this.ccs_code_c = ccs_code_c;
        }

        public Object getBelong_type() {
            return belong_type;
        }

        public void setBelong_type(Object belong_type) {
            this.belong_type = belong_type;
        }

        public int getAbstract_reading_num() {
            return abstract_reading_num;
        }

        public void setAbstract_reading_num(int abstract_reading_num) {
            this.abstract_reading_num = abstract_reading_num;
        }

        public Object getIssue_date() {
            return issue_date;
        }

        public void setIssue_date(Object issue_date) {
            this.issue_date = issue_date;
        }

        public Object getIcs_code() {
            return ics_code;
        }

        public void setIcs_code(Object ics_code) {
            this.ics_code = ics_code;
        }

        public Object getStand_id() {
            return stand_id;
        }

        public void setStand_id(Object stand_id) {
            this.stand_id = stand_id;
        }

        public Object getCommon_year() {
            return common_year;
        }

        public void setCommon_year(Object common_year) {
            this.common_year = common_year;
        }

        public Object getCcs_code() {
            return ccs_code;
        }

        public void setCcs_code(Object ccs_code) {
            this.ccs_code = ccs_code;
        }

        public int getThirdparty_links_num() {
            return thirdparty_links_num;
        }

        public void setThirdparty_links_num(int thirdparty_links_num) {
            this.thirdparty_links_num = thirdparty_links_num;
        }

        public int getImport_num() {
            return import_num;
        }

        public void setImport_num(int import_num) {
            this.import_num = import_num;
        }

        public int getShare_num() {
            return share_num;
        }

        public void setShare_num(int share_num) {
            this.share_num = share_num;
        }

        public Object getCommon_sort_time() {
            return common_sort_time;
        }

        public void setCommon_sort_time(Object common_sort_time) {
            this.common_sort_time = common_sort_time;
        }

        public Object getIssue_unit() {
            return issue_unit;
        }

        public void setIssue_unit(Object issue_unit) {
            this.issue_unit = issue_unit;
        }

        public Object getIs_force() {
            return is_force;
        }

        public void setIs_force(Object is_force) {
            this.is_force = is_force;
        }

        public Object getStand_status() {
            return stand_status;
        }

        public void setStand_status(Object stand_status) {
            this.stand_status = stand_status;
        }

        public Object getSource_db() {
            return source_db;
        }

        public void setSource_db(Object source_db) {
            this.source_db = source_db;
        }

        public int getCollection_num() {
            return collection_num;
        }

        public void setCollection_num(int collection_num) {
            this.collection_num = collection_num;
        }

        public int getDownload_num() {
            return download_num;
        }

        public void setDownload_num(int download_num) {
            this.download_num = download_num;
        }

        public Object getData_state() {
            return data_state;
        }

        public void setData_state(Object data_state) {
            this.data_state = data_state;
        }

        public Object getStand_num() {
            return stand_num;
        }

        public void setStand_num(Object stand_num) {
            this.stand_num = stand_num;
        }

        public int getFulltext_reading_num() {
            return fulltext_reading_num;
        }

        public void setFulltext_reading_num(int fulltext_reading_num) {
            this.fulltext_reading_num = fulltext_reading_num;
        }

        public int getNote_num() {
            return note_num;
        }

        public void setNote_num(int note_num) {
            this.note_num = note_num;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public Object getClass_code() {
            return class_code;
        }

        public void setClass_code(Object class_code) {
            this.class_code = class_code;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
        }

        public Object getTrans_stand() {
            return trans_stand;
        }

        public void setTrans_stand(Object trans_stand) {
            this.trans_stand = trans_stand;
        }

        public Object getSummary() {
            return summary;
        }

        public void setSummary(Object summary) {
            this.summary = summary;
        }

        public Object getKeywords() {
            return keywords;
        }

        public void setKeywords(Object keywords) {
            this.keywords = keywords;
        }

        public Object getClass_type() {
            return class_type;
        }

        public void setClass_type(Object class_type) {
            this.class_type = class_type;
        }

        public Object getDraft_unit() {
            return draft_unit;
        }

        public void setDraft_unit(Object draft_unit) {
            this.draft_unit = draft_unit;
        }
    }
}

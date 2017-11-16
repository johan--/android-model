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
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
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

        private String id;
        private String issue_date02;
        private String country;
        private String force_date;
        private int data_sort;
        private String page_cnt;
        private String language;
        private int tag_num;
        private String is_full;
        private String ccs_code_c;
        private String belong_type;
        private int abstract_reading_num;
        private String issue_date;
        private String ics_code;
        private String stand_id;
        private String common_year;
        private String ccs_code;
        private int thirdparty_links_num;
        private int import_num;
        private int share_num;
        private String common_sort_time;
        private String issue_unit;
        private String is_force;
        private String stand_status;
        private String source_db;
        private int collection_num;
        private int download_num;
        private String data_state;
        private String stand_num;
        private int fulltext_reading_num;
        private int note_num;
        private String updatetime;
        private String class_code;
        private String title;
        private String trans_stand;
        private String summary;
        private String keywords;
        private String class_type;
        private List<String> draft_unit;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIssue_date02() {
            return issue_date02;
        }

        public void setIssue_date02(String issue_date02) {
            this.issue_date02 = issue_date02;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getForce_date() {
            return force_date;
        }

        public void setForce_date(String force_date) {
            this.force_date = force_date;
        }

        public int getData_sort() {
            return data_sort;
        }

        public void setData_sort(int data_sort) {
            this.data_sort = data_sort;
        }

        public String getPage_cnt() {
            return page_cnt;
        }

        public void setPage_cnt(String page_cnt) {
            this.page_cnt = page_cnt;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public int getTag_num() {
            return tag_num;
        }

        public void setTag_num(int tag_num) {
            this.tag_num = tag_num;
        }

        public String getIs_full() {
            return is_full;
        }

        public void setIs_full(String is_full) {
            this.is_full = is_full;
        }

        public String getCcs_code_c() {
            return ccs_code_c;
        }

        public void setCcs_code_c(String ccs_code_c) {
            this.ccs_code_c = ccs_code_c;
        }

        public String getBelong_type() {
            return belong_type;
        }

        public void setBelong_type(String belong_type) {
            this.belong_type = belong_type;
        }

        public int getAbstract_reading_num() {
            return abstract_reading_num;
        }

        public void setAbstract_reading_num(int abstract_reading_num) {
            this.abstract_reading_num = abstract_reading_num;
        }

        public String getIssue_date() {
            return issue_date;
        }

        public void setIssue_date(String issue_date) {
            this.issue_date = issue_date;
        }

        public String getIcs_code() {
            return ics_code;
        }

        public void setIcs_code(String ics_code) {
            this.ics_code = ics_code;
        }

        public String getStand_id() {
            return stand_id;
        }

        public void setStand_id(String stand_id) {
            this.stand_id = stand_id;
        }

        public String getCommon_year() {
            return common_year;
        }

        public void setCommon_year(String common_year) {
            this.common_year = common_year;
        }

        public String getCcs_code() {
            return ccs_code;
        }

        public void setCcs_code(String ccs_code) {
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

        public String getCommon_sort_time() {
            return common_sort_time;
        }

        public void setCommon_sort_time(String common_sort_time) {
            this.common_sort_time = common_sort_time;
        }

        public String getIssue_unit() {
            return issue_unit;
        }

        public void setIssue_unit(String issue_unit) {
            this.issue_unit = issue_unit;
        }

        public String getIs_force() {
            return is_force;
        }

        public void setIs_force(String is_force) {
            this.is_force = is_force;
        }

        public String getStand_status() {
            return stand_status;
        }

        public void setStand_status(String stand_status) {
            this.stand_status = stand_status;
        }

        public String getSource_db() {
            return source_db;
        }

        public void setSource_db(String source_db) {
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

        public String getData_state() {
            return data_state;
        }

        public void setData_state(String data_state) {
            this.data_state = data_state;
        }

        public String getStand_num() {
            return stand_num;
        }

        public void setStand_num(String stand_num) {
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

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getClass_code() {
            return class_code;
        }

        public void setClass_code(String class_code) {
            this.class_code = class_code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTrans_stand() {
            return trans_stand;
        }

        public void setTrans_stand(String trans_stand) {
            this.trans_stand = trans_stand;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getClass_type() {
            return class_type;
        }

        public void setClass_type(String class_type) {
            this.class_type = class_type;
        }

        public List<String> getDraft_unit() {
            return draft_unit;
        }

        public void setDraft_unit(List<String> draft_unit) {
            this.draft_unit = draft_unit;
        }
    }
}

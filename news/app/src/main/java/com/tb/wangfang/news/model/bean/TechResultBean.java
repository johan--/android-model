package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/14.
 */

public class TechResultBean {

    /**
     * data : [{"id":"techresult_836956","keywords":["计算机电缆","超高温电缆","硅橡胶护层"],"comp_unit":"安徽徽宁电器仪表集团有限公司","record_status":"2015年新增数据","data_sort":1,"industry_code":"393","result_num":"846880","auth_area":"安徽","tag_num":0,"comp_per":["张元船","邵春华","华齐东","刁章国","荀久章","陆秀国","杨茂明","凌学俊","侯金才"],"abstract_reading_num":0,"province":"安徽","common_year":"2015","thirdparty_links_num":0,"fax":"(0550)7561496","title_page":"2014-2015年安徽省科技成果登记项目","s_pubdate":"20150000","import_num":0,"email":"hn999@hn999.com;hn@hn999.com","share_num":0,"common_sort_time":"2015-01-01 00:00:00","result_type":"应用技术","industry_name":"电线、电缆、光缆及电工器材制造","issue_unit":"安徽省科学技术厅","create_time":"2015-12-25 00:00:00","source_db":"WF","postcode":"239312","telephone":"(0550)7561599;7561476;7563011","collection_num":0,"security_level":"非密","download_num":0,"result_id":"836956","data_state":"add","year_num":"1500310706","fulltext_reading_num":0,"note_num":0,"updatetime":"2017-09-05 19:22:39","class_code":"TM2","reg_code":"14682","title":"特种超高温计算机电缆","work_limit":"国内","summary":"该产品采用耐高温的绕包带和挤出层复合绝缘结构，提高绝缘电气和耐温性能，屏蔽外采用陶瓷化硅橡胶护层，提高了耐火阻燃性能，经优化设计，产品在600℃/24h处理后仍具有较好的电气性能，可使用在高温等特殊场合下的信号传输，产品综合性能处于国内领先水平。产品经国家电线电缆质量监督检验中心检测，符合相关标准的要求，经用户使用，反映良好，市场前景广阔。","address":"安徽省滁州市天长市乔田街道","re_pubdate":"2015","record_type":"文摘","contact_unit":"安徽徽宁电器仪表集团有限公司","info_from":"安徽省科学技术厅","class_type":"tech_result"}]
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
         * id : techresult_836956
         * keywords : ["计算机电缆","超高温电缆","硅橡胶护层"]
         * comp_unit : 安徽徽宁电器仪表集团有限公司
         * record_status : 2015年新增数据
         * data_sort : 1
         * industry_code : 393
         * result_num : 846880
         * auth_area : 安徽
         * tag_num : 0
         * comp_per : ["张元船","邵春华","华齐东","刁章国","荀久章","陆秀国","杨茂明","凌学俊","侯金才"]
         * abstract_reading_num : 0
         * province : 安徽
         * common_year : 2015
         * thirdparty_links_num : 0
         * fax : (0550)7561496
         * title_page : 2014-2015年安徽省科技成果登记项目
         * s_pubdate : 20150000
         * import_num : 0
         * email : hn999@hn999.com;hn@hn999.com
         * share_num : 0
         * common_sort_time : 2015-01-01 00:00:00
         * result_type : 应用技术
         * industry_name : 电线、电缆、光缆及电工器材制造
         * issue_unit : 安徽省科学技术厅
         * create_time : 2015-12-25 00:00:00
         * source_db : WF
         * postcode : 239312
         * telephone : (0550)7561599;7561476;7563011
         * collection_num : 0
         * security_level : 非密
         * download_num : 0
         * result_id : 836956
         * data_state : add
         * year_num : 1500310706
         * fulltext_reading_num : 0
         * note_num : 0
         * updatetime : 2017-09-05 19:22:39
         * class_code : TM2
         * reg_code : 14682
         * title : 特种超高温计算机电缆
         * work_limit : 国内
         * summary : 该产品采用耐高温的绕包带和挤出层复合绝缘结构，提高绝缘电气和耐温性能，屏蔽外采用陶瓷化硅橡胶护层，提高了耐火阻燃性能，经优化设计，产品在600℃/24h处理后仍具有较好的电气性能，可使用在高温等特殊场合下的信号传输，产品综合性能处于国内领先水平。产品经国家电线电缆质量监督检验中心检测，符合相关标准的要求，经用户使用，反映良好，市场前景广阔。
         * address : 安徽省滁州市天长市乔田街道
         * re_pubdate : 2015
         * record_type : 文摘
         * contact_unit : 安徽徽宁电器仪表集团有限公司
         * info_from : 安徽省科学技术厅
         * class_type : tech_result
         */

        private String id;
        private String comp_unit;
        private String record_status;
        private int data_sort;
        private String industry_code;
        private String result_num;
        private String auth_area;
        private int tag_num;
        private int abstract_reading_num;
        private String province;
        private String common_year;
        private int thirdparty_links_num;
        private String fax;
        private String title_page;
        private String s_pubdate;
        private int import_num;
        private String email;
        private int share_num;
        private String common_sort_time;
        private String result_type;
        private String industry_name;
        private String issue_unit;
        private String create_time;
        private String source_db;
        private String postcode;
        private String telephone;
        private int collection_num;
        private String security_level;
        private int download_num;
        private String result_id;
        private String data_state;
        private String year_num;
        private int fulltext_reading_num;
        private int note_num;
        private String updatetime;
        private String class_code;
        private String title;
        private String work_limit;
        private String summary;
        private String address;
        private String re_pubdate;
        private String record_type;
        private String contact_unit;
        private String info_from;
        private String class_type;
        private List<String> keywords;
        private List<String> comp_per;

        private String invest_amt;
        private String invest_note;
        private String invest_desc;
        private String spread;

        public String getSpread_range() {
            return spread_range;
        }

        public void setSpread_range(String spread_range) {
            this.spread_range = spread_range;
        }

        private  String spread_range;
        public String getInvest_amt() {
            return invest_amt;
        }

        public void setInvest_amt(String invest_amt) {
            this.invest_amt = invest_amt;
        }

        public String getInvest_note() {
            return invest_note;
        }

        public void setInvest_note(String invest_note) {
            this.invest_note = invest_note;
        }

        public String getInvest_desc() {
            return invest_desc;
        }

        public void setInvest_desc(String invest_desc) {
            this.invest_desc = invest_desc;
        }

        public String getSpread() {
            return spread;
        }

        public void setSpread(String spread) {
            this.spread = spread;
        }

        public String getSpread_mode() {
            return spread_mode;
        }

        public void setSpread_mode(String spread_mode) {
            this.spread_mode = spread_mode;
        }

        public String getSpread_track() {
            return spread_track;
        }

        public void setSpread_track(String spread_track) {
            this.spread_track = spread_track;
        }

        public String getSpread_desc() {
            return spread_desc;
        }

        public void setSpread_desc(String spread_desc) {
            this.spread_desc = spread_desc;
        }

        public String getTransfer_desc() {
            return transfer_desc;
        }

        public void setTransfer_desc(String transfer_desc) {
            this.transfer_desc = transfer_desc;
        }

        public String getTransfer_range() {
            return transfer_range;
        }

        public void setTransfer_range(String transfer_range) {
            this.transfer_range = transfer_range;
        }

        public String getTransfer_cond() {
            return transfer_cond;
        }

        public void setTransfer_cond(String transfer_cond) {
            this.transfer_cond = transfer_cond;
        }

        public String getTransfer_cont() {
            return transfer_cont;
        }

        public void setTransfer_cont(String transfer_cont) {
            this.transfer_cont = transfer_cont;
        }

        public String getTransfer_mode() {
            return transfer_mode;
        }

        public void setTransfer_mode(String transfer_mode) {
            this.transfer_mode = transfer_mode;
        }

        private String spread_mode;
        private String spread_track;
        private String spread_desc;

        private String transfer_desc;
        private String transfer_range;
        private String transfer_cond;

        private String transfer_cont;
        private String transfer_mode;

        public String getP_app_id() {
            return p_app_id;
        }

        public void setP_app_id(String p_app_id) {
            this.p_app_id = p_app_id;
        }

        public String getPatent_cnt() {
            return patent_cnt;
        }

        public void setPatent_cnt(String patent_cnt) {
            this.patent_cnt = patent_cnt;
        }

        public String getGrant_id() {
            return grant_id;
        }

        public void setGrant_id(String grant_id) {
            this.grant_id = grant_id;
        }

        private String p_app_id;
        private String patent_cnt;
        private String grant_id;


        public String getDeclare_date() {
            return declare_date;
        }

        public void setDeclare_date(String declare_date) {
            this.declare_date = declare_date;
        }

        private String declare_date;


        public String getIdentify_dept() {
            return identify_dept;
        }

        public void setIdentify_dept(String identify_dept) {
            this.identify_dept = identify_dept;
        }

        public String getTransfer_fee() {
            return transfer_fee;
        }

        public void setTransfer_fee(String transfer_fee) {
            this.transfer_fee = transfer_fee;
        }

        public String getIdentify_date() {
            return identify_date;
        }

        public void setIdentify_date(String identify_date) {
            this.identify_date = identify_date;
        }

        public String getWork_date() {
            return work_date;
        }

        public void setWork_date(String work_date) {
            this.work_date = work_date;
        }

        public String getDeclare_unit() {
            return declare_unit;
        }

        public void setDeclare_unit(String declare_unit) {
            this.declare_unit = declare_unit;
        }

        public String getContact_per() {
            return contact_per;
        }

        public void setContact_per(String contact_per) {
            this.contact_per = contact_per;
        }

        private String identify_dept;
        private String transfer_fee;
        private String identify_date;
        private String reg_code;//登记号
        private String work_date;
        private String declare_unit;
        private String contact_per;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getComp_unit() {
            return comp_unit;
        }

        public void setComp_unit(String comp_unit) {
            this.comp_unit = comp_unit;
        }

        public String getRecord_status() {
            return record_status;
        }

        public void setRecord_status(String record_status) {
            this.record_status = record_status;
        }

        public int getData_sort() {
            return data_sort;
        }

        public void setData_sort(int data_sort) {
            this.data_sort = data_sort;
        }

        public String getIndustry_code() {
            return industry_code;
        }

        public void setIndustry_code(String industry_code) {
            this.industry_code = industry_code;
        }

        public String getResult_num() {
            return result_num;
        }

        public void setResult_num(String result_num) {
            this.result_num = result_num;
        }

        public String getAuth_area() {
            return auth_area;
        }

        public void setAuth_area(String auth_area) {
            this.auth_area = auth_area;
        }

        public int getTag_num() {
            return tag_num;
        }

        public void setTag_num(int tag_num) {
            this.tag_num = tag_num;
        }

        public int getAbstract_reading_num() {
            return abstract_reading_num;
        }

        public void setAbstract_reading_num(int abstract_reading_num) {
            this.abstract_reading_num = abstract_reading_num;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCommon_year() {
            return common_year;
        }

        public void setCommon_year(String common_year) {
            this.common_year = common_year;
        }

        public int getThirdparty_links_num() {
            return thirdparty_links_num;
        }

        public void setThirdparty_links_num(int thirdparty_links_num) {
            this.thirdparty_links_num = thirdparty_links_num;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getTitle_page() {
            return title_page;
        }

        public void setTitle_page(String title_page) {
            this.title_page = title_page;
        }

        public String getS_pubdate() {
            return s_pubdate;
        }

        public void setS_pubdate(String s_pubdate) {
            this.s_pubdate = s_pubdate;
        }

        public int getImport_num() {
            return import_num;
        }

        public void setImport_num(int import_num) {
            this.import_num = import_num;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
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

        public String getResult_type() {
            return result_type;
        }

        public void setResult_type(String result_type) {
            this.result_type = result_type;
        }

        public String getIndustry_name() {
            return industry_name;
        }

        public void setIndustry_name(String industry_name) {
            this.industry_name = industry_name;
        }

        public String getIssue_unit() {
            return issue_unit;
        }

        public void setIssue_unit(String issue_unit) {
            this.issue_unit = issue_unit;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getSource_db() {
            return source_db;
        }

        public void setSource_db(String source_db) {
            this.source_db = source_db;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public int getCollection_num() {
            return collection_num;
        }

        public void setCollection_num(int collection_num) {
            this.collection_num = collection_num;
        }

        public String getSecurity_level() {
            return security_level;
        }

        public void setSecurity_level(String security_level) {
            this.security_level = security_level;
        }

        public int getDownload_num() {
            return download_num;
        }

        public void setDownload_num(int download_num) {
            this.download_num = download_num;
        }

        public String getResult_id() {
            return result_id;
        }

        public void setResult_id(String result_id) {
            this.result_id = result_id;
        }

        public String getData_state() {
            return data_state;
        }

        public void setData_state(String data_state) {
            this.data_state = data_state;
        }

        public String getYear_num() {
            return year_num;
        }

        public void setYear_num(String year_num) {
            this.year_num = year_num;
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

        public String getReg_code() {
            return reg_code;
        }

        public void setReg_code(String reg_code) {
            this.reg_code = reg_code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getWork_limit() {
            return work_limit;
        }

        public void setWork_limit(String work_limit) {
            this.work_limit = work_limit;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getRe_pubdate() {
            return re_pubdate;
        }

        public void setRe_pubdate(String re_pubdate) {
            this.re_pubdate = re_pubdate;
        }

        public String getRecord_type() {
            return record_type;
        }

        public void setRecord_type(String record_type) {
            this.record_type = record_type;
        }

        public String getContact_unit() {
            return contact_unit;
        }

        public void setContact_unit(String contact_unit) {
            this.contact_unit = contact_unit;
        }

        public String getInfo_from() {
            return info_from;
        }

        public void setInfo_from(String info_from) {
            this.info_from = info_from;
        }

        public String getClass_type() {
            return class_type;
        }

        public void setClass_type(String class_type) {
            this.class_type = class_type;
        }

        public List<String> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }

        public List<String> getComp_per() {
            return comp_per;
        }

        public void setComp_per(List<String> comp_per) {
            this.comp_per = comp_per;
        }
    }
}

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

        private Object id;
        private Object comp_unit;
        private Object record_status;
        private int data_sort;
        private Object industry_code;
        private Object result_num;
        private Object auth_area;
        private int tag_num;
        private int abstract_reading_num;
        private Object province;
        private Object common_year;
        private int thirdparty_links_num;
        private Object fax;
        private Object title_page;
        private Object s_pubdate;
        private int import_num;
        private Object email;
        private int share_num;
        private Object common_sort_time;
        private Object result_type;
        private Object industry_name;
        private Object issue_unit;
        private Object create_time;
        private Object source_db;
        private Object postcode;
        private Object telephone;
        private int collection_num;
        private Object security_level;
        private int download_num;
        private Object result_id;
        private Object data_state;
        private Object year_num;
        private int fulltext_reading_num;
        private int note_num;
        private Object updatetime;
        private Object class_code;
        private Object title;
        private Object work_limit;
        private Object summary;
        private Object address;
        private Object re_pubdate;
        private Object record_type;
        private Object contact_unit;
        private Object info_from;
        private Object class_type;
        private Object keywords;
        private Object comp_per;

        private Object invest_amt;
        private Object invest_note;
        private Object invest_desc;
        private Object spread;

        public Object getSpread_range() {
            return spread_range;
        }

        public void setSpread_range(Object spread_range) {
            this.spread_range = spread_range;
        }

        private  Object spread_range;
        public Object getInvest_amt() {
            return invest_amt;
        }

        public void setInvest_amt(Object invest_amt) {
            this.invest_amt = invest_amt;
        }

        public Object getInvest_note() {
            return invest_note;
        }

        public void setInvest_note(Object invest_note) {
            this.invest_note = invest_note;
        }

        public Object getInvest_desc() {
            return invest_desc;
        }

        public void setInvest_desc(Object invest_desc) {
            this.invest_desc = invest_desc;
        }

        public Object getSpread() {
            return spread;
        }

        public void setSpread(Object spread) {
            this.spread = spread;
        }

        public Object getSpread_mode() {
            return spread_mode;
        }

        public void setSpread_mode(Object spread_mode) {
            this.spread_mode = spread_mode;
        }

        public Object getSpread_track() {
            return spread_track;
        }

        public void setSpread_track(Object spread_track) {
            this.spread_track = spread_track;
        }

        public Object getSpread_desc() {
            return spread_desc;
        }

        public void setSpread_desc(Object spread_desc) {
            this.spread_desc = spread_desc;
        }

        public Object getTransfer_desc() {
            return transfer_desc;
        }

        public void setTransfer_desc(Object transfer_desc) {
            this.transfer_desc = transfer_desc;
        }

        public Object getTransfer_range() {
            return transfer_range;
        }

        public void setTransfer_range(Object transfer_range) {
            this.transfer_range = transfer_range;
        }

        public Object getTransfer_cond() {
            return transfer_cond;
        }

        public void setTransfer_cond(Object transfer_cond) {
            this.transfer_cond = transfer_cond;
        }

        public Object getTransfer_cont() {
            return transfer_cont;
        }

        public void setTransfer_cont(Object transfer_cont) {
            this.transfer_cont = transfer_cont;
        }

        public Object getTransfer_mode() {
            return transfer_mode;
        }

        public void setTransfer_mode(Object transfer_mode) {
            this.transfer_mode = transfer_mode;
        }

        private Object spread_mode;
        private Object spread_track;
        private Object spread_desc;

        private Object transfer_desc;
        private Object transfer_range;
        private Object transfer_cond;

        private Object transfer_cont;
        private Object transfer_mode;

        public Object getP_app_id() {
            return p_app_id;
        }

        public void setP_app_id(Object p_app_id) {
            this.p_app_id = p_app_id;
        }

        public Object getPatent_cnt() {
            return patent_cnt;
        }

        public void setPatent_cnt(Object patent_cnt) {
            this.patent_cnt = patent_cnt;
        }

        public Object getGrant_id() {
            return grant_id;
        }

        public void setGrant_id(Object grant_id) {
            this.grant_id = grant_id;
        }

        private Object p_app_id;
        private Object patent_cnt;
        private Object grant_id;


        public Object getDeclare_date() {
            return declare_date;
        }

        public void setDeclare_date(Object declare_date) {
            this.declare_date = declare_date;
        }

        private Object declare_date;


        public Object getIdentify_dept() {
            return identify_dept;
        }

        public void setIdentify_dept(Object identify_dept) {
            this.identify_dept = identify_dept;
        }

        public Object getTransfer_fee() {
            return transfer_fee;
        }

        public void setTransfer_fee(Object transfer_fee) {
            this.transfer_fee = transfer_fee;
        }

        public Object getIdentify_date() {
            return identify_date;
        }

        public void setIdentify_date(Object identify_date) {
            this.identify_date = identify_date;
        }

        public Object getWork_date() {
            return work_date;
        }

        public void setWork_date(Object work_date) {
            this.work_date = work_date;
        }

        public Object getDeclare_unit() {
            return declare_unit;
        }

        public void setDeclare_unit(Object declare_unit) {
            this.declare_unit = declare_unit;
        }

        public Object getContact_per() {
            return contact_per;
        }

        public void setContact_per(Object contact_per) {
            this.contact_per = contact_per;
        }

        private Object identify_dept;
        private Object transfer_fee;
        private Object identify_date;
        private Object reg_code;//登记号
        private Object work_date;
        private Object declare_unit;
        private Object contact_per;


        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public Object getComp_unit() {
            return comp_unit;
        }

        public void setComp_unit(Object comp_unit) {
            this.comp_unit = comp_unit;
        }

        public Object getRecord_status() {
            return record_status;
        }

        public void setRecord_status(Object record_status) {
            this.record_status = record_status;
        }

        public int getData_sort() {
            return data_sort;
        }

        public void setData_sort(int data_sort) {
            this.data_sort = data_sort;
        }

        public Object getIndustry_code() {
            return industry_code;
        }

        public void setIndustry_code(Object industry_code) {
            this.industry_code = industry_code;
        }

        public Object getResult_num() {
            return result_num;
        }

        public void setResult_num(Object result_num) {
            this.result_num = result_num;
        }

        public Object getAuth_area() {
            return auth_area;
        }

        public void setAuth_area(Object auth_area) {
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

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
        }

        public Object getCommon_year() {
            return common_year;
        }

        public void setCommon_year(Object common_year) {
            this.common_year = common_year;
        }

        public int getThirdparty_links_num() {
            return thirdparty_links_num;
        }

        public void setThirdparty_links_num(int thirdparty_links_num) {
            this.thirdparty_links_num = thirdparty_links_num;
        }

        public Object getFax() {
            return fax;
        }

        public void setFax(Object fax) {
            this.fax = fax;
        }

        public Object getTitle_page() {
            return title_page;
        }

        public void setTitle_page(Object title_page) {
            this.title_page = title_page;
        }

        public Object getS_pubdate() {
            return s_pubdate;
        }

        public void setS_pubdate(Object s_pubdate) {
            this.s_pubdate = s_pubdate;
        }

        public int getImport_num() {
            return import_num;
        }

        public void setImport_num(int import_num) {
            this.import_num = import_num;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
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

        public Object getResult_type() {
            return result_type;
        }

        public void setResult_type(Object result_type) {
            this.result_type = result_type;
        }

        public Object getIndustry_name() {
            return industry_name;
        }

        public void setIndustry_name(Object industry_name) {
            this.industry_name = industry_name;
        }

        public Object getIssue_unit() {
            return issue_unit;
        }

        public void setIssue_unit(Object issue_unit) {
            this.issue_unit = issue_unit;
        }

        public Object getCreate_time() {
            return create_time;
        }

        public void setCreate_time(Object create_time) {
            this.create_time = create_time;
        }

        public Object getSource_db() {
            return source_db;
        }

        public void setSource_db(Object source_db) {
            this.source_db = source_db;
        }

        public Object getPostcode() {
            return postcode;
        }

        public void setPostcode(Object postcode) {
            this.postcode = postcode;
        }

        public Object getTelephone() {
            return telephone;
        }

        public void setTelephone(Object telephone) {
            this.telephone = telephone;
        }

        public int getCollection_num() {
            return collection_num;
        }

        public void setCollection_num(int collection_num) {
            this.collection_num = collection_num;
        }

        public Object getSecurity_level() {
            return security_level;
        }

        public void setSecurity_level(Object security_level) {
            this.security_level = security_level;
        }

        public int getDownload_num() {
            return download_num;
        }

        public void setDownload_num(int download_num) {
            this.download_num = download_num;
        }

        public Object getResult_id() {
            return result_id;
        }

        public void setResult_id(Object result_id) {
            this.result_id = result_id;
        }

        public Object getData_state() {
            return data_state;
        }

        public void setData_state(Object data_state) {
            this.data_state = data_state;
        }

        public Object getYear_num() {
            return year_num;
        }

        public void setYear_num(Object year_num) {
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

        public Object getReg_code() {
            return reg_code;
        }

        public void setReg_code(Object reg_code) {
            this.reg_code = reg_code;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
        }

        public Object getWork_limit() {
            return work_limit;
        }

        public void setWork_limit(Object work_limit) {
            this.work_limit = work_limit;
        }

        public Object getSummary() {
            return summary;
        }

        public void setSummary(Object summary) {
            this.summary = summary;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getRe_pubdate() {
            return re_pubdate;
        }

        public void setRe_pubdate(Object re_pubdate) {
            this.re_pubdate = re_pubdate;
        }

        public Object getRecord_type() {
            return record_type;
        }

        public void setRecord_type(Object record_type) {
            this.record_type = record_type;
        }

        public Object getContact_unit() {
            return contact_unit;
        }

        public void setContact_unit(Object contact_unit) {
            this.contact_unit = contact_unit;
        }

        public Object getInfo_from() {
            return info_from;
        }

        public void setInfo_from(Object info_from) {
            this.info_from = info_from;
        }

        public Object getClass_type() {
            return class_type;
        }

        public void setClass_type(Object class_type) {
            this.class_type = class_type;
        }

        public Object getKeywords() {
            return keywords;
        }

        public void setKeywords(Object keywords) {
            this.keywords = keywords;
        }

        public Object getComp_per() {
            return comp_per;
        }

        public void setComp_per(Object comp_per) {
            this.comp_per = comp_per;
        }
    }
}

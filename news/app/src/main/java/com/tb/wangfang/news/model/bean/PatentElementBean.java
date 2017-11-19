package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/13.
 */

public class PatentElementBean {
    /**
     * data : [{"id":"patentelement_CN200610108546.4","data_sort":1,"page_cnt":72,"refdoc_cnt":0,"inv_name":["吉泽政洋","汤本一磨","星野和义"],"title02":"计算机系统及计算机","prio_num":"331844/2005","tag_num":0,"pub_date":"2007-05-23","abstract_reading_num":0,"disk_num":"D0721","app_date":"2006-07-21 00:00:00","common_year":"2006","app_num":"CN200610108546.4","thirdparty_links_num":0,"legal_status":"无权","prio_date":"2005.11.16","import_num":0,"share_num":0,"common_sort_time":"2006-07-21 00:00:00","patent_id":"CN200610108546.4","signory":"权利要求书1.一种计算机系统，包括：具有第1处理器、第1存储器及第1接口的第1计算机；具有第2处理器、第2存储器及第2接口的第2计算机；以及控制所述第1计算机与所述第2计算机通信的通信控制装置，其特征在于：上述通信控制装置，当从上述第1计算机接收包时，变换接收到的包的地址信息，并传送给上述第2计算机；上述第2存储器，存储SA候补信息，所述SA候补信息是地址信息的一部分不明确的SA信息；上述第2处理器，当从上述第1计算机接收通过上述第1计算机被加密的包时，使用上述SA候补信息对该加密包进行解密；当上述加密包解密成功时，则根据上述解密中使用的上述SA候补信息及该加密包的地址信息，生成SA信息。","app_area_code":"日本;JP","source_db":"WF","agy_per_name":"黄剑锋","app_date02":"2006-07-21","collection_num":0,"priority":"2005.11.16 JP 331844/2005","applicant_name":"株式会社日立制作所","proposer_name":"株式会社日立制作所","issue_dir":"2007/05/CN200610108546.4.pdf","download_num":0,"prio_ccode":"6 J","pub_num":"CN1968083","main_classcode":["H04L9/06(2006.01)I","H","H04","H04L","H04L9"],"data_state":"add","app_address":"日本东京都","patent_type":"发明专利","fulltext_reading_num":0,"note_num":0,"agy_org_name":"永新专利商标代理有限公司","updatetime":"2017-09-18 15:15:43","class_code":"H04L9/06","pub_org_code":"CN","title":"计算机系统及计算机","summary":"一种计算机系统，在经由NAT或者负荷分散装置通信的计算机之间建立SA。具备第1计算机和具有第2处理器及第2存储器的第2计算机以及控制上述第1计算机和上述第2计算机之间的通信的通信控制装置的计算机系统，其特征在于，上述通信控制装置，当从上述第1计算机接收包时，转换接收到的包的地址信息，传输给上述第2计算机，上述第2存储器，存储地址信息的一部分不明确的SA信息即SA候补信息，上述第2处理器，当从上述第1计算机接收由上述第1计算机加密过的加密包时，使用上述SA候补信息对该加密包进行解密，当该加密包解密成功时，根据上述解密中使用过的上述SA候补信息及该加密包的地址信息，生成SA信息。","keywords":"","op":{"patentclaim":[{"patent_id":"CN200610108546.4","record_id":"734327","claim_text":"","id":"d50f5165-1e32-4b68-8d8e-56808cb6ff72","claim_num":""}],"patentcontent":[{"patent_id":"CN200610108546.4","disclosure":"","draw_desc":"","bg_tech":"","spec_detail":"","id":"46572209-b31e-47ea-ba53-7cb83a37e7f8","tech_field":""}],"patentproposer":[{"patent_id":"CN200610108546.4","proposer_id":"","record_id":"758945","id":"a86730df-bf8e-4e16-bfbe-8a473e364000","proposer_name":"株式会社日立制作所","proposer_type":""}],"patentsource":[{"patent_id":"CN200610108546.4","record_id":"752429","is_full":"","third_url":"","orig_num":"","source_db":"","is_oa":"","id":"083291f5-b8b8-4e0e-a82d-eac8518f795a","source_alburm":"","platform":"","third_abst_url":""}],"patentcited":[{"record_id":"671336","cited_seq":"","patent_id":"CN200610108546.4","cited_orig_id":"","cited_num_type":"","cited_num":"","id":"16111430-1070-4bb7-91c5-d32d2d9028c5"}],"patentinventor":[{"record_id":"727805","proposer_id":"","patent_id":"CN200610108546.4","inv_ccode":"","inv_acode":"","inv_address":"","id":"39e73def-9509-46c0-be10-573415480f0c","inv_name":"吉泽政洋%汤本一磨%星野和义"}],"patentcitednpl":[{"cited_npl_seq":"","patent_id":"CN200610108546.4","record_id":"715929","cited_npl":"","id":"ebf0fb26-a54b-4623-8549-757ac74793b5"}]},"class_type":"patent_element"}]
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
         * id : patentelement_CN200610108546.4
         * data_sort : 1
         * page_cnt : 72
         * refdoc_cnt : 0
         * inv_name : ["吉泽政洋","汤本一磨","星野和义"]
         * title02 : 计算机系统及计算机
         * prio_num : 331844/2005
         * tag_num : 0
         * pub_date : 2007-05-23
         * abstract_reading_num : 0
         * disk_num : D0721
         * app_date : 2006-07-21 00:00:00
         * common_year : 2006
         * app_num : CN200610108546.4
         * thirdparty_links_num : 0
         * legal_status : 无权
         * prio_date : 2005.11.16
         * import_num : 0
         * share_num : 0
         * common_sort_time : 2006-07-21 00:00:00
         * patent_id : CN200610108546.4
         * signory : 权利要求书1.一种计算机系统，包括：具有第1处理器、第1存储器及第1接口的第1计算机；具有第2处理器、第2存储器及第2接口的第2计算机；以及控制所述第1计算机与所述第2计算机通信的通信控制装置，其特征在于：上述通信控制装置，当从上述第1计算机接收包时，变换接收到的包的地址信息，并传送给上述第2计算机；上述第2存储器，存储SA候补信息，所述SA候补信息是地址信息的一部分不明确的SA信息；上述第2处理器，当从上述第1计算机接收通过上述第1计算机被加密的包时，使用上述SA候补信息对该加密包进行解密；当上述加密包解密成功时，则根据上述解密中使用的上述SA候补信息及该加密包的地址信息，生成SA信息。
         * app_area_code : 日本;JP
         * source_db : WF
         * agy_per_name : 黄剑锋
         * app_date02 : 2006-07-21
         * collection_num : 0
         * priority : 2005.11.16 JP 331844/2005
         * applicant_name : 株式会社日立制作所
         * proposer_name : 株式会社日立制作所
         * issue_dir : 2007/05/CN200610108546.4.pdf
         * download_num : 0
         * prio_ccode : 6 J
         * pub_num : CN1968083
         * main_classcode : ["H04L9/06(2006.01)I","H","H04","H04L","H04L9"]
         * data_state : add
         * app_address : 日本东京都
         * patent_type : 发明专利
         * fulltext_reading_num : 0
         * note_num : 0
         * agy_org_name : 永新专利商标代理有限公司
         * updatetime : 2017-09-18 15:15:43
         * class_code : H04L9/06
         * pub_org_code : CN
         * title : 计算机系统及计算机
         * summary : 一种计算机系统，在经由NAT或者负荷分散装置通信的计算机之间建立SA。具备第1计算机和具有第2处理器及第2存储器的第2计算机以及控制上述第1计算机和上述第2计算机之间的通信的通信控制装置的计算机系统，其特征在于，上述通信控制装置，当从上述第1计算机接收包时，转换接收到的包的地址信息，传输给上述第2计算机，上述第2存储器，存储地址信息的一部分不明确的SA信息即SA候补信息，上述第2处理器，当从上述第1计算机接收由上述第1计算机加密过的加密包时，使用上述SA候补信息对该加密包进行解密，当该加密包解密成功时，根据上述解密中使用过的上述SA候补信息及该加密包的地址信息，生成SA信息。
         * keywords :
         * op : {"patentclaim":[{"patent_id":"CN200610108546.4","record_id":"734327","claim_text":"","id":"d50f5165-1e32-4b68-8d8e-56808cb6ff72","claim_num":""}],"patentcontent":[{"patent_id":"CN200610108546.4","disclosure":"","draw_desc":"","bg_tech":"","spec_detail":"","id":"46572209-b31e-47ea-ba53-7cb83a37e7f8","tech_field":""}],"patentproposer":[{"patent_id":"CN200610108546.4","proposer_id":"","record_id":"758945","id":"a86730df-bf8e-4e16-bfbe-8a473e364000","proposer_name":"株式会社日立制作所","proposer_type":""}],"patentsource":[{"patent_id":"CN200610108546.4","record_id":"752429","is_full":"","third_url":"","orig_num":"","source_db":"","is_oa":"","id":"083291f5-b8b8-4e0e-a82d-eac8518f795a","source_alburm":"","platform":"","third_abst_url":""}],"patentcited":[{"record_id":"671336","cited_seq":"","patent_id":"CN200610108546.4","cited_orig_id":"","cited_num_type":"","cited_num":"","id":"16111430-1070-4bb7-91c5-d32d2d9028c5"}],"patentinventor":[{"record_id":"727805","proposer_id":"","patent_id":"CN200610108546.4","inv_ccode":"","inv_acode":"","inv_address":"","id":"39e73def-9509-46c0-be10-573415480f0c","inv_name":"吉泽政洋%汤本一磨%星野和义"}],"patentcitednpl":[{"cited_npl_seq":"","patent_id":"CN200610108546.4","record_id":"715929","cited_npl":"","id":"ebf0fb26-a54b-4623-8549-757ac74793b5"}]}
         * class_type : patent_element
         */

        private Object id;
        private int data_sort;
        private int page_cnt;
        private int refdoc_cnt;
        private Object title02;
        private Object prio_num;
        private int tag_num;
        private Object pub_date;
        private int abstract_reading_num;
        private Object disk_num;
        private Object app_date;
        private Object common_year;
        private Object app_num;
        private int thirdparty_links_num;
        private Object legal_status;
        private Object prio_date;
        private int import_num;
        private int share_num;
        private Object common_sort_time;
        private Object patent_id;
        private Object signory;
        private Object app_area_code;
        private Object source_db;
        private Object agy_per_name;
        private Object app_date02;
        private int collection_num;
        private Object priority;
        private Object applicant_name;
        private Object proposer_name;
        private Object issue_dir;
        private int download_num;
        private Object prio_ccode;
        private Object pub_num;
        private Object data_state;
        private Object app_address;
        private Object patent_type;
        private int fulltext_reading_num;
        private int note_num;
        private Object agy_org_name;
        private Object updatetime;
        private Object class_code;
        private Object pub_org_code;
        private Object title;
        private Object summary;
        private Object keywords;
        private OpBean op;
        private Object class_type;
        private Object inv_name;
        private Object main_classcode;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public int getData_sort() {
            return data_sort;
        }

        public void setData_sort(int data_sort) {
            this.data_sort = data_sort;
        }

        public int getPage_cnt() {
            return page_cnt;
        }

        public void setPage_cnt(int page_cnt) {
            this.page_cnt = page_cnt;
        }

        public int getRefdoc_cnt() {
            return refdoc_cnt;
        }

        public void setRefdoc_cnt(int refdoc_cnt) {
            this.refdoc_cnt = refdoc_cnt;
        }

        public Object getTitle02() {
            return title02;
        }

        public void setTitle02(Object title02) {
            this.title02 = title02;
        }

        public Object getPrio_num() {
            return prio_num;
        }

        public void setPrio_num(Object prio_num) {
            this.prio_num = prio_num;
        }

        public int getTag_num() {
            return tag_num;
        }

        public void setTag_num(int tag_num) {
            this.tag_num = tag_num;
        }

        public Object getPub_date() {
            return pub_date;
        }

        public void setPub_date(Object pub_date) {
            this.pub_date = pub_date;
        }

        public int getAbstract_reading_num() {
            return abstract_reading_num;
        }

        public void setAbstract_reading_num(int abstract_reading_num) {
            this.abstract_reading_num = abstract_reading_num;
        }

        public Object getDisk_num() {
            return disk_num;
        }

        public void setDisk_num(Object disk_num) {
            this.disk_num = disk_num;
        }

        public Object getApp_date() {
            return app_date;
        }

        public void setApp_date(Object app_date) {
            this.app_date = app_date;
        }

        public Object getCommon_year() {
            return common_year;
        }

        public void setCommon_year(Object common_year) {
            this.common_year = common_year;
        }

        public Object getApp_num() {
            return app_num;
        }

        public void setApp_num(Object app_num) {
            this.app_num = app_num;
        }

        public int getThirdparty_links_num() {
            return thirdparty_links_num;
        }

        public void setThirdparty_links_num(int thirdparty_links_num) {
            this.thirdparty_links_num = thirdparty_links_num;
        }

        public Object getLegal_status() {
            return legal_status;
        }

        public void setLegal_status(Object legal_status) {
            this.legal_status = legal_status;
        }

        public Object getPrio_date() {
            return prio_date;
        }

        public void setPrio_date(Object prio_date) {
            this.prio_date = prio_date;
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

        public Object getPatent_id() {
            return patent_id;
        }

        public void setPatent_id(Object patent_id) {
            this.patent_id = patent_id;
        }

        public Object getSignory() {
            return signory;
        }

        public void setSignory(Object signory) {
            this.signory = signory;
        }

        public Object getApp_area_code() {
            return app_area_code;
        }

        public void setApp_area_code(Object app_area_code) {
            this.app_area_code = app_area_code;
        }

        public Object getSource_db() {
            return source_db;
        }

        public void setSource_db(Object source_db) {
            this.source_db = source_db;
        }

        public Object getAgy_per_name() {
            return agy_per_name;
        }

        public void setAgy_per_name(Object agy_per_name) {
            this.agy_per_name = agy_per_name;
        }

        public Object getApp_date02() {
            return app_date02;
        }

        public void setApp_date02(Object app_date02) {
            this.app_date02 = app_date02;
        }

        public int getCollection_num() {
            return collection_num;
        }

        public void setCollection_num(int collection_num) {
            this.collection_num = collection_num;
        }

        public Object getPriority() {
            return priority;
        }

        public void setPriority(Object priority) {
            this.priority = priority;
        }

        public Object getApplicant_name() {
            return applicant_name;
        }

        public void setApplicant_name(Object applicant_name) {
            this.applicant_name = applicant_name;
        }

        public Object getProposer_name() {
            return proposer_name;
        }

        public void setProposer_name(Object proposer_name) {
            this.proposer_name = proposer_name;
        }

        public Object getIssue_dir() {
            return issue_dir;
        }

        public void setIssue_dir(Object issue_dir) {
            this.issue_dir = issue_dir;
        }

        public int getDownload_num() {
            return download_num;
        }

        public void setDownload_num(int download_num) {
            this.download_num = download_num;
        }

        public Object getPrio_ccode() {
            return prio_ccode;
        }

        public void setPrio_ccode(Object prio_ccode) {
            this.prio_ccode = prio_ccode;
        }

        public Object getPub_num() {
            return pub_num;
        }

        public void setPub_num(Object pub_num) {
            this.pub_num = pub_num;
        }

        public Object getData_state() {
            return data_state;
        }

        public void setData_state(Object data_state) {
            this.data_state = data_state;
        }

        public Object getApp_address() {
            return app_address;
        }

        public void setApp_address(Object app_address) {
            this.app_address = app_address;
        }

        public Object getPatent_type() {
            return patent_type;
        }

        public void setPatent_type(Object patent_type) {
            this.patent_type = patent_type;
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

        public Object getAgy_org_name() {
            return agy_org_name;
        }

        public void setAgy_org_name(Object agy_org_name) {
            this.agy_org_name = agy_org_name;
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

        public Object getPub_org_code() {
            return pub_org_code;
        }

        public void setPub_org_code(Object pub_org_code) {
            this.pub_org_code = pub_org_code;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
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

        public OpBean getOp() {
            return op;
        }

        public void setOp(OpBean op) {
            this.op = op;
        }

        public Object getClass_type() {
            return class_type;
        }

        public void setClass_type(Object class_type) {
            this.class_type = class_type;
        }

        public Object getInv_name() {
            return inv_name;
        }

        public void setInv_name(Object inv_name) {
            this.inv_name = inv_name;
        }

        public Object getMain_classcode() {
            return main_classcode;
        }

        public void setMain_classcode(Object main_classcode) {
            this.main_classcode = main_classcode;
        }

        public static class OpBean {
            private List<PatentclaimBean> patentclaim;
            private List<PatentcontentBean> patentcontent;
            private List<PatentproposerBean> patentproposer;
            private List<PatentsourceBean> patentsource;
            private List<PatentcitedBean> patentcited;
            private List<PatentinventorBean> patentinventor;
            private List<PatentcitednplBean> patentcitednpl;

            public List<PatentclaimBean> getPatentclaim() {
                return patentclaim;
            }

            public void setPatentclaim(List<PatentclaimBean> patentclaim) {
                this.patentclaim = patentclaim;
            }

            public List<PatentcontentBean> getPatentcontent() {
                return patentcontent;
            }

            public void setPatentcontent(List<PatentcontentBean> patentcontent) {
                this.patentcontent = patentcontent;
            }

            public List<PatentproposerBean> getPatentproposer() {
                return patentproposer;
            }

            public void setPatentproposer(List<PatentproposerBean> patentproposer) {
                this.patentproposer = patentproposer;
            }

            public List<PatentsourceBean> getPatentsource() {
                return patentsource;
            }

            public void setPatentsource(List<PatentsourceBean> patentsource) {
                this.patentsource = patentsource;
            }

            public List<PatentcitedBean> getPatentcited() {
                return patentcited;
            }

            public void setPatentcited(List<PatentcitedBean> patentcited) {
                this.patentcited = patentcited;
            }

            public List<PatentinventorBean> getPatentinventor() {
                return patentinventor;
            }

            public void setPatentinventor(List<PatentinventorBean> patentinventor) {
                this.patentinventor = patentinventor;
            }

            public List<PatentcitednplBean> getPatentcitednpl() {
                return patentcitednpl;
            }

            public void setPatentcitednpl(List<PatentcitednplBean> patentcitednpl) {
                this.patentcitednpl = patentcitednpl;
            }

            public static class PatentclaimBean {
                /**
                 * patent_id : CN200610108546.4
                 * record_id : 734327
                 * claim_text :
                 * id : d50f5165-1e32-4b68-8d8e-56808cb6ff72
                 * claim_num :
                 */

                private Object patent_id;
                private Object record_id;
                private Object claim_text;
                private Object id;
                private Object claim_num;

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getClaim_text() {
                    return claim_text;
                }

                public void setClaim_text(Object claim_text) {
                    this.claim_text = claim_text;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }

                public Object getClaim_num() {
                    return claim_num;
                }

                public void setClaim_num(Object claim_num) {
                    this.claim_num = claim_num;
                }
            }

            public static class PatentcontentBean {
                /**
                 * patent_id : CN200610108546.4
                 * disclosure :
                 * draw_desc :
                 * bg_tech :
                 * spec_detail :
                 * id : 46572209-b31e-47ea-ba53-7cb83a37e7f8
                 * tech_field :
                 */

                private Object patent_id;
                private Object disclosure;
                private Object draw_desc;
                private Object bg_tech;
                private Object spec_detail;
                private Object id;
                private Object tech_field;

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getDisclosure() {
                    return disclosure;
                }

                public void setDisclosure(Object disclosure) {
                    this.disclosure = disclosure;
                }

                public Object getDraw_desc() {
                    return draw_desc;
                }

                public void setDraw_desc(Object draw_desc) {
                    this.draw_desc = draw_desc;
                }

                public Object getBg_tech() {
                    return bg_tech;
                }

                public void setBg_tech(Object bg_tech) {
                    this.bg_tech = bg_tech;
                }

                public Object getSpec_detail() {
                    return spec_detail;
                }

                public void setSpec_detail(Object spec_detail) {
                    this.spec_detail = spec_detail;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }

                public Object getTech_field() {
                    return tech_field;
                }

                public void setTech_field(Object tech_field) {
                    this.tech_field = tech_field;
                }
            }

            public static class PatentproposerBean {
                /**
                 * patent_id : CN200610108546.4
                 * proposer_id :
                 * record_id : 758945
                 * id : a86730df-bf8e-4e16-bfbe-8a473e364000
                 * proposer_name : 株式会社日立制作所
                 * proposer_type :
                 */

                private Object patent_id;
                private Object proposer_id;
                private Object record_id;
                private Object id;
                private Object proposer_name;
                private Object proposer_type;

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getProposer_id() {
                    return proposer_id;
                }

                public void setProposer_id(Object proposer_id) {
                    this.proposer_id = proposer_id;
                }

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }

                public Object getProposer_name() {
                    return proposer_name;
                }

                public void setProposer_name(Object proposer_name) {
                    this.proposer_name = proposer_name;
                }

                public Object getProposer_type() {
                    return proposer_type;
                }

                public void setProposer_type(Object proposer_type) {
                    this.proposer_type = proposer_type;
                }
            }

            public static class PatentsourceBean {
                /**
                 * patent_id : CN200610108546.4
                 * record_id : 752429
                 * is_full :
                 * third_url :
                 * orig_num :
                 * source_db :
                 * is_oa :
                 * id : 083291f5-b8b8-4e0e-a82d-eac8518f795a
                 * source_alburm :
                 * platform :
                 * third_abst_url :
                 */

                private Object patent_id;
                private Object record_id;
                private Object is_full;
                private Object third_url;
                private Object orig_num;
                private Object source_db;
                private Object is_oa;
                private Object id;
                private Object source_alburm;
                private Object platform;
                private Object third_abst_url;

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getIs_full() {
                    return is_full;
                }

                public void setIs_full(Object is_full) {
                    this.is_full = is_full;
                }

                public Object getThird_url() {
                    return third_url;
                }

                public void setThird_url(Object third_url) {
                    this.third_url = third_url;
                }

                public Object getOrig_num() {
                    return orig_num;
                }

                public void setOrig_num(Object orig_num) {
                    this.orig_num = orig_num;
                }

                public Object getSource_db() {
                    return source_db;
                }

                public void setSource_db(Object source_db) {
                    this.source_db = source_db;
                }

                public Object getIs_oa() {
                    return is_oa;
                }

                public void setIs_oa(Object is_oa) {
                    this.is_oa = is_oa;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }

                public Object getSource_alburm() {
                    return source_alburm;
                }

                public void setSource_alburm(Object source_alburm) {
                    this.source_alburm = source_alburm;
                }

                public Object getPlatform() {
                    return platform;
                }

                public void setPlatform(Object platform) {
                    this.platform = platform;
                }

                public Object getThird_abst_url() {
                    return third_abst_url;
                }

                public void setThird_abst_url(Object third_abst_url) {
                    this.third_abst_url = third_abst_url;
                }
            }

            public static class PatentcitedBean {
                /**
                 * record_id : 671336
                 * cited_seq :
                 * patent_id : CN200610108546.4
                 * cited_orig_id :
                 * cited_num_type :
                 * cited_num :
                 * id : 16111430-1070-4bb7-91c5-d32d2d9028c5
                 */

                private Object record_id;
                private Object cited_seq;
                private Object patent_id;
                private Object cited_orig_id;
                private Object cited_num_type;
                private Object cited_num;
                private Object id;

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getCited_seq() {
                    return cited_seq;
                }

                public void setCited_seq(Object cited_seq) {
                    this.cited_seq = cited_seq;
                }

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getCited_orig_id() {
                    return cited_orig_id;
                }

                public void setCited_orig_id(Object cited_orig_id) {
                    this.cited_orig_id = cited_orig_id;
                }

                public Object getCited_num_type() {
                    return cited_num_type;
                }

                public void setCited_num_type(Object cited_num_type) {
                    this.cited_num_type = cited_num_type;
                }

                public Object getCited_num() {
                    return cited_num;
                }

                public void setCited_num(Object cited_num) {
                    this.cited_num = cited_num;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }
            }

            public static class PatentinventorBean {
                /**
                 * record_id : 727805
                 * proposer_id :
                 * patent_id : CN200610108546.4
                 * inv_ccode :
                 * inv_acode :
                 * inv_address :
                 * id : 39e73def-9509-46c0-be10-573415480f0c
                 * inv_name : 吉泽政洋%汤本一磨%星野和义
                 */

                private Object record_id;
                private Object proposer_id;
                private Object patent_id;
                private Object inv_ccode;
                private Object inv_acode;
                private Object inv_address;
                private Object id;
                private Object inv_name;

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getProposer_id() {
                    return proposer_id;
                }

                public void setProposer_id(Object proposer_id) {
                    this.proposer_id = proposer_id;
                }

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getInv_ccode() {
                    return inv_ccode;
                }

                public void setInv_ccode(Object inv_ccode) {
                    this.inv_ccode = inv_ccode;
                }

                public Object getInv_acode() {
                    return inv_acode;
                }

                public void setInv_acode(Object inv_acode) {
                    this.inv_acode = inv_acode;
                }

                public Object getInv_address() {
                    return inv_address;
                }

                public void setInv_address(Object inv_address) {
                    this.inv_address = inv_address;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }

                public Object getInv_name() {
                    return inv_name;
                }

                public void setInv_name(Object inv_name) {
                    this.inv_name = inv_name;
                }
            }

            public static class PatentcitednplBean {
                /**
                 * cited_npl_seq :
                 * patent_id : CN200610108546.4
                 * record_id : 715929
                 * cited_npl :
                 * id : ebf0fb26-a54b-4623-8549-757ac74793b5
                 */

                private Object cited_npl_seq;
                private Object patent_id;
                private Object record_id;
                private Object cited_npl;
                private Object id;

                public Object getCited_npl_seq() {
                    return cited_npl_seq;
                }

                public void setCited_npl_seq(Object cited_npl_seq) {
                    this.cited_npl_seq = cited_npl_seq;
                }

                public Object getPatent_id() {
                    return patent_id;
                }

                public void setPatent_id(Object patent_id) {
                    this.patent_id = patent_id;
                }

                public Object getRecord_id() {
                    return record_id;
                }

                public void setRecord_id(Object record_id) {
                    this.record_id = record_id;
                }

                public Object getCited_npl() {
                    return cited_npl;
                }

                public void setCited_npl(Object cited_npl) {
                    this.cited_npl = cited_npl;
                }

                public Object getId() {
                    return id;
                }

                public void setId(Object id) {
                    this.id = id;
                }
            }
        }
    }
}

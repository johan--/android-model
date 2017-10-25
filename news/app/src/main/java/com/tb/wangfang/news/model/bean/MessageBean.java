package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/10/25.
 */

public class MessageBean {
    /**
     * bodyVO : {"contents":[{"key":"1","name":" 运动健身能量消耗简易测量方法的效度研究","value":"http://www.wanfangdata.com.cn/"}],"template":"您好，您的成果#{1}#被引用了15次，点击文献标题即可进入详情页查看。"}
     * title : 您的成果有新的被引
     * type : subscribe
     */

    private BodyVOBean bodyVO;
    private String title;
    private String type;

    public BodyVOBean getBodyVO() {
        return bodyVO;
    }

    public void setBodyVO(BodyVOBean bodyVO) {
        this.bodyVO = bodyVO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class BodyVOBean {
        /**
         * contents : [{"key":"1","name":" 运动健身能量消耗简易测量方法的效度研究","value":"http://www.wanfangdata.com.cn/"}]
         * template : 您好，您的成果#{1}#被引用了15次，点击文献标题即可进入详情页查看。
         */

        private String template;
        private List<ContentsBean> contents;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public List<ContentsBean> getContents() {
            return contents;
        }

        public void setContents(List<ContentsBean> contents) {
            this.contents = contents;
        }

        public static class ContentsBean {
            /**
             * key : 1
             * name :  运动健身能量消耗简易测量方法的效度研究
             * value : http://www.wanfangdata.com.cn/
             */

            private String key;
            private String name;
            private String value;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}

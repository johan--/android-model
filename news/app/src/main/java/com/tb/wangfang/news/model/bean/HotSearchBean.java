package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/8.
 */

public class HotSearchBean {

    /**
     * data : [{"checkTime":"","createTime":"2017-11-09 13:20:15","field":"","frequency":240521,"id":"bb8c60185f82438baca1263011348e8b","result":0,"tableName":"","theme":"((((题名:计算机 科技) OR 题名:计算机 OR 信息) OR 作者:乔晓东 OR 潘薇) OR 题名:计算机 OR 互联网) OR 关键词:石墨烯","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 17:11:49","field":"","frequency":16433,"id":"a3103b06f01d410c8f2593f5fb5de7d8","result":0,"tableName":"","theme":"��������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-09-20 16:19:03","field":"","frequency":15277,"id":"fbf940362fa442dea28267de28d9df36","result":0,"tableName":"","theme":"computer","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-11-08 21:09:27","field":"","frequency":13534,"id":"fac1197dc43440158ede0031ae8f2146","result":0,"tableName":"","theme":"(((题名:计算机 OR 科技) AND 关键词:互联网) NOT 作者:乔晓东) OR 作者:潘薇","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 16:15:33","field":"","frequency":7474,"id":"8fb482a0303240d1855a92fd21dc1fb2","result":0,"tableName":"","theme":"����������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-09-21 17:49:51","field":"","frequency":6409,"id":"c803e3953c1e4a648e7d30980ecc53e2","result":0,"tableName":"","theme":"CAD","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 16:30:52","field":"","frequency":6284,"id":"f6787e04192c4521ae554981956149d0","result":0,"tableName":"","theme":"�������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-26 10:42:01","field":"","frequency":4187,"id":"64fecd046357416d829c5e794eb83acc","result":0,"tableName":"","theme":"������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 17:40:34","field":"","frequency":3633,"id":"c0170507064441b593a5c2a5518b68c7","result":0,"tableName":"","theme":"���������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 17:58:15","field":"","frequency":2831,"id":"262dc329a9ae4709899a8214777fca08","result":0,"tableName":"","theme":"�����","themeState":"1","type":"","url":"","userId":"","userType":""}]
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
         * checkTime :
         * createTime : 2017-11-09 13:20:15
         * field :
         * frequency : 240521
         * id : bb8c60185f82438baca1263011348e8b
         * result : 0
         * tableName :
         * theme : ((((题名:计算机 科技) OR 题名:计算机 OR 信息) OR 作者:乔晓东 OR 潘薇) OR 题名:计算机 OR 互联网) OR 关键词:石墨烯
         * themeState : 1
         * type :
         * url :
         * userId :
         * userType :
         */

        private Object checkTime;
        private Object createTime;
        private Object field;
        private Object frequency;
        private Object id;
        private Object result;
        private Object tableName;
        private Object theme;
        private Object themeState;
        private Object type;
        private Object url;
        private Object userId;
        private Object userType;

        public Object getCheckTime() {
            return checkTime;
        }

        public void setCheckTime(Object checkTime) {
            this.checkTime = checkTime;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getField() {
            return field;
        }

        public void setField(Object field) {
            this.field = field;
        }

        public Object getFrequency() {
            return frequency;
        }

        public void setFrequency(Object frequency) {
            this.frequency = frequency;
        }

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

        public Object getTableName() {
            return tableName;
        }

        public void setTableName(Object tableName) {
            this.tableName = tableName;
        }

        public Object getTheme() {
            return theme;
        }

        public void setTheme(Object theme) {
            this.theme = theme;
        }

        public Object getThemeState() {
            return themeState;
        }

        public void setThemeState(Object themeState) {
            this.themeState = themeState;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getUrl() {
            return url;
        }

        public void setUrl(Object url) {
            this.url = url;
        }

        public Object getUserId() {
            return userId;
        }

        public void setUserId(Object userId) {
            this.userId = userId;
        }

        public Object getUserType() {
            return userType;
        }

        public void setUserType(Object userType) {
            this.userType = userType;
        }
    }
}

package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/8.
 */

public class HotSearchBean {

    /**
     * data : [{"checkTime":"","createTime":"2017-09-20 16:23:28","field":"","frequency":15218,"id":"394267bed451496e92bf23f49382ef7d","result":0,"tableName":"","theme":"computer","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 15:52:34","field":"","frequency":10939,"id":"58fbded9e5204085aaef620a3e0f022a","result":0,"tableName":"","theme":"��������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-09-26 17:10:48","field":"","frequency":5310,"id":"5ec58896c2bc4ff3aed4c8ea3a1f88d1","result":0,"tableName":"","theme":"cad","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-18 10:13:42","field":"","frequency":4872,"id":"f362685061a049629e6c43bcfc767e4a","result":0,"tableName":"","theme":"����������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-17 18:11:49","field":"","frequency":4097,"id":"68abed080d7d4f92a902ebd6714d1585","result":0,"tableName":"","theme":"�������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-17 21:30:33","field":"","frequency":2716,"id":"457b49610c844aa082dab399359fa1e6","result":0,"tableName":"","theme":"������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 17:40:34","field":"","frequency":2453,"id":"c0170507064441b593a5c2a5518b68c7","result":0,"tableName":"","theme":"���������","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 16:32:20","field":"","frequency":1677,"id":"23f3886a8d5b4893978f4fa4e4222b3d","result":0,"tableName":"","theme":"����","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 17:58:15","field":"","frequency":1599,"id":"262dc329a9ae4709899a8214777fca08","result":0,"tableName":"","theme":"�����","themeState":"1","type":"","url":"","userId":"","userType":""},{"checkTime":"","createTime":"2017-10-23 16:12:43","field":"","frequency":1469,"id":"666cd332986a43098169e7757d1b784f","result":0,"tableName":"","theme":"������������","themeState":"1","type":"","url":"","userId":"","userType":""}]
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
         * checkTime :
         * createTime : 2017-09-20 16:23:28
         * field :
         * frequency : 15218
         * id : 394267bed451496e92bf23f49382ef7d
         * result : 0
         * tableName :
         * theme : computer
         * themeState : 1
         * type :
         * url :
         * userId :
         * userType :
         */

        private String checkTime;
        private String createTime;
        private String field;
        private int frequency;
        private String id;
        private int result;
        private String tableName;
        private String theme;
        private String themeState;
        private String type;
        private String url;
        private String userId;
        private String userType;

        public String getCheckTime() {
            return checkTime;
        }

        public void setCheckTime(String checkTime) {
            this.checkTime = checkTime;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public String getThemeState() {
            return themeState;
        }

        public void setThemeState(String themeState) {
            this.themeState = themeState;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }
    }
}

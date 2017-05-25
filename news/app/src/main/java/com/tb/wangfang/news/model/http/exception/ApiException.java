package com.tb.wangfang.news.model.http.exception;

/**
 * Created by codeest on 2016/8/4.
 */
public class ApiException extends Exception{
    String msg;
    public ApiException(String msg)
    {
        super(msg);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }
}

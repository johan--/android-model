package com.tb.wangfang.news.app;

import java.io.File;

/**
 * Created by codeest on 2016/8/3.
 */
public class Constants {

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";
    public static final String TEXT_SIZE = "text_size";  //0 小号，1 中号，2 大号
    public static final String LOGIN_STATE = "login_state"; // 0 未登录,1 已登录

}
package com.tb.wangfang.news.app;

import java.io.File;

/**
 * Created by codeest on 2016/8/3.
 */
public class Constants {
    public static final String BASE_URL = "http://10.10.184.179/";
    //列表页查询
    public static final String SEARCH_LIST_CONTENT = BASE_URL + "app/searchlist.do";
    //导航查询
    public static final String SEARCH_LIST_NAVIGATION = BASE_URL + "app/searchplane.do";
    //1.4.热搜词查询
    public static final String HOT_SEARCH_WORDS = BASE_URL + "app/searchhotwords.do?theme=&type=&field=&themeState=&user_id=&user_type=&page=&pageSize=&sortField=&startDate=&endDate=";

    //详情页查询
    public static final String SEARCH_DETAIL = BASE_URL + "app/searchdetail.do";
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";
    public static final String TEXT_SIZE = "text_size";  //存储的字体大小的sp名称
    public static final float TEXT_SMALL_SIZE = 0.8f;
    public static final float TEXT_MID_SIZE = 1f;
    public static final float TEXT_BIG_SIZE = 1.2f;
    public static final String LOGIN_STATE = "login_state"; // 0 未登录,1 已登录
    public static final String USER_ID = "user_id";
    public static final String USER_AVATAR = "user_avatar";
    public static final String USER_NAME = "user_name";
    public static final String PASS_WORD = "password";
    public static final String LOGIN_TOKEN = "login_token";
    public static final String MI_PUSH_ID = "2882303761517622332";
    public static final String MI_PUSH_KEY = "5241762212332";
    public static final String ARTICLE_TYPE = "article_type";
    public static final String ARTICLE_ID = "article_id";
    public static float TEXTVIEWSIXE = 1;
    //极光管理员账号配置
    public static final String JMESSAGE_FRUIT_ACCOUNT = "admin";
    public static final String JMESSAGE_ORDER_ACCOUNT = "tangbin";
    public static final String JMESSAGE_FOCUS_ACCOUNT = "article_type";
    public static final String JMESSAGE_SYSTEM_ACCOUNT = "article_id";
    public static final String JMESSAGE_APP_KEY = "wanfangdata-5f5eecb63e042f246fd8b325";
    public static final String JMESSAGE_MASTER_SECRET = "wanfangdata-0406eaf9209b361eab1f19f6";
    //映射表存储key
    public static final String USER_ROLES_MAP = "user_roles_map";
    public static final String SUBJECT_MAP = "subject_map";
    public static final String EDUCATION_MAP = "education_map";
    //主页item的type
    public static final int TYPE_BANNER_4 = 4;//banner
    public static final int TYPE_INSERT_1 = 1;//一个大图
    public static final int TYPE_INSERT_2 = 2;//一个小图
    public static final int TYPE_INSERT_3 = 3;//三个小图
    //微信appid
    public static final String APP_ID = "wxc9dc7abb1bf2b460";

}
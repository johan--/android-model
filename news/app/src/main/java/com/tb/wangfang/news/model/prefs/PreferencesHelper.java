package com.tb.wangfang.news.model.prefs;

import com.tb.wangfang.news.model.bean.KeyValueListBean;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.LoginResponse;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.UserRolesListResponse;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface PreferencesHelper {

    void setTextSizeState(float state);

    float getTextSizeState();

    void setLoginState(boolean state);

    boolean getLoginState();

    void storeLoginInfo(LoginResponse response);

    String getUserId();

    String getLoginToken();

    String getUserAvatar();

    String getUserName();

    void setUserAvatar(String url);

    void storeUserRolesMap(UserRolesListResponse userRolesListResponse);

    void storeSubjectMap(SubjectListResponse subjectListResponse);

    void storeEducationMap(EducationLevelListResponse EducationLevelListResponse);

    KeyValueListBean getUserRolesMap();

    SubjectListResponse getSubjectMap();

    KeyValueListBean getEducationMap();

}

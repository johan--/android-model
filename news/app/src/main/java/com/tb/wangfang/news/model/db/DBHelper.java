package com.tb.wangfang.news.model.db;


import com.tb.wangfang.news.model.bean.DownInfo;

import java.util.List;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface DBHelper {
    void save(DownInfo info);

    void update(DownInfo info);

    void deleteDowninfo(DownInfo info);

    DownInfo queryDownBy(long Id);
   List<DownInfo> queryDownAll();
}

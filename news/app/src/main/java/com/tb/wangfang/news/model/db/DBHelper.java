package com.tb.wangfang.news.model.db;


import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.model.bean.HistoryDocItem;

import java.util.List;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface DBHelper {

    void save(DownInfo info);

    void update(DownInfo info,int state);

    void deleteDowninfo(DownInfo info);

    DownInfo queryDownBy(long id);
    DownInfo queryDownBy(String url);
    List<DownInfo> queryDownAll();



    void save(HistoryDocItem item);

    void deleteHistoryAll();

    List<HistoryDocItem> findAllHistoryItem();
}

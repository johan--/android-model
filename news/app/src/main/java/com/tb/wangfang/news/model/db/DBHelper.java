package com.tb.wangfang.news.model.db;


import com.tb.wangfang.news.model.bean.HistoryDocItem;

import java.util.List;

/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface DBHelper {


    void save(HistoryDocItem item);

    void deleteHistoryAll();

    List<HistoryDocItem> findAllHistoryItem();
}

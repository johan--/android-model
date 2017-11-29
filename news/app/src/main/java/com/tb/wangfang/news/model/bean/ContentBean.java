package com.tb.wangfang.news.model.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wanfang.main.Content;

import java.util.List;

/**
 * Created by tangbin on 2017/11/6.
 */

public class ContentBean implements MultiItemEntity {
    //    int32 id = 1;//id
//    string title = 2;//标题
//    string url = 3;//url
//    string date = 4;//发布时间
//    string excerpt = 5;//摘要
//    repeated Category categories = 6;//分类信息
//    repeated Tag tags = 7;//标签信息
//    repeated ImageDetail images = 8;//图片媒体信息
    int ItemType;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public List<Content.Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Content.Category> categories) {
        this.categories = categories;
    }

    public List<Content.Tag> getTags() {
        return tags;
    }

    public void setTags(List<Content.Tag> tags) {
        this.tags = tags;
    }

    public List<Content.ImageDetail> getImages() {
        return images;
    }

    public void setImages(List<Content.ImageDetail> images) {
        this.images = images;
    }

    String title;
    String url;
    String date;
    String excerpt;
    List<Content.Category> categories;
    List<Content.Tag> tags;
    List<Content.ImageDetail> images;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    String source;
    String style;


    public void setItemType(int itemType) {
        ItemType = itemType;
    }

    @Override
    public int getItemType() {
        return ItemType;
    }
}

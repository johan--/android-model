package com.tb.wangfang.news.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tangbin on 2017/9/26.
 */

public class MapMessage implements Parcelable {
    String key;
    String value;

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    boolean hasNext;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        value = value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(key);
        dest.writeString(value);
    }
}

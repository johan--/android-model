package com.tb.wangfang.news.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tangbin on 2017/9/26.
 */

public class MapMessage implements Parcelable {
    String key;
    String value;

    protected MapMessage(Parcel in) {
        key = in.readString();
        value = in.readString();
        hasNext = in.readByte() != 0;
    }

    public MapMessage() {
    }

    public static final Creator<MapMessage> CREATOR = new Creator<MapMessage>() {
        @Override
        public MapMessage createFromParcel(Parcel in) {
            return new MapMessage(in);
        }

        @Override
        public MapMessage[] newArray(int size) {
            return new MapMessage[size];
        }
    };

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
        this.value = value;
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

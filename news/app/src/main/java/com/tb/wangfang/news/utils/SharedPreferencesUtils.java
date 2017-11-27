package com.tb.wangfang.news.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.List;

public class SharedPreferencesUtils {
    private static SharedPreferences mSharedPreferences;
    private static Editor mEditor;
    private static SharedPreferencesUtils sharedPreferencesUtils = null;

    private SharedPreferencesUtils() {

    }

    /**
     * 单例
     */
    public static SharedPreferencesUtils getSharedPreferencesUtil(
            Context context) {
        if (sharedPreferencesUtils == null) {
            sharedPreferencesUtils = new SharedPreferencesUtils();
            if (mSharedPreferences == null) {
                mSharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(context);
                mEditor = mSharedPreferences.edit();
            }
        }
        return sharedPreferencesUtils;
    }

    /***
     * set value
     ***/
    // String
    public void setValue(String key, String value) {
        remove(key);
        mEditor.putString(key, value);
        mEditor.commit();
    }

    // Boolean
    public void setValue(String key, boolean value) {
        remove(key);
        mEditor.putBoolean(key, value);
        mEditor.commit();
    }

    // Integer
    public void setValue(String key, int value) {
        remove(key);
        mEditor.putInt(key, value);
        mEditor.commit();
    }

    // Long
    public void setValue(String key, long value) {
        remove(key);
        mEditor.putLong(key, value);
        mEditor.commit();
    }

    /***
     * get value
     ***/
    // Boolean
    public boolean getBoolean(String key, boolean defaultValue) {
        return mSharedPreferences.getBoolean(key, defaultValue);
    }

    // Integer
    public int getInt(String key, int defaultValue) {
        return mSharedPreferences.getInt(key, defaultValue);
    }

    public int getInt(String key) {
        return mSharedPreferences.getInt(key, 0);
    }

    // Long
    public long getLong(String key) {
        return mSharedPreferences.getLong(key, 0);
    }

    // String
    public String getString(String key, String defaultValue) {
        return mSharedPreferences.getString(key, defaultValue);
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key, "");
    }

    public String MedicineList2String(List MedicineList)
            throws IOException {
        // 实例化一个ByteArrayOutputStream对象，用来装载压缩后的字节文件。
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // 然后将得到的字符数据装载到ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                byteArrayOutputStream);
        // writeObject 方法负责写入特定类的对象的状态，以便相应的 readObject 方法可以还原它
        objectOutputStream.writeObject(MedicineList);
        // 最后，用Base64.encode将字节文件转换成Base64编码保存在String中
        String SceneListString = new String(Base64.encode(
                byteArrayOutputStream.toByteArray(), Base64.DEFAULT));
        // 关闭objectOutputStream
        objectOutputStream.close();
        return SceneListString;
    }

    public List String2MedicineList(String SceneListString)
            throws StreamCorruptedException, IOException,
            ClassNotFoundException {
        byte[] mobileBytes = Base64.decode(SceneListString.getBytes(),
                Base64.DEFAULT);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
                mobileBytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(
                byteArrayInputStream);
        List SceneList = (List) objectInputStream
                .readObject();
        objectInputStream.close();
        return SceneList;
    }

    // Delete
    public void remove(String key) {
        if (mSharedPreferences.contains(key)) {
            mEditor.remove(key);
            mEditor.commit();
        }
    }

    public void clear() {
        mEditor.clear();
        mEditor.commit();
    }




}

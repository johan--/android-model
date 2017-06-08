package com.tb.wangfang.news.utils;

/**
 * Created by tangbin on 2017/6/5.
 */

public class NDKFileEncryptUtils {
    static {
        System.loadLibrary("native-lib");
    }

    public native  void encry(String inputPath, String outputPath);

    public native  void decry(String inputPath, String outputPath);
}

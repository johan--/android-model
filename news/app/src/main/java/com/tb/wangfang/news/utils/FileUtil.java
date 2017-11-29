package com.tb.wangfang.news.utils;

import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;

import com.google.protobuf.ByteString;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Mahavir on 12/15/16.
 */

public class FileUtil {
    private static final String TAG = FileUtil.class.getSimpleName();
    private static final String WANFANG_ROOT = "wanfang";


    /**
     * 得到文件私有目录
     *
     * @param base
     * @param filename
     * @return
     */
    public static String getPrivateFolder(String base, String filename) {
        String[] s = filename.split("\\.");
        return base + "/" + WANFANG_ROOT + "/" + s[0];

    }

    /**
     * 得到私有文件地址
     *
     * @param base
     * @param filename
     * @return
     */
    public static String getPrivateFilePath(String base, String filename) {

        return getPrivateFolder(base, filename) + "/" + filename;

    }

    /**
     * @param fileName
     * @return
     */

    public static String getEncryFolderPath(String fileName) {
        String[] s = fileName.split("\\.");
        String m = "sda.pdf";
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/" + WANFANG_ROOT + "/" + s[0];
    }

    public static String getEncryFilePath(String fileName) {
        return getEncryFolderPath(fileName) + "/" + fileName;
    }

    public static boolean saveReadFile(ByteString byteString, String privateBase, String fileName) {

        NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();
        String encryString = getEncryFilePath(fileName);
        String privateString = getPrivateFilePath(privateBase, fileName);
        File Folder = new File(getPrivateFolder(privateBase, fileName));
        File encryFolder = new File(getEncryFolderPath(fileName));
        if (!Folder.exists()) {
            Folder.mkdirs();
        }
        if (!encryFolder.exists()) {
            encryFolder.mkdirs();
        }
        if (checkIsExist(fileName, byteString.toByteArray().length)) {

            encryptUtils.decry(encryString, privateString);
            return true;
        } else {
            InputStream is = byteString.newInput();
            FileOutputStream fileOutputStream = null;


            try {
                fileOutputStream = new FileOutputStream(privateString, true);

                byte[] buffer = new byte[2048];//缓冲数组2kB
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                }
                fileOutputStream.flush();
                //加密写到encry文件中
                encryptUtils.encry(privateString, encryString);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } finally {
                //关闭IO流
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }

            }

        }


    }

    private static boolean checkIsExist(String fileName, int size) {
        String fileString = getEncryFilePath(fileName);
        File file = new File(fileString);
        long s = file.length();
        int m = size;
        if (s == m) {
            Log.e(TAG, "checkIsExist: sda");
        }
        if (file.exists() && file.length() == size) {
            Log.e(TAG, "checkIsExist: 下载文件以及存在");
            return true;
        }
        Log.e(TAG, "checkIsExist: 下载文件不存在");
        return false;


    }

    public static boolean saveBitmap(Bitmap bitmap, String path) {
        try {
            OutputStream os = new FileOutputStream(path);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, os);
            os.close();
            return true;
        } catch (Exception e) {
            Log.e("TAG", "", e);
            return false;
        }

    }


}

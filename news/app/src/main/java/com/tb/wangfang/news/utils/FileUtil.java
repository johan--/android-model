package com.tb.wangfang.news.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;

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
    private static final String FOLIO_READER_ROOT = "/wanfangreader/";
    private static final String FOLIO_READER_ROOT_ENCRY = "/wanfangencry/";
    private static final String FOLIO_READER_ROOT_DECRY = "/wanfangdecry/";



    public static void savePDFFile(final Context context, String epubFilePath, String epubFileName) {
        String filePath;
        InputStream epubInputStream;
        boolean isFolderAvalable;
        try {
            isFolderAvalable = isFolderAvailable(epubFileName);
            filePath = getFolioEpubFolderPath(epubFileName) + "/" + epubFileName + ".pdf";
            if (!isFolderAvalable) {
                AssetManager assetManager = context.getAssets();
                epubInputStream = assetManager.open(epubFilePath);
                saveTempEpubFile(filePath, epubFileName, epubInputStream);

            }
        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }

    }

    public static String getFolioEpubFolderPath(String epubFileName) {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/" + FOLIO_READER_ROOT + "/" + epubFileName;
    }

    /**
     * @param epubFileName
     * @return externalStorage/wanfangencry/name
     */
    public static String getFolioPDFEncryFolderPath(String epubFileName) {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/" + FOLIO_READER_ROOT_ENCRY + "/" + epubFileName;
    }

    public static String getFolioPDFDecryFolderPath(String epubFileName) {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/" + FOLIO_READER_ROOT_DECRY + "/" + epubFileName;
    }

    public static String getFolioPDFFilePath(String epubFilePath, String epubFileName) {
        return getFolioEpubFolderPath(epubFileName) + "/" + epubFileName + ".pdf";
    }

    /**
     * @param epubFileName
     * @return /wanfangencry/epubFileName/epubFileName.pdf
     */
    public static String getFolioPDFEncryFilePath(String epubFileName) {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + "/" + FOLIO_READER_ROOT_ENCRY + "/" + epubFileName + "/" + epubFileName + ".pdf";
    }



    private static boolean isFolderAvailable(String epubFileName) {
        File file = new File(getFolioEpubFolderPath(epubFileName));
        return file.isDirectory();
    }



    /**
     * @param filePath
     * @param fileName
     * @param inputStream
     * @return
     */
    public static Boolean saveTempEpubFile(String filePath, String fileName, InputStream inputStream) {
        OutputStream outputStream = null;
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                File folder = new File(getFolioEpubFolderPath(fileName));
                folder.mkdirs();

                outputStream = new FileOutputStream(file);
                int read = 0;
                byte[] bytes = new byte[inputStream.available()];

                while ((read = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
            } else {
                return true;
            }
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        } catch (IOException e) {
            Log.d(TAG, e.getMessage());
        }
        return false;
    }


    public static String getFolioPDFDecryFolderPath(String path, String about) {


        return path
                + "/" + FOLIO_READER_ROOT_DECRY + "/" + about;
    }

    /**
     * @param pathPre 根目录如 getFilesDir().getPath()
     * @param about   子目录 和文件名 如pdf
     * @return
     */
    public static String getFolioPDFDecryFilePath(String pathPre, String about) {
        return pathPre
                + "/" + FOLIO_READER_ROOT_DECRY + "/" + about + "/" + about + ".pdf";
    }
}

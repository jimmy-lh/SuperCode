package com.lh.commonclasses.utils;

import android.text.TextUtils;

import com.lh.commonclasses.base.BaseApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 缓存工具
 */
public class CacheUtil {
    public static final String TAG = "CacheUtil";
    public static String DIRECTORY_DOCUMENTS = "Documents";

    /**
     * @param type eg.  Environment.DIRECTORY_PICTURES
     * @return
     */
    public static String getCachePath(String type) {
        String path = BaseApp.getInstance().getExternalFilesDir(type).getPath() + "/";
        return path;
    }

    /**
     * 写文件到缓存路径
     *
     * @param fileName    文件名
     * @param fileContent 文件内容
     */
    public static void writeDocumentFile(String fileName, String fileContent) {
        String path = getCachePath(DIRECTORY_DOCUMENTS);
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String fullPath = path + fileName;
        try {
            FileOutputStream out = new FileOutputStream(fullPath); // 输出文件路径
            out.write(fileContent.getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 写对象到缓存路径
     *
     * @param fileName    文件名
     * @param fileContent 文件内容
     */
    public static void writeDocumentObject(String fileName, Object fileContent) {
        String path = getCachePath(DIRECTORY_DOCUMENTS);
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String fullPath = path + fileName;
        try {
            FileOutputStream fileOut = new FileOutputStream(fullPath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // 输出文件路径
            out.writeObject(fileContent);
            fileOut.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 从缓存路径读取文件
     *
     * @param fileName 文件名
     * @return
     */
    public static String readDocumentFile(String fileName) {
        StringBuffer sb = new StringBuffer();
        try {
            String filePath = getCachePath(DIRECTORY_DOCUMENTS) + fileName;

            String encoding = "utf-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    sb.append(lineTxt);
                }
                read.close();
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        } else {
            return sb.toString();
        }
    }

    /**
     * 从缓存路径读取对象
     *
     * @param fileName 文件名
     * @return
     */
    public static Object readDocumentObject(String fileName) {
        StringBuffer sb = new StringBuffer();
        Object object = null;
        try {
            String filePath = getCachePath(DIRECTORY_DOCUMENTS) + fileName;

            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                FileInputStream inputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                object = objectInputStream.readObject();
                inputStream.close();
                objectInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}

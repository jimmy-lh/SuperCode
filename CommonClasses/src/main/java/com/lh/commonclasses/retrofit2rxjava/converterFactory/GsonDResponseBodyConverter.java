package com.lh.commonclasses.retrofit2rxjava.converterFactory;

import com.lh.commonclasses.retrofit2rxjava.converterFactory.bean.BaseResponseBean;
import com.lh.commonclasses.retrofit2rxjava.converterFactory.bean.EncryptJsonBean;
import com.lh.commonclasses.retrofit2rxjava.converterFactory.bean.ResultException;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.lh.commonclasses.utils.DesUtil;
import com.lh.commonclasses.utils.LogUtil;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.zip.GZIPInputStream;

import okhttp3.ResponseBody;
import retrofit2.Converter;

public final class GsonDResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    private final String TAG = "GsonDResponse";
    private final Gson gson;
    private final TypeAdapter<T> adapter;
    private final Type type;
    private final Annotation[] annotations;

    public GsonDResponseBodyConverter(Gson gson, TypeAdapter<T> adapter, Type type, Annotation[] annotations) {
        this.gson = gson;
        this.adapter = adapter;
        this.type = type;
        this.annotations = annotations;
    }

    private String getResponseValue(ResponseBody value) {
        try {
            String response = "";
            boolean gzipped = false;
            if (annotations != null && annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    if (annotation.toString().contains("Accept-Encoding:gzip")) {
                        gzipped = true;
                        break;
                    }
                }
            }
            if (gzipped) {
                InputStream is = null;
                ByteArrayOutputStream bos = null;
                byte[] bytes = value.bytes();
                try {
                    is = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(bytes)));
                    bos = new ByteArrayOutputStream();
                    int b;
                    while ((b = is.read()) != -1) {
                        bos.write(b);
                    }
                    bos.flush();
                    response = bos.toString();
                } catch (Exception e) {
                    if (null != bytes) {
                        response = new String(bytes);
                    }
                } finally {
                    if (is != null) {
                        is.close();
                    }
                    if (bos != null) {
                        bos.close();
                    }
                }
            } else {
                response = value.string();
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            value.close();
        }
        return "";
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = getResponseValue(value);
        BaseResponseBean result = gson.fromJson(response, BaseResponseBean.class);
        if ("0".equals(result.getReturnCode())) {
            if (DesUtil.getEncrypt()) {
                EncryptJsonBean jsonBean = gson.fromJson(response, EncryptJsonBean.class);
                String decrypt = DesUtil.decrypt(jsonBean.getData());
                response = response.replace("\"" + jsonBean.getData() + "\"", decrypt);
                LogUtil.d(TAG, "解密" + type + response);
                return gson.fromJson(response, type);
            } else {
                LogUtil.d(TAG, "无需解密" + type + response);
                return gson.fromJson(response, type);
            }
        } else {
            LogUtil.e(TAG, "returnCode = " + result.getReturnCode() + ",message = " + result.getErrorMessage());
            throw new ResultException(result.getReturnCode(), result.getErrorMessage());
        }
    }


}

package com.cyhd.portalmvp.mvp.converterFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * A {@linkplain Converter.Factory converter} which uses Gson for JSON.
 * <p/>
 * Because Gson is so flexible in the types it supports, this converter assumes that it can handle
 * all types. If you are mixing JSON serialization with something else (such as protocol buffers),
 * you must {@linkplain Retrofit.Builder#addConverterFactory(Converter.Factory) add this instance}
 * last to allow the other converters a chance to see their types.
 */
public final class GsonDConverterFactory extends Converter.Factory {
    /**
     * Create an instance using a default {@link Gson} instance for conversion. Encoding to JSON and
     * decoding from JSON (when no charset is specified by a header) will use UTF-8.
     */

    private final Gson gson;

    /**
     * 是否向外抛出错误码，
     * false时表示内部不处理服务器返回的returnCode为非0的情况
     * true时表示当服务器返回的returnCode为非0时，内部返回ResultException对象，用户可在外部调用
     * OkHttpResultCallBack显示错误信息
     */
    private boolean isThrowableError;

    public static GsonDConverterFactory create(boolean isThrowableError) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return create(gson, isThrowableError);
    }

    /**
     * Create an instance using {@code gson} for conversion. Encoding to JSON and
     * decoding from JSON (when no charset is specified by a header) will use UTF-8.
     */
    public static GsonDConverterFactory create(Gson gson, boolean isThrowableError) {
        return new GsonDConverterFactory(gson, isThrowableError);
    }

    private GsonDConverterFactory(Gson gson, boolean isThrowableError) {
        if (gson == null) {
            throw new NullPointerException("gson == null");
        }
        this.gson = gson;
        this.isThrowableError = isThrowableError;
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations,
                                                            Retrofit retrofit) {
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        if (isThrowableError) {
            return new GsonDResponseBodyConverter<>(gson, adapter, type, annotations);
        } else {
            return new GsonDOriginalResponseBodyConverter<>(gson, adapter, type, annotations);
        }
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
                                                          Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        return new GsonDRequestBodyConverter<>(gson, adapter);
    }

}

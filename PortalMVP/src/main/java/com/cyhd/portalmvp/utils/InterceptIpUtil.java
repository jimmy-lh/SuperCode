package com.cyhd.portalmvp.utils;

import com.lh.commonclasses.utils.LogUtil;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fanjia on 2017/7/2.
 */

public class InterceptIpUtil {

    private static String TAG = "InterceptIpUtil";

    /**
     * 获取IP与域名,使用java工具类实现,调用方式getIP(URI.create('http://127.0.0.1:9040/1/****'）
     *
     * @param uri
     * @return
     */
    public static URI getInterceptIP(URI uri) {
        URI effectiveURI = null;
        try {
            effectiveURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null);
        } catch (Throwable var4) {
            effectiveURI = null;
        }
        return effectiveURI;
    }

    public static String getInterceptIP(String url) {
        //使用正则表达式过滤，
        String re = "((http|ftp|https)://)(([a-zA-Z0-9._-]+)|([0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}))(([a-zA-Z]{2,6})|(:[0-9]{1,4})?)";
        String str = "";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(re);
        // 忽略大小写的写法
//         Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        //若url==http://127.0.0.1:9040或www.baidu.com的，正则表达式表示匹配
        if (matcher.matches()) {
            str = url;
        } else {
            String[] split2 = url.split(re);
            if (split2.length > 1) {
                String substring = url.substring(0, url.length() - split2[1].length());
                str = substring;
            } else {
                str = split2[0];
            }
        }
        LogUtil.d(TAG, "getInterceptIP=" + str);
        return str;
    }

    /**
     * 获取url中指定字段的地址
     * 运用场景：url的格式url="...field1=address1&field2=address2&field3=address3";
     * 返回address为"="和"&"之间的字符，其中field3返回的为"="后面所有的字符
     *
     * @param url
     * @param field
     * @return
     */
    public static String getFieldAddress(String url, String field) {
        try {
            int index = url.indexOf(field);
            if (index == -1) {
                return "";
            } else {
                int beginIndex = url.indexOf("=", index);
                int endIndex = url.indexOf("&", index);
                if (beginIndex == -1) {
                    return "";
                } else if (endIndex == -1) {
                    return url.substring(beginIndex + 1);
                } else {
                    return url.substring(beginIndex + 1, endIndex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

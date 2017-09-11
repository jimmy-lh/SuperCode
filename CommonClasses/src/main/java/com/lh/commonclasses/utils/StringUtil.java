package com.lh.commonclasses.utils;

/**
 * 对字符串处理的方法
 */
public class StringUtil {

    /**
     * 获取url中指定字段的地址
     * 运用场景：url的格式url="...field1=address1&field2=address2&field3=address3";
     * 返回address为"="和"&"之间的字符，其中field3返回的为"="后面所有的字符
     *
     * @param url
     * @param field 传入字段字符串，如"field1"
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

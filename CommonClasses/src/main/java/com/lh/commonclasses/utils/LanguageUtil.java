package com.lh.commonclasses.utils;

import java.util.Locale;

public class LanguageUtil {

    /**
     * 是否为中文
     */
    public static boolean isLanguageZh() {
        String language = Locale.getDefault().getLanguage();
        return language.equalsIgnoreCase("zh");
    }

    /**
     * 是否为英语
     */
    public static boolean isLanguageEn() {
        String language = Locale.getDefault().getLanguage();
        return language.equalsIgnoreCase("en");
    }

    /**
     * 是否为葡语
     */
    public static boolean isLanguagePt() {
        String language = Locale.getDefault().getLanguage();
        return language.equalsIgnoreCase("pt");
    }
}

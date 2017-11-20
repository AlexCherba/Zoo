package com.level;

public abstract class StringUtils {
    public static String[] splitBySeparator(String str, String separator) {
        //Кот,Васька,15,Карпаты";
        //separator = ",";
        return str.split(separator);
    }
}

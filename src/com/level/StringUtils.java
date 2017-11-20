package com.level;

public class StringUtils {
    public String[] splitBySeparator(String str, String separator){
        //String str = "3:45:87:888:9";
        //separator = ":";
        return str.split(separator);
    }
}

package com.book.api.utils;

public class ApiStrUtils {
    public static boolean isEmpty(String str) {
        if (str.equals("")||str==null||str.length()<=0){
            return true;
        }
        return false;
    }
}

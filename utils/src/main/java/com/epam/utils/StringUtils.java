package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         int val = Integer.parseInt(str);
         if(val>=0) return true;
         return false;
    }
}

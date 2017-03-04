package com.mc.ssm.utils;

import java.io.UnsupportedEncodingException;

/**
 * Created by win7 on 2017/2/14.
 */
public class EncodingTool {
    public static String encodeStr(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

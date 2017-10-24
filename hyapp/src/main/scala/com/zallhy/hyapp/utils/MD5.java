package com.zallhy.hyapp.utils;

import org.springframework.util.DigestUtils;

public class MD5 {
    public static String toHEX(String s) {
        byte[] b = DigestUtils.md5Digest(s.getBytes());
        return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", b[0], b[1], b[2], b[3], b[4], b[5], b[6], b[7], b[8], b[9], b[10], b[11], b[12], b[13], b[14], b[15]);
    }
}

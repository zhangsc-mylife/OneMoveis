package com.oneroom.zsc.onemovies.utils;

import org.springframework.util.StringUtils;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Utils {

    /**
     *
     * @param inputStr
     * @return
     */

    public static String md5Encode(String inputStr){
        byte[] md5Code = null;

        try {
            md5Code = MessageDigest.getInstance("MD5").digest(inputStr.getBytes());
        } catch (NoSuchAlgorithmException e) {
            md5Code = inputStr.getBytes();
        }

        BigInteger bi = new BigInteger(md5Code);
        return bi.abs().toString(32).toUpperCase();
    }

    public static String generatePwdMD5(String inputStr, String salt){
        if(StringUtils.isEmpty(salt)){
            salt ="";

        }
        return md5Encode(salt+md5Encode(inputStr));
    }

    public static void main(String[] args){
        String passw = "zhangsc";
        String md5passw = MD5Utils.md5Encode(passw);
        System.out.println(md5passw);
    }
}

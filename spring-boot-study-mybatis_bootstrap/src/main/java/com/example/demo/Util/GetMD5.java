package com.example.demo.Util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GetMD5{


    public static String MakeMd5(String str){
        String d = "";
        try {
            MessageDigest mdi = MessageDigest.getInstance("MD5");
            byte[] input = str.getBytes("UTF-8");
            byte[] hash = mdi.digest(input);
            for (int i=0;i<hash.length;i++){
                int v = hash[i] & 0xFF;
                if (v<16) {
                    d+="0";
                }
                d+=Integer.toString(v,16).toLowerCase();
            }
            System.out.println(d);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return d;
    }
}
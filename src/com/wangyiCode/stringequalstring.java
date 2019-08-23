package com.wangyiCode;

import java.util.Arrays;

public class stringequalstring {
    public static void main(String[] args) {
        String s1="aaaabbc";
        String s2="abcbaaa";
        compare(s1,s2);
    }
    public static void compare(String s1,String s2){
        byte[]b1=s1.getBytes();
        byte[]b2=s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1=new String(b1);
        s2=new String(b2);
        if (s1.equals(s2))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}

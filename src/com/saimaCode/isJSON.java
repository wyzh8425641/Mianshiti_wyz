package com.saimaCode;

import java.util.Scanner;

public class isJSON {
    public static void main(String[] args) {
        String s="abc";
        if (Character.isLetterOrDigit(s.charAt(1))){
            System.out.println(true);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println(getJSONType(s));
//    }
//    public static boolean getJSONType(String str) {
//        boolean result = false;
//        if (StringUtils.isNotBlank(str)) {
//            str = str.trim();
//            if (str.startsWith("{") && str.endsWith("}")) {
//                result = true;
//            } else if (str.startsWith("[") && str.endsWith("]")) {
//                result = true;
//            }
//        }
//        return result;
//    }
}

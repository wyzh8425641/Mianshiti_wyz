package com.wangyiCode;

import java.util.Arrays;
import java.util.Scanner;

public class stringup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            if (str[i]>='0'&&str[i]<='9'){
                sb.append(str[i]);
            }
        }
        String ss=sb.toString();
        StringBuffer sss=new StringBuffer();
        char[] array=ss.toCharArray();
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            sss.append(array[i]);
        }
        System.out.println(sss);
    }
}

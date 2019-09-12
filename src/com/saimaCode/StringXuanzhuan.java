package com.saimaCode;

import java.util.Scanner;

public class StringXuanzhuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ss=s.split(";");
        boolean flag=false;
        for (int i=0;i<ss[0].length();i++){
            String s1=s.substring(0,i+1);
            String s2=s.substring(i+1,ss[0].length());
            if (ss[1].contains(s1)){
                if (ss[1].contains(s2)){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}

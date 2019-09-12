package com.saimaCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int count=0;

        Pattern p=Pattern.compile(s2);
        Matcher m=p.matcher(s1);
        while (m.find()){
            count++;
        }

//        int Index=0;
//        while (s1.indexOf(s2,Index)!=-1){
//            Index=s1.indexOf(s2,Index);
//            Index+=s2.length();
//            count++;
//        }
        System.out.println(count);
    }
}

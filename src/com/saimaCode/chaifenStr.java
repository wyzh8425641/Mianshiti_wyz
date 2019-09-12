package com.saimaCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chaifenStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] sarr=s.split("[\\#\\ \\:]");
        int temp=0;
        int count=0;
        String a=null;
        String b=null;
        Map<String,String> hm=new HashMap<>();
        for (int i=0;i<sarr.length;i++){
            temp=temp%2;
            if (!sarr[i].equals("")){
                temp++;
                if (temp==1){
                    a=sarr[i];
                }
                else{
                    b=sarr[i];
                    count++;
                    hm.put(a,b);
                }
            }
        }
        System.out.println(count);
        for (String key:hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
    }
}

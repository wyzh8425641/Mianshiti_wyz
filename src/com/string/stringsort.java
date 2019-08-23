package com.string;

import java.util.*;
public class stringsort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        String[] str=new String[m];
        for(int i=0;i<m;i++){
            str[i]=sc.next();
        }
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            int length=str[i].length();
            String temp=str[i].substring(length-6,length);
            a[i]=Integer.parseInt(temp);
        }
        Arrays.sort(a);
        for(int i=0;i<m;i++){
            System.out.println(a[i]);
        }
    }
}
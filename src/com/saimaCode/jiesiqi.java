package com.saimaCode;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jiesiqi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        Map<String,Integer> map=new HashMap<>();
        int sum=0;
        for (int i=0;i<n;i++){
            String s=sc.next();
            String[] a=s.split("[\\+\\=\\ ]");
            int temp=0;
            for (int j=1;j<a.length;j++){
                if (i==0){
                    map.put(a[0],Integer.parseInt(a[j]));

                }else {
                    if (map.containsKey(a[j])){
                        temp+=map.get(a[j]);
                    }
                    else {
                        flag=false;
                    }
                    map.put(a[0],temp);
                    sum=temp;
                }
            }
//
//            if (a.length==3){
//                String k1=a[1];
//                String k2=a[2];
//                int k3,k4;
//                if (map.containsKey(k1)&&map.containsKey(k2)){
//                    k3=map.get(k1);
//                    k4=map.get(k2);
//                    temp=k3+k4;
//                    sum=temp;
//                }
//                else {
//                    flag=false;
//                }
//                map.put(ss,temp);
//            }
//            else {
//                int kk=Integer.parseInt(a[1]);
//                if (kk>=Integer.MIN_VALUE&&kk<=Integer.MAX_VALUE){
//                    map.put(a[0],kk);
//                }
//                else if (map.containsKey(a[1])){
//                    int t=map.get(a[1]);
//                    map.put(a[1],t);
//                }
//
//            }
        }
        if (flag){
            System.out.println(sum);
        }else
            System.out.println("NA");
    }
}

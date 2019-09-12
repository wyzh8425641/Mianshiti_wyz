package com.saimaCode;

import java.util.*;
public class qiwang{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=1;
        double d=expect(n,arr,max);
        System.out.println(d);
    }
    public static double expect(int n,int[] arr,int max){
        double e=1;
        if (n!=1){
            for (int i=1;i<arr.length;i++){
                e+=(1.0/n)*expect(n-1,arr,max);
            }
            for(int j=max;j<n;j++){
                e+=(1.0/n)*expect(n-1,arr,j);
            }
        }else {
            for (int i=1;i<max;i++){
                e+=(1.0/n)*max;
            }
            for (int j=max;j<n;j++){
                e+=(1.0/n)*j;
            }
        }
        return e;
    }
}
package com.saimaCode;

import java.util.Scanner;

public class zhuangdingzi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        boolean flag=false;
        int min=Integer.MAX_VALUE;
        int a=n/4;
        int b=n/9;
        for (int i=0;i<=a;i++){
            for (int j=0;j<=b;j++){
                int temp=4*i+9*j;
                if(temp<n){
                    continue;
                }
                else if (temp==n){
                    count=i+j;
                    flag=true;
                    if (min>count){
                        min=count;
                    }
                }
                else
                    break;
            }
        }
        if (flag==true){
            System.out.println(count);
        }else {
            System.out.println(-1);
        }
    }
}

package com.saimaCode;

import java.util.Scanner;

public class lianxuNumbersSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;++i){
            int temp=n,j=i;
            while (temp>0){
                temp-=j++;
            }
            if (temp==0)
                sum++;
        }
        System.out.println(sum);
    }
}

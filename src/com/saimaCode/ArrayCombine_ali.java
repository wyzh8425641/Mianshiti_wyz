package com.saimaCode;

import java.util.Scanner;

//对合并之后的数组中相邻元素两两相乘，然后求其累加值，请给出所有合并可能形成的数组对应累加值的最小值。
public class ArrayCombine_ali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int[] ab=new int[2*n];
        min=arraycombine(a,0,b,0,min,ab,n);
        System.out.println(min);
    }
    public static int  arraycombine(int[] a,int aindex,int[] b,int bindex,int min,int[] ab,int n){
        if((aindex+bindex)==2*n){
            int temp=0;
            for (int i = 0; i < 2*n; i+=2) {
                temp+=(ab[i]*ab[i+1]);
            }
            if (temp<min)
                min=temp;
        }
        while (aindex<n||bindex<n){
            if (aindex<n){
                ab[aindex+bindex]=a[aindex];
                arraycombine(a,aindex+1,b,bindex,min,ab,n);
            }
            if (bindex<n){
                ab[aindex+bindex]=b[bindex];
                arraycombine(a,aindex,b,bindex+1,min,ab,n);
            }

        }
        return min;
    }
}

package com.wangyiCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        if (n<=1){
            System.out.println(0+" "+0);
        }
        else {
        int min=Integer.MAX_VALUE;
        int first=0,end=0;

        for (int i=1;i<n;i++){
            if (Math.abs(array[i]-array[i-1])<min){
                min=Math.abs(array[i]-array[i-1]);
                first=array[i-1];
                end=array[i];
            }
        }

        System.out.println(first+" "+end);
        }
    }
}

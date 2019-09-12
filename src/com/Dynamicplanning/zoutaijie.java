package com.Dynamicplanning;

import java.util.Arrays;
import java.util.Scanner;

public class zoutaijie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                int[] a=new int[m+3];
                a[1]=0;
                a[2]=1;
                a[3]=2;
                for (int j=4;j<=m;j++){
                    a[j]=a[j-1]+a[j-2];
                }
                System.out.println(a[m]);
                System.out.println(Arrays.toString(a));
            }
            return;
        }
    }
}

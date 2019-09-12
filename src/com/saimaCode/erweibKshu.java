package com.saimaCode;

import java.util.Arrays;
import java.util.Scanner;

public class erweibKshu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int j=0;j<m;j++){
            arr[0][j]=j+1;
        }
        for (int i=1;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=arr[i-1][j]+(j+1);
            }
        }
        int[] array=new int[n*m];
        int num=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[num]=arr[i][j];
                num++;
            }
        }
        Arrays.sort(array);
        if (k<0||k>n*m){
            System.out.println(-1);
        }else
        System.out.println(array[array.length-k]);
    }
}

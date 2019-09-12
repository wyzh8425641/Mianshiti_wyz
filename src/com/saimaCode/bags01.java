package com.saimaCode;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class bags01{
    public  static  int Search(int [] a,int key,int len)
    {
        int start=0;
        int end=len-1;
        int mid;
        int maxIndex=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(key>a[mid]) start=mid+1;
            else
            {
                end=mid -1;
                maxIndex=mid;
            }
        }
        return  maxIndex;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][2];
        if(n==1)System.out.println(1);
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int [] a=new  int[n];
        a[0]=arr[0][1];
        int len=1;
        for (int i=1;i<n;i++){
            if (arr[i][1]>=a[len-1])
                a[len++]=arr[i][1];
            else{
                int index=Search(a,arr[i][1],len);
                a[index]=arr[i][1];
            }
        }
        System.out.println(len);

    }
}
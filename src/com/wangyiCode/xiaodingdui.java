package com.wangyiCode;
//小顶堆构建算法
import java.util.Scanner;

public class xiaodingdui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        heapSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void heapSort(int[] arr){
        int n=arr.length;
        for (int i=n/2-1;i>=0;i--){
            buildsmallheap(arr,i,n);
        }
        for (int i=n-1;i>=1;i--){
            swap(arr,0,i);
            buildsmallheap(arr,0,i);
        }

    }
    public static void buildsmallheap(int[] arr,int i,int j){
        int left=2*i;
        int right=2*i+1;
        int target=i;
        if (left<j&&arr[left]<arr[i]){
            target=left;
        }
        if (right<j&&arr[right]<arr[target]){
            target=right;
        }
        if (target!=i){
            swap(arr,i,target);
            buildsmallheap(arr,target,j);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

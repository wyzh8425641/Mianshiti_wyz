package com.SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;
//快速排序
public class quickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int[] a=new int[str.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(str[i]);
        }
        Qsort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void Qsort(int[] a,int low,int high){
        int temp;
        if(low<high){
            temp=partition(a,low,high);
            Qsort(a,low,temp-1);
            Qsort(a,temp+1,high);
        }
    }
    public static int partition(int[] a,int low,int high){
        int temp;
        temp=a[low];
        while (low<high){
            while (low<high&&a[high]>=temp){
                high--;
            }
            swap(a,low,high);
            while (low<high&&a[low]<temp){
                low++;
            }
            swap(a,low,high);

        }
        return low;
    }
    public static void swap(int[] a,int low,int high){
        int temp=a[low];
        a[low]=a[high];
        a[high]=temp;
    }
}

package com.Array;
//获得数组中最小的K个值

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetLeastNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int k=in.nextInt();
        String[] str=s.split("\\s+");
        int[] array=new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            array[i]=Integer.parseInt(str[i]);
        }
        System.out.println(GetLeastNumbers(array,k));
    }
    public static ArrayList<Integer> GetLeastNumbers(int[] array,int k){
        ArrayList<Integer> result=new ArrayList<>();
        if(array==null||array.length==0||k<=0||k>array.length){
            return result;
        }
        for (int i=k/2-1;i>=0;i--){
            buildMaxHeapSort(array,i,k);
        }
        for(int j=k;j<array.length;j++){
            if(array[j]<array[0]){
                swap(array,0,j);
                buildMaxHeapSort(array,0,k);
            }
        }
        for (int i=k-1;i>=0;i--){
            result.add(array[i]);
        }
        return result;
    }
    public static void buildMaxHeapSort(int[] array,int i,int k){
        int leftchild=2*i;
        int rightchild=2*i+1;
        int larget=i;
        if(leftchild<k&&array[i]<array[leftchild]){
            larget=leftchild;
        }
        if (rightchild<k&&array[larget]<array[rightchild]) {
            larget=rightchild;
        }
        if (larget!=i) {
            swap(array,i,larget);
            buildMaxHeapSort(array,larget,k);
        }
    }
    public static void swap(int[] array,int i,int k){
        int temp=array[i];
        array[i]=array[k];
        array[k]=temp;
    }
}

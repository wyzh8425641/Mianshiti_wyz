package com.saimaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TopN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split(";");
        String[] s2=str[0].split(",");
        int m=Integer.parseInt(str[1]);

        int[] array=new int[s2.length];
        for (int i = 0; i <s2.length ; i++) {
            array[i]=Integer.parseInt(s2[i]);
        }
        int[] a=new int[s2.length];
        int i=0,j=s2.length-1;
        while (i<j){
            int temp=i+s2.length-1-j;
            if (array[temp]%2==0){
                a[i++]=array[temp];
            }
            else {
                a[j--]=array[temp];
            }
        }
        a[i]=array[s2.length-1];
        if (array[i]%2==0){
            i++;
        }
        int[] a1=new int[i+1];
        int n1=0;
        int[] a2=new int[s2.length-1-i];
        int n2=0;
        for (int k=0;k<a.length;k++){
            if (k<=i){
                a1[n1++]=a[k];
            }
            else {
                a2[n2++]=a[k];
            }
        }
        ArrayList<Integer> list1=GetLeastNumbers(a1,m);
        ArrayList<Integer> list2=GetLeastNumbers(a2,m);
        StringBuffer sb=new StringBuffer();
        int q=0;
        int count=0;
        while (count<m){
            if (q<list1.size()){
                sb.append(list1.get(q++));
                sb.append(',');
                count++;
            }
            else
                break;
        }
        int p=0;
        while (count<m){
            if (p<list2.size()){
                sb.append(list2.get(p++));
                sb.append(',');
                count++;
            }
        }
        System.out.println(sb);
    }
    public static ArrayList<Integer> GetLeastNumbers(int[] array,int k){
        ArrayList<Integer> result=new ArrayList<>();
        if(array==null||array.length==0||k<=0||k>array.length){
            return result;
        }
        //构建大顶堆
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



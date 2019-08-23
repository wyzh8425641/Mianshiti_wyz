package com.wangyiCode;

import java.util.Scanner;

public class erfengsearch {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        String[] ss=s.split("\\s");
//        int[] array=new int[ss.length];
//        for (int i = 0; i < array.length; i++) {
//            array[i]=Integer.parseInt(ss[i]);
//        }
        int[] array={11,13,15,17,19,21};
        System.out.println(recurFind(array,0,array.length-1,19));
    }
    public static int recurFind(int[] array,int start,int end,int searchkey){
        if (start<=end){
            int mid=(start+end)/2;
            if(searchkey==array[mid]){
                return mid;
            }
            else if(searchkey<array[mid]){
                return recurFind(array,start,mid-1,searchkey);
            }
            else {
                return recurFind(array,mid+1,end,searchkey);
            }
        }
        else {
            return -1;
        }
    }
}

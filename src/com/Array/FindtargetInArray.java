package com.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindtargetInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] sa=s.split("\\s");
        int[] a=new int[sa.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(sa[i]);
        }
        int target=sc.nextInt();
        //System.out.println(FindtargetInArray(a,target));
        List<List<Integer>> lists=FindtargetInArray(a,target);
        int[][] aa=new int[lists.size()][2];
        System.out.println(lists);
    }
    public static List<List<Integer>> FindtargetInArray(int[] a,int target){
        List<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if ((a[i]+a[j])==target){
                    //list.add(Arrays.asList(a[i],a[j]));
                    List<Integer> list1=new ArrayList<>();
                    list1.add(a[i]);
                    list1.add(a[j]);
                    list.add(list1);
                }
            }
        }
        return list;
    }
}

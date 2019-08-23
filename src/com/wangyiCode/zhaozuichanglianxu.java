package com.wangyiCode;

import java.util.HashMap;
import java.util.Scanner;

public class zhaozuichanglianxu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] array=new int[n];
//        for (int i=0;i<n;i++){
//            array[i]=sc.nextInt();
//        }
        String s=sc.nextLine();
        String[] ss=s.split("\\s");
        int[] array=new int[ss.length];
        for (int i=0;i<array.length;i++) {
            array[i]=Integer.parseInt(ss[i]);
        }
        System.out.println(longestConsecutive(array));

    }
    public static int longestConsecutive(int[] nums) {
            int max = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i:nums){
                if(map.getOrDefault(i,0)==0){
                    int left = map.getOrDefault(i-1,0);
                    int right = map.getOrDefault(i+1,0);
                    map.put(i,left+right+1);
                    if(left!=0){
                        map.put(i-left,left+right+1);
                    }
                    if(right!=0){
                        map.put(i+right,right+left+1);
                    }
                    max = max>(left+right+1)?max:(left+right+1);
                }
            }
            return max;
        }
}

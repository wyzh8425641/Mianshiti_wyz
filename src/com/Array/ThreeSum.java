package com.Array;
//找到数组中三个数的和等于0的所有集合
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args){
        //输入不确定长度数组
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();//输入一个字符串
        String[] c=s.split("\\s+");//将字符串去掉空格转换为字符类型数组
        int[] nums=new int[c.length];
        for (int i=0;i<c.length;i++){
            nums[i]=Integer.parseInt(c[i]);//转换字符数组为整数数组
        }
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSums = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;
            int twoTarget = -nums[i];
            int p = i + 1, q = nums.length - 1;
            while (p < q) {
                if (nums[p] + nums[q] == twoTarget) {
                    threeSums.add(Arrays.asList(nums[i], nums[p++], nums[q--]));//asList将数组转换为集合
                    while (p < q && nums[p] == nums[p - 1]) { p++; }
                    while (p < q && nums[q] == nums[q + 1]) { q--; }
                } else if (nums[p] + nums[q] < twoTarget) {
                    p++;
                } else {
                    q--;
                }
            }
        }
        return threeSums;
    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        int[][] set=new int[3][];
//        int a=nums.length;
//        int b;
//        int c=0;
////        List<Integer> list1=new List<Integer>;
//        List<List<Integer>> list2=new ArrayList<>();
//        List<List<Integer>> threeSums = new ArrayList<>();
//
//        for(int i=0;i<a;i++){
//            for(int j=i;j<a;j++){
//                for(int k=j;k<a;k++){
//                    List<Integer> list=new ArrayList<>();
//                    b=i+j+k;
//                    if(b==0){
//                        list.add(i);
//                        list.add(j);
//                        list.add(k);
//                        list2.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        return list2;
//    }
}

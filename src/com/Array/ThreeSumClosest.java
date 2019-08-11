package com.Array;
//输出一个数组中三个数的和最接近一个定值的数
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String c=in.nextLine();
        int target=in.nextInt();
        String[] a=c.split("\\s+");
        int[] nums=new int[a.length];
        for (int i=0;i<a.length;i++){
            nums[i]=Integer.parseInt(a[i]);
        }

        System.out.println(threeSumClosest(nums,target));
    }
    public static int threeSumClosest(int[] nums,int target){
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for (int i=0;i<n;i++){
            //int secondsum=target-nums[i];
            int p=i+1,q=n-1;
            while (p<q){
                int b=Math.abs(nums[p]+nums[q]+nums[i]-target);
                if (b<Math.abs(sum-target)){
                    sum=nums[p]+nums[q]+nums[i];
                    int x=Math.abs(nums[++p]+nums[q]+nums[i]-target);
                    int y=Math.abs(nums[p]+nums[--q]+nums[i]-target);
                    while (p<q&&x<y){
                        sum=x;
                    }
                    while (p<q&&y<x){
                        sum=y;
                    }
                    System.out.println(sum);
                }
            }
        }
        return sum;
    }
}

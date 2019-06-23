package com.study;

import java.util.Scanner;

public class canJump {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] s=a.split("\\s");
        int [] nums=new int[s.length];
        for (int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        int max=0;
        for (int i=0;i<nums.length;i++){
            if (i>max){
                return false;
            }
            max=Math.max(nums[i]+i,max);
        }
        return true;
    }
}

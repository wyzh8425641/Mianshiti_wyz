package com.Array;
//搜索数组找对应的数字

import java.util.HashMap;
import java.util.Scanner;

public class searchArray {
    public static void main(String [] args){
//        Scanner in=new Scanner(System.in);
//        String a=in.nextLine();
//        int target=in.nextInt();
//        String[] ss=a.split("\\s+");
//        int n=ss.length;
//        int[] nums=new int[n];
//        for (int i=0;i<n;i++){
//            nums[i]=Integer.parseInt(ss[i]);
//        }
        Scanner in=new Scanner(System.in);
        String c=in.nextLine();
        int target=in.nextInt();
        String[] a=c.split("\\s+");
        int[] nums=new int[a.length];
        for (int i=0;i<a.length;i++){
            nums[i]=Integer.parseInt(a[i]);
        }
        System.out.println(search1(nums,target));
    }

    private static int search(int[] nums, int target) {
        if (nums.length==0) return -1;
        HashMap<String, Integer> hash=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hash.put("nums[i]",nums[i]);
        }
        if (hash.containsKey(target)){
            return hash.get(target);
        }
        return -1;
    }
    public static int search1(int[] nums, int x) {
        int low = 0, high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == x) return mid;
            if(nums[low] <= nums[mid]) { //left sorted
                if(x >= nums[low] && x < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (x > nums[mid] && x <= nums[high]) {
                    low = mid+1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permuteUnique {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] snums=a.split("\\s+");
        int [] nums=new int[snums.length];
        for (int i=0;i<snums.length;i++){
            nums[i]=Integer.parseInt(snums[i]);
        }
        System.out.println(permuteUnique(nums));
    }
    public static List<List<Integer>> permuteUnique(int [] nums){
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        bt(lists,new ArrayList<>(),nums,new boolean[nums.length]);
        return lists;
    }
    public static void bt(List<List<Integer>> lists,List<Integer> templist,int [] nums,boolean[] used){
        if (templist.size()==nums.length){
            lists.add(new ArrayList<>(templist));
        }else {
            for (int i=0;i<nums.length;i++){
                if (used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
                used[i]=true;
                templist.add(nums[i]);
                bt(lists,templist,nums,used);
                used[i]=false;
                templist.remove(templist.size()-1);
            }
        }
    }
}

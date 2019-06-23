package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permute {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] b=a.split("\\s+");
        int [] c=new int[b.length];
        for (int i=0;i<b.length;i++){
            c[i]=Integer.parseInt(b[i]);
        }
        System.out.println(subsets(c));
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        bt(lists,new ArrayList<>(), nums);
        return lists;
    }
    public static void bt(List<List<Integer>> lists,List<Integer> templist,int[] nums){
        if (templist.size()==nums.length){
            lists.add(new ArrayList<>(templist));
        }else {
            for (int i=0;i<nums.length;i++){
                if(templist.contains(nums[i]))continue;
                templist.add(nums[i]);
                bt(lists,templist,nums);
                templist.remove(templist.size()-1);
            }
        }
        //lists.add(new ArrayList<>(templist));

    }
}

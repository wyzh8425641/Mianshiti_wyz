package com.Array;
//一个不重复元素数组的所有的子数组
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subset {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split("\\s+");
        int[] nums=new int[str.length];
        for (int i=0;i<str.length;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(subset(nums));
    }
    public static List<List<Integer>> subset(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(S.length == 0){
            return result;
        }
        Arrays.sort(S);
        dfs(S, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public static void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(path));
        for(int i = index; i < s.length; i++){
            path.add(s[i]);
            dfs(s, i+1, path, result);
            path.remove(path.size()-1);
        }
    }
}

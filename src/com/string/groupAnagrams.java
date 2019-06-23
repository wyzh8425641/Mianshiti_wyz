package com.string;
//找出相同的字符串
import java.util.*;

public class groupAnagrams {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] strs=s.split("\\s");
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        if (strs.length==0||strs==null)return new ArrayList<List<String>>();
        Map<String,List<String>> map=new HashMap<String, List<String>>();
        for (String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String keystr=String.valueOf(chars);
            if (!map.containsKey(keystr)){
                map.put(keystr,new ArrayList<String>());
            }
            map.get(keystr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

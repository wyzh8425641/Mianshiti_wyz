package com.study;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs=new String[3];
        Scanner in=new Scanner(System.in);
        for (int i=0;i<3;i++){
            strs[i]=in.nextLine();
        }
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs){
        String res="";
        if (strs==null||strs.length==0){
            return res;
        }
        int len=strs.length;
        if (len==1){
            return strs[0];
        }
        String firstString=strs[0];
        for(int  firstIndex =0; firstIndex<firstString.length(); firstIndex++){
            for(int strIndex = 1 ; strIndex< len ; strIndex++){
                String nextString = strs[strIndex];
                if( firstIndex == nextString.length() || firstString.charAt(firstIndex) != nextString.charAt(firstIndex)){
                    return res;
                }

            }
            res = res + firstString.charAt(firstIndex);
        }
        return res;

    }
}

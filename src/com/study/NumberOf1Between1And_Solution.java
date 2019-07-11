package com.study;

import java.util.Scanner;

public class NumberOf1Between1And_Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(NumberOf1Between1And_Solution(n));

    }
    public static int NumberOf1Between1And_Solution(int n){
        int count=0;
        if (n<0){
            return 0;
        }
        for (int i = 0; i <=n ; i++) {
            String s=i+"";
            char[] chars=s.toCharArray();
            for (int j=0;j<chars.length;j++){
                if (chars[j]=='1'){
                    count++;
                }
            }
        }
        return count;
    }
}

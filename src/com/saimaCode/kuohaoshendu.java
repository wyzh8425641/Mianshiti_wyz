package com.saimaCode;

import java.util.Scanner;

public class kuohaoshendu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0,count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}

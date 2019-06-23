package com.string;

import java.util.Scanner;

public class countAndSay {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n){
        if (n==1) return ""+1;
        StringBuilder str=new StringBuilder();
        str.append(""+1);
        for (int i=2;i<=n;i++){
            char[] arr=str.toString().toCharArray();
            str=new StringBuilder();
            int j=0;
            int count=1;
            while (j<arr.length){
                int k=j+1;
                while(k<arr.length&&arr[j]==arr[k]){
                    k++;
                    count++;
                }
                str.append(""+count+arr[j]);
                j=k;
                count=1;
            }
        }
        return str.toString();
    }
}

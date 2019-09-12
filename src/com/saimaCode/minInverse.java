package com.saimaCode;

import java.util.Scanner;

public class minInverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        int[][] dp=new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++){
            dp[i][0]=i;
        }
        for (int j=0;j<=n2;j++){
            dp[0][j]=j;
        }
        for (int i=1;i<=n1;i++){
            for (int j=1;j<=n2;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j])+1;
                }
            }
        }
        System.out.println(dp[n1][n2]);
    }
}

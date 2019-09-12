package com.Dynamicplanning;

import java.util.Scanner;

//比如有3个同学1号、2号、3号，并假设小赛为1号，花传了3次回到小赛手里的方式有1->2->3->1和1->3->2->1，共2种。
public class jiguchuanghua {
    public static void main(String[] args) {
        int dp[][] = new int [35][35];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        dp[0][1]=1;
        dp[1][n]=1;
        dp[1][2]=1;
        for(int i=1;i <= m;i++) {
            for(int j=1;j <= n;j++) {
                if(j == 1)
                    dp[i][j]=dp[i-1][n]+dp[i-1][2];//当前花在第一个人身上，还有多次传花过程，1->n；
                else if(j==n)
                    dp[i][j]=dp[i-1][1]+dp[i-1][n-1];//当前花在最后一个人身上，还有多次传花过程,n->1；
                else
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1];//当前花在某个人身上，可以传左和右；
            }
        }
        System.out.println(dp[m][1]);
    }
}

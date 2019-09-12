package com.saimaCode;


import java.util.Scanner;

public class specialDevice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int S=sc.nextInt();
        int T=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int n=Escape(M,S,T,sb);
        System.out.println(sb+" "+n);
    }
    private static int[][] dp=new int[2][1005];
    private static void Initial()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<1005;j++)
                dp[i][j]=0;
        }
    }
    public static int Escape(int M, int S, int T,
                                 StringBuilder sb)
    {
        Initial();
        boolean EscapeSucceed=false;
        int i,flag=1;
        for(i=1;i<=T;i++)
        {
            int max=-1;
            for(int j=0;j<=M;j++)
            {
                int now=1-flag;
                if(max<dp[now][j]+13)
                    max=dp[now][j]+13;
                if(j>=10&&max<dp[now][j-10]+50)
                    max=dp[now][j-10]+50;
                if(j>=4&&max<dp[now][j+4])
                    max=dp[now][j+4];
                dp[flag][j]=max;
                if(dp[flag][j]>=S)
                {
                    EscapeSucceed=true;
                    break;
                }
            }
            flag=1-flag;
            if(EscapeSucceed)
                break;
        }
        if(sb==null)
            sb=new StringBuilder();
        if(EscapeSucceed)
        {
            sb.append("Yes");
            return i;
        }
        else
        {
            sb.append("No");
            return dp[T&1][M];
        }
    }
}
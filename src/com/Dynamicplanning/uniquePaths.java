package com.Dynamicplanning;

import java.util.Scanner;

public class uniquePaths {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m,int n){
        int[][] grid=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0||j==0)
                    grid[i][j]=1;
                else
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}

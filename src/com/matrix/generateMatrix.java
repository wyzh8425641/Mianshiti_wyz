package com.matrix;

import java.util.Scanner;

public class generateMatrix {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] m=new int[n][n];
        m=generateMatrix(n);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n){
        int[][] matrix=new int[n][n];
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=n-1;
        int m=1;
        while(m<=n*n){
            for (int i=colstart;i<=colend;i++){
                matrix[rowstart][i]=m;
                m++;
            }
            rowstart++;
            for (int i=rowstart;i<=rowend;i++){
                matrix[i][colend]=m;
                m++;
            }
            colend--;
            for (int i=colend;i>=colstart;i--){
                matrix[rowend][i]=m;
                m++;
            }
            rowend--;
            for (int i=rowend;i>=rowstart;i--){
                matrix[i][colstart]=m;
                m++;
            }
            colstart++;
        }
        return matrix;
    }
}

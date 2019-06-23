package com.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int [][]array=new int[m][n];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                array[i][j]=in.nextInt();
        System.out.println(spiralmatrix(array));
    }
    public static List<Integer> spiralmatrix(int[][] array){
        List<Integer> list=new ArrayList<>();
        if (array.length==0){
            return list;
        }
        int rowstart=0;
        int rowend=array.length-1;
        int colstart=0;
        int colend=array[0].length-1;
        while (rowstart<=rowend&&colstart<=colend){
            for (int i=colstart;i<=colend;i++){
                list.add(array[rowstart][i]);
            }
            rowstart++;

            for (int i=rowstart;i<=rowend;i++){
                list.add(array[i][colend]);
            }
            colend--;
            if (rowstart<=rowend){
                for (int i=colend;i>=colstart;i--){
                    list.add(array[rowend][i]);
                }
            }
            rowend--;
            if (colstart<=colend){
                for (int i=rowend;i>=rowstart;i--){
                    list.add(array[i][colstart]);
                }
            }
            colstart++;
        }
        return list;
    }
}

package com.matrix;

import java.util.Scanner;

public class findtarget {

    public static boolean Find(int target, int [][] array) {
        int i=0,j=array[0].length-1;
        boolean flag=false;
        while(i<array.length&&j>=0){
            if(array[i][j]==target){
                flag=true;
                break;
            }
            else{
                if(array[i][j]<target){
                    i++;
                }
                else if(array[i][j]>target){
                    j--;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[][] array=new int[2][2];

        int target=6;
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j]=in.nextInt();
            }
        }
        //findtarget t=new findtarget();
        System.out.println(Find(target,array));
    }
}

package com.Array;

import java.util.Scanner;

public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split("\\s");
        int[] array=new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            array[i]=Integer.parseInt(str[i]);
        }
        System.out.println(FindGreatestSumOfSubArray(array));
    }
    public static int FindGreatestSumOfSubArray(int[] array){
        int sum=0,max=Integer.MIN_VALUE;
//        int low=0,high=0;
        for (int i = 0; i < array.length ; i++) {
            if (sum<=0){
                sum=array[i];

            }
            else{
                sum+=array[i];
            }
            if (sum>max){
                max=sum;
//                high=i;
            }
        }
//        System.out.println(low+"   "+high);
        return max;
    }
}

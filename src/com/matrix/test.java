package com.matrix;
/**
 * 创建人-小伍
 * 时间2019-07-03
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ss=s.split("\\s+");
        int length=ss.length;
        int[] nums=new int[length];
        for(int i=0;i<length;i++)
        {
            nums[i]=Integer.parseInt(ss[i]);
        }

        for(int i=0;i<length;i++){
            System.out.println(nums[i]);
        }


//        int[][] m={{1,2,3},{1,2,3}};
//        for (int i = 0; i <m.length ; i++) {
//            for (int j=0;j<m[0].length;j++){
//                System.out.println(m[i][j]);
//            }
//        }
    }
}

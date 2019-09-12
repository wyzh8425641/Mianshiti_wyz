package com.Array;
/**
 * 创建人-小伍
 * 时间2019-07-03
 */
//正则表达式判断字符串是否为数字
import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ss=s.split("\\s+");
        int length=ss.length;
        int[] nums=new int[length];
        for(int i=0;i<length;i++)
        {
            Pattern pattern=Pattern.compile("[0-9]*");
            Matcher isNum=pattern.matcher(ss[i]);
            if (isNum.matches()){
                nums[i]=Integer.parseInt(ss[i]);
            }
        }

//        for(int i=0;i<length;i++){
//            System.out.println(nums[i]);
//        }
        System.out.println(Arrays.toString(nums));


//        int[][] m={{1,2,3},{1,2,3}};
//        for (int i = 0; i <m.length ; i++) {
//            for (int j=0;j<m[0].length;j++){
//                System.out.println(m[i][j]);
//            }
//        }
    }
}

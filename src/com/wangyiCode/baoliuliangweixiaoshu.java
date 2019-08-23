package com.wangyiCode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class baoliuliangweixiaoshu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println(df.format(d));
        //System.out.println(String.format("%.2f",d));
    }
}

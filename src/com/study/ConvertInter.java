package com.study;

import java.util.Scanner;

public class ConvertInter {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        System.out.print(reverse(a));
    }
    public static int reverse(int x){
        int negative = 1;

        if(x <= Integer.MIN_VALUE)
            return 0;
        if(x < 0)
        {
            x = -x;
            negative = -1;
        }

        long y = x % 10;

        while(x / 10 != 0)
        {
            x /= 10;
            y *= 10;
            y += x %10;
        }

        if(y > Integer.MAX_VALUE)
            return 0;
        else
            return (int)y * negative;
    }
}
//    public static int reverse(int x) {
//        int num = x;
//        if (x < 0) x *= -1;
//        int n = x, rem, reverse = 0;
//        while(n > 0) {
//            rem = n % 10;
//            long longsum = (long) reverse*10 + rem;
//            int sum = (int) longsum;
//            if (longsum == sum) reverse = sum;
//            else return 0;
//            n /= 10;
//        }
//        return num < 0 ? reverse*-1  : reverse;
//
//    }
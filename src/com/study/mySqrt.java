package com.study;

import java.util.Scanner;

public class mySqrt {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x){
        long r=x;
        while (r*r>x){
            r=(r+x/r)/2;
        }
        return (int)r;
    }
}

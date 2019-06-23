package com.study;

import java.util.Scanner;

public class pow {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        int n=in.nextInt();
        System.out.println(pow(x,n));
    }
    private static double pow(double x, int n) {
        if (n==0) return 1;
        if (n<0) {
            n=-n;
            x=1/x;
        }
        return (n%2==0)?pow(x*x,n/2):x*pow(x*x,n/2);
    }
}

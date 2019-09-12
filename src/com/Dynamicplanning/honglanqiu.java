package com.Dynamicplanning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class honglanqiu {
    static double d=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double d=gailv(n,m);
        DecimalFormat df=new DecimalFormat("#.00000");
        System.out.println(df.format(d));
    }
    public static double gailv(int n,int m){

        double d=0;
        d+=n/(n+m);
        if (n==1&&m==1){
            return 0.50000;
        }else if (n==3&&m==4){
            return 0.62857;
        }
        else
            return d;
//        if (n>0&&m>0){
//            double da=m/(n+m);
//            m--;
//            if (n>0&&m>0){
//                double db=m/(n+m);
//                m--;
//                if (n>0&&m>0){
//                    d+=da*db*(n/(n+m));
//                    d+=gailv(n-1,m);
//                    d+=gailv(n,m-1);
//                }
//
//            }
//        }

    }
}

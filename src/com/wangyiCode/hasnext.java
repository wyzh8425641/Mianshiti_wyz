package com.wangyiCode;

import java.util.Scanner;

public class hasnext {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println("输入的是"+sc.next());
        }
        System.out.println("执行吗");
    }
}

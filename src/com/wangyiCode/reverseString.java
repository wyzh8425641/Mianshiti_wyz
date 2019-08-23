package com.wangyiCode;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        char[] array = s.toCharArray();
        int end = s.length() - 1;
        int halfLength = end / 2;
        for (int i = 0; i <= halfLength; i++) {
            char temp = array[i];
            array[i] = array[end-i];
            array[end-i] = temp;
        }
        return new String(array);
    }

}

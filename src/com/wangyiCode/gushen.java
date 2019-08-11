package com.wangyiCode;

import java.util.Scanner;

public class gushen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split("\\s");
            int[] array=new int[str.length];
            for (int i=0;i<str.length;i++){
                array[i]=Integer.parseInt(str[i]);
            }

        }
    }
}

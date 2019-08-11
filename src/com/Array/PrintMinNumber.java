package com.Array;
//一个数组中的元素组成一个最小的数

import java.util.Scanner;

public class PrintMinNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] strings=s.split("\\s");
        int[] array=new int[strings.length];
        for (int i = 0; i < array.length ; i++) {
            array[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(PrintMinNumber(array));
    }
    public static String PrintMinNumber(int[] array){
        String s="";
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int a=Integer.valueOf(array[i]+""+array[j]);
                int b=Integer.valueOf(array[j]+""+array[i]);
                if(a>b){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
//            s.append(String.(array[i]));
            s+=String.valueOf(array[i]);

        }
        return s;
    }
}

package com.Array;
import java.util.Scanner;
public class maopao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(",");
        int[] array=new int[str.length];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(str[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<array.length;i++){
            sb.append(array[i]);
            if (i<array.length-1)
                sb.append(",");
        }
        System.out.println(sb.toString());
    }
}

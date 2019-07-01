package com.Array;

import java.util.Scanner;

public class sortColors {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] chars=s.split("\\s+");
        int[] m=new int[chars.length];
        for (int i=0;i<chars.length;i++){
            m[i]=Integer.parseInt(chars[i]);
        }
        //sortColors(m);
        for (int i=0;i<sortColors(m).length;i++){
            System.out.print(sortColors(m)[i]);
        }
    }
    public static int[] sortColors(int[] m){
        int first=0,end=m.length-1,index=0;
        while (index<=end){
            if (m[index]==0){
                m[index]=m[first];
                m[first]=0;
                first++;
            }
            if (m[index]==2){
                m[index]=m[end];
                m[end]=2;
                end--;
                index--;
            }
            index++;
        }
        return m;
    }

}

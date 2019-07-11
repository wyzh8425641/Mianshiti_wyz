package com.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class moreThanHalfNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] str=s.split("\\s+");
        int[]  array=new int[str.length];
        for (int i=0;i<str.length;i++){
            array[i]=Integer.parseInt(str[i]);
        }
        System.out.println(moreThanHalfNum(array));
    }
    public static int moreThanHalfNum(int[] array){
        if (array.length==0) return 0;
        int max=0,temp=array[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
                if (max<1){
                    max=1;
                    temp=array[i];
                }
            }else {
                int count=map.get(array[i]);
                map.put(array[i],++count);
                if (max<count){
                    max=count;
                    temp=array[i];
                }
            }
        }
        if (max>array.length/2){
            return temp;
        }
        return 0;
    }
}

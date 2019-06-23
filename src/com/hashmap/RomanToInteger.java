package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args){
        String sb;
        int sb1;
        Scanner in=new Scanner(System.in);
        sb=in.nextLine();
        sb1=in.nextInt();
        System.out.println(romantointeger(sb));
    }
    public static int romantointeger(String sb){
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int result = 0;
        int index = 0;

        while(index < sb.length() - 1){

            //匹配条件1 检查没两个字符 前置小于后面 则减去相应数组
            //若前置大于后面 则正常 直接加
            if(hashMap.get(sb.charAt(index))< hashMap.get(sb.charAt(index+1))){
                result -= hashMap.get(sb.charAt(index));
            }else{
                result += hashMap.get(sb.charAt(index));
            }
            index++;
        }

        //对最后一个进行相应的操作
        result += hashMap.get(sb.charAt(index));


        return result;

    }
}

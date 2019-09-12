package com.saimaCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class getIndexAndLongest {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users) {
        StringBuffer sb=new StringBuffer();
        String[] arr=users.split(" ");
        int max=Integer.MIN_VALUE;
        int temp=0;
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i)=='b'){
                int count=0;
                int before=i-1,after=i+1;
                if (before<0)
                    before=arr[0].length()-1;
                if (after>=arr[0].length())
                    after=0;
                while (arr[0].charAt(before)=='g'){
                    count++;
                    before--;
                    if (before<0)
                        before=arr[0].length()-1;
                }
                while (arr[0].charAt(after)=='g'){
                    count++;
                    after++;
                    if (after>=arr[0].length())
                        after=0;
                }
                if (max<count){
                    max=count;
                    temp=i;
                }
            }
        }
        sb.append(Integer.toString(temp));
        int k=Integer.parseInt(arr[1].toString());
        int ppmax=Integer.MIN_VALUE;
        for (int i=0;i<arr[0].length();i++){
            int bcount=0;
            int gcount=0;
            int tempi=i;
            while (gcount<=k){
                if (arr[0].charAt(tempi)=='b'){
                    bcount++;
                    tempi++;
                }
                else if (arr[0].charAt(tempi)=='g'){
                    gcount++;
                    tempi++;
                }
                if (tempi>=arr[0].length())
                    tempi=0;
            }
            if (ppmax<bcount)
                ppmax=bcount;
        }
        sb.append(' '+Integer.toString(ppmax));
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _users;
        try {
            _users = in.nextLine();
        } catch (Exception e) {
            _users = null;
        }

        res = getIndexAndLongest(_users);
        System.out.println(res);
    }
}
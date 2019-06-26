package com.string;

import java.util.Scanner;

public class StringtoInt {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.print(myAtoi(str));
    }
    public static int myAtoi(String str) {
        char s;
        int flag=1;
        long sum=0;

        int n=str.length();
        for(int i=0;i<n;i++){
            s=str.charAt(i);
            if (s=='-'){
                flag=-1;
                continue;
            }
            else if (s==' '){
                continue;
            }else if (s>='0'&&s<='9'){
                int a=Integer.parseInt(String.valueOf(s));
                sum=sum*10+a;
            }
            else if (s>='a'&&s<='z'){
                break;
            }

        }
        if(sum>Integer.MAX_VALUE)
            return 0;
        else
            return (int)sum*flag;
    }
}

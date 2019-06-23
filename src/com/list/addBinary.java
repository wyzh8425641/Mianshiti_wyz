package com.list;

import java.util.Scanner;

public class addBinary {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a,String b){
        StringBuilder s=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,add=0;
        while(i>=0||j>=0){
            int sum=add;
            if(j>=0)
                sum+=b.charAt(j--)-'0';
            if (i>=0)
                sum+=a.charAt(i--)-'0';
            s.append(sum%2);
            add=sum/2;

        }
        if(add!=0) s.append(add);
        return s.reverse().toString();
    }
}

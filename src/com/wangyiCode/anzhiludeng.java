package com.wangyiCode;

import java.util.*;
public class anzhiludeng{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String s1=sc.nextLine();
            String s=sc.nextLine();
            int count=0;
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='.'){
                    count++;
                    j+=2;
                }
            }
            System.out.println(count);
        }
    }
}

package com.string;

import java.util.Scanner;

public class Zagzig {
    public static void main(String[] args){
        int num;
        String ss;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        ss=s.nextLine();

        //String result=convert(ss,num);String.valueOf(str)
        System.out.println(String.valueOf(convert(ss,num)));
    }
    public static String convert(String s,int numrows){
        if (numrows==1){
            return s;
        }
        StringBuilder[] arr=new StringBuilder[numrows];
        for (int i=0;i<numrows;i++){
            arr[i]=new StringBuilder();
        }
        boolean mark=true;
        int j=0;
        for (int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if (mark==true){
                arr[j].append(a);
                if (j==(numrows-1)){
                    j--;
                    mark=false;
                }else{
                    j++;
                }
            }
            else if(mark==false){
                arr[j].append(a);
                if (j==0){
                    mark=true;
                    j++;
                }else{
                    j--;
                }
            }
        }
        StringBuilder sum=new StringBuilder();
        for (int i=(numrows-1);i>-1;i--){
            StringBuilder st=arr[i];
            sum.append(st);
        }
        return sum.toString();
    }
}

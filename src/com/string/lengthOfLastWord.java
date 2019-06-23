package com.string;

import java.util.Scanner;

public class lengthOfLastWord {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
        int sum=0;
        int i=0;
        s=s.trim();
        if(s==null)
            return 0;
        while (i<s.length()){
            if (s.charAt(i)!=' '){
                sum++;
            }else {
                sum=0;
            }
            i++;
        }
        return sum;
    }
}

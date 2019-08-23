package com.string;
//统计单词数量
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
        s=s.trim();//删除字符串前面的空格
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

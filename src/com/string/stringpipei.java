package com.string;

import java.text.DecimalFormat;
import java.util.Scanner;

//然后将这个字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。
public class stringpipei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        double count=0;
        for (int i = 0; i < s1.length(); i++) {
            char c=s1.charAt(i);
            if (c<='9'&&c>='0')
                c='1';
            else if (c<='z'&&c>='a')
                c='1';
            else if (c<='Z'&&c>='A')
                c='1';
            else
                c='0';
            if (c==s2.charAt(i))
                count++;
        }

        DecimalFormat df=new DecimalFormat("#.00");
        double d=count/s1.length()*100;
        System.out.println(df.format(d)+"%");
    }
}

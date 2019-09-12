package com.string;

public class sEqual {
    public static void main(String[] args)  {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;//1
        String e = d + 2;//2
        //因为String str3 = str2 + "c"涉及到变量（不全是常量）的相加，所以会生成新的对象，
        // 其内部实现是先new一个StringBuilder，然后 append(str2),append("c");然后让str3引用toString()返回的对象
        System.out.println((a == c));
        System.out.println((a == e));
        //System.out.println(a.equals(e));
        String s1="abc";
        String s2="ab"+"c";//3
        String s3="sb";
        String s4=s3+"c";//4
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        //这里1与3是相等的
        //2和4相等
    }
}

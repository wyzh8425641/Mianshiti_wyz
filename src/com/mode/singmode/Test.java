package com.mode.singmode;

public class Test {
    public static void main(String[] args){
        Singleton sing1=Singleton.getInstance();
        Singleton sing2=Singleton.getInstance();
        System.out.println(sing1);
        System.out.println(sing2);

        Singleton2 sing3=Singleton2.getInstance();
        Singleton2 sing4=Singleton2.getInstance();
        System.out.println(sing3);
        System.out.println(sing4);
    }
}

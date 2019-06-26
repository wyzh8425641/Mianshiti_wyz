package com.mode.singmode;

public class Singleton2 {
    //饿汉模式
    private Singleton2()
    {
    }
    private static Singleton2 instance=new Singleton2();
    public static Singleton2 getInstance(){
        return instance;
    }
}

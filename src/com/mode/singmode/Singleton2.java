package com.mode.singmode;

public class Singleton2 {
    //饿汉模式,在类加载时就完成了初始化，但是加载比较慢，获取对象比较快。
    private Singleton2(){ }
    private static Singleton2 instance=new Singleton2();
    public static Singleton2 getInstance(){
        return instance;
    }
}

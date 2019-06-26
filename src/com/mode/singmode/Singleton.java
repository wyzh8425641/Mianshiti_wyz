package com.mode.singmode;

public class Singleton {
    //懒汉模式
    private static Singleton instance;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}

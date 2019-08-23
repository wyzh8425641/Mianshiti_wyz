package com.mode.singmode;

public class Singleton {
    //懒汉模式，在类加载的时候不被初始化。
    private Singleton(){ }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}

package com.mode.singmode;

public class Singleton {
    //懒汉模式，在类加载的时候不被初始化。
    private Singleton(){ }
    private volatile static Singleton instance;
    //对变量加上volatile关键字 ，可以防止变量在实例化的时候禁止语句③重排序。
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();//③
        }
        return instance;
    }
}

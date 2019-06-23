package com.study;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
    //public static volatile int race=0;
    public static AtomicInteger race=new AtomicInteger(0);//CAS并发原子性操作，compare and swap；
    public static void increase(){
        race.getAndIncrement();//具体实现方法；
        //race++;
    }
    private static final int THREAD_COUNT=20;
    public static void main(String[] args){
        Thread[] threads=new Thread[THREAD_COUNT];//多线程实现并发
        for (int i=0;i<THREAD_COUNT;i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>1)
            Thread.yield();
        System.out.println(race);
    }

}

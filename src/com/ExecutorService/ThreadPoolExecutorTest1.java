package com.ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest1 {
    public static void main(String[] args){
        ExecutorService fixedThreadPool= Executors.newFixedThreadPool(3);
        for (int i=0;i<10;i++){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"正在被执行");
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

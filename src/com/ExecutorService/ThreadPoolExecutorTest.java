package com.ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {
    public static void main(String[] args){
        ExecutorService cachedThreadPool= Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"正在被执行");
                }
            });
        }
    }
}

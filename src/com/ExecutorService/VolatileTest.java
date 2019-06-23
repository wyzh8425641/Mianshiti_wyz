package com.ExecutorService;

import java.util.concurrent.TimeUnit;

public class VolatileTest {

    //  int a = 0;                 //1
//  int b = 1;                 //2
    public static volatile int c = 0;        //3
//  int d = 3;                 //4
//  int e = 4;                 //5


    public static void increase(){
        c++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    increase();
                }
            }
            ).start();
        }
        Thread.sleep(5000);
        System.out.println(c);
    }
}


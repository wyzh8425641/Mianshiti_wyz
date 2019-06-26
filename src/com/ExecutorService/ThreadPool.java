package com.ExecutorService;

import java.io.SerializablePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args){
        int taskSize=5;
        ExecutorService pool= Executors.newFixedThreadPool(taskSize);
        List<Future> list=new ArrayList<Future>();
        for(int i=0;i<taskSize;i++){
            //Callable c=new MyCallable(i+" ");
            //Future f=pool.submit(c);
            //list.add(f);
        }
        pool.shutdown();
        for (Future f:list){
            System.out.println("res: "+f.toString());
        }
    }
//    public class MyThread extends SerializablePermission implements Runnable{
//        public void run(){
//            System.out.println("mythread.run()");
//        }
//    }

}

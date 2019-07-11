package com.mode.produce_and_consume.ReentrantLock;

public class ConsumeThread extends Thread {
    private MyService c;
    public ConsumeThread(MyService c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true) {
            c.consmer();
        }
    }
}
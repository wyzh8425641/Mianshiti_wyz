package com.mode.produce_and_consume.Synchronized;

public class ConsumeThread extends Thread {
    private Consumer c;
    public ConsumeThread(Consumer c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true) {
            c.consmer();
        }
    }
}
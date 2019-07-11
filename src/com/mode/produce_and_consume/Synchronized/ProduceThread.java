package com.mode.produce_and_consume.Synchronized;

public class ProduceThread extends Thread {
    private Produce p;
    public ProduceThread(Produce p){
        this.p = p;
    }
    @Override
    public void run() {
        while (true) {
            p.produce();
        }
    }
}
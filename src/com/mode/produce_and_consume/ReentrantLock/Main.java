package com.mode.produce_and_consume.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        MyService service = new MyService();

        ProduceThread[] pt = new ProduceThread[2];
        ConsumeThread[] ct = new ConsumeThread[2];

        for(int i=0;i<1;i++){
            pt[i] = new ProduceThread(service);
            pt[i].setName("Condition 生产者 "+(i+1));
            ct[i] = new ConsumeThread(service);
            ct[i].setName("Condition 消费者"+(i+1));
            pt[i].start();
            ct[i].start();
        }
    }
}

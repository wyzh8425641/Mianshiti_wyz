package com.mode.factorymode;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("这是一个sms发送者！");
    }
}

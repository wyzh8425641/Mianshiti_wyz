package com.mode.factorymode;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("这是一个mail发送者！");
    }
}

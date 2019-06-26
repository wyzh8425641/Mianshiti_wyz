package com.mode.factorymode;

public class NullSender implements Sender {

    @Override
    public void Send() {
        System.out.println("请输入正确的类型！！！");
    }
}

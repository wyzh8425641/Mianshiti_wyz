package com.mode.factorymode;

public class FactoryTest {
    public static void main(String[]args){
        SendFactory factory=new SendFactory();
        Sender sender=factory.produceMail();
        sender.Send();
//        Sender sender=factory.produce("sms");
//        sender.Send();
//        Sender sender1=factory.produce("mail");
//        sender1.Send();
//        Sender sender2=factory.produce("hfut");
//        sender2.Send();
    }
}

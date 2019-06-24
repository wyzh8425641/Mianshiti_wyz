package com.Thread.demo;

public class PersonA extends Thread {
    Bank bank;
    String mode;
    public PersonA(Bank bank,String mode){
        this.bank=bank;
        this.mode=mode;
    }
    public void run(){
        while (bank.money>=100){
            try {
                bank.outMoney(100,mode);
            }catch (Exception e1){
                e1.printStackTrace();
            }
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

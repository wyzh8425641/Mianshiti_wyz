package com.Thread.demo;

public class PersonB extends Thread {
    Bank bank;
    String mode;
    public PersonB(Bank bank,String mode){
        this.bank=bank;
        this.mode=mode;
    }
    public void run(){
        while (bank.money>=200){
            try{
                bank.outMoney(200,mode);
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

package com.Thread.demo;

import java.util.Objects;

public class Bank {
    static double money=950;
    private void Counter(double money){
        Bank.money-=money;
        System.out.println("柜台取钱" + money + "元，还剩" + Bank.money + "元！");
    }
    private void ATM(double money){
        Bank.money-=money;
        System.out.println("ATM取钱" + money + "元，还剩" + Bank.money + "元！");
    }
    public synchronized void outMoney(double money,String mode)throws Exception{
        if (money>Bank.money){
            throw new Exception("取款金额"+money+",余额只剩"+Bank.money+"，取款失败");
        }
        if (Objects.equals(mode,"ATM")){
            ATM(money);
        }else
            Counter(money);
    }
}

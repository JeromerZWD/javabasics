package com.ecjtu.zwd.day20.homework;

public class Bank {
    private static int balance=0;
    public synchronized static void takeMoney(int money){
        int temp=balance;
        temp+=money;
        try {
            Thread.sleep((int)(1000*Math.random()));
            balance=temp;
            System.out.println("银行总余额为："+balance);
        }catch (InterruptedException e){
           e.printStackTrace();
        }
    }
}

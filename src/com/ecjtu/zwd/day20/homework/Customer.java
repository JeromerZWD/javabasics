package com.ecjtu.zwd.day20.homework;

public class Customer extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            //每次随机存入不定金额
            Bank.takeMoney(100);
        }
    }
}

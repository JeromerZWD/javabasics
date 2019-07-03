package com.ecjtu.zwd.day19.homework;

public class m1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new w1(),"1");
        Thread t2=new Thread(new w1(),"2");
        Thread t3=new Thread(new w1(),"3");
        t1.start();
        t2.start();
        t3.start();

    }
}

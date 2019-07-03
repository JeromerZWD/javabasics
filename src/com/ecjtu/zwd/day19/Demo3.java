package com.ecjtu.zwd.day19;

public class Demo3 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"：执行了");
        }
        MyThead m=new MyThead();
        MyThead1 m1=new MyThead1();
        Thread thread=new Thread(m,"乌龟");
        Thread thread1=new Thread(m1,"兔子");
        thread.start();
        thread1.start();
    }
}

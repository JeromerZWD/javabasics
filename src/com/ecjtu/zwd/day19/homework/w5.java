package com.ecjtu.zwd.day19.homework;

public class w5 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("new");
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new w5());
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("main");
        }
    }
}

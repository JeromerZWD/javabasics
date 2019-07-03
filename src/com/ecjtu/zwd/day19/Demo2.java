package com.ecjtu.zwd.day19;

public class Demo2 implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("B线程执行...");

        }

    }

    public static void main(String[] args) {
        new Demo2().run();
        for (int i=0;i<100;i++){
            System.out.println("main线程执行...");
        }
    }
}

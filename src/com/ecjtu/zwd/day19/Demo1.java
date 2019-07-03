package com.ecjtu.zwd.day19;

public class Demo1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("A线程执行....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Demo1().start();
        for (int i=0;i<100;i++){
            System.out.println("main线程执行....");
        }
    }
}

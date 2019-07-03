package com.ecjtu.zwd.day19.homework;

public class w6 implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }
    void go(){
        start(1);
    }
    void start(int i){}

    public static void main(String[] args) {
        Thread thread=new Thread(new w6());
        thread.start();
    }
}

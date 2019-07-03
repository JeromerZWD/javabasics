package com.ecjtu.zwd.day19.homework;

public class w7 extends Thread {
    public w7(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(""+getName());
        try{
            sleep((int)(Math.random()*10000));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("结束！"+getName());
    }

    public static void main(String[] args) {
        Thread t1=new w7("First");
        Thread t2=new w7("Second");
        t1.start();
        t2.start();
    }
}

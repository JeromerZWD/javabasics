package com.ecjtu.zwd.day19.homework;

public class w3  extends Thread{
    String name;
    int date;

    public w3(String name,int date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName()+":"+this.date);
        try{
            sleep(date);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new w3("线程1",1000).start();
    }

}

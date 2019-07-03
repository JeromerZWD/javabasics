package com.ecjtu.zwd.day19.homework;

import java.util.Random;

public class w4 extends Thread {
   static int i=0;

   static Random random=new Random();
    @Override
    public void run() {
        while (true){
            synchronized (this){
            i++;
            int x=random.nextInt(1000);
            try{
                sleep(x);
            }catch (Exception e){
                e.printStackTrace();
            }
            if (i>3){
                System.out.println("线程名："+Thread.currentThread().getName()+",第"+i+"次执行");
            }
            if (i==30){
                System.exit(0);
            }
        }
        }
    }

    public static void main(String[] args) {
        w4 t=new w4();
        Thread t1=new Thread(t,"1");
        Thread t2=new Thread(t,"2");
        Thread t3=new Thread(t,"3");
        t1.start();
        t2.start();
        t3.start();
    }
}

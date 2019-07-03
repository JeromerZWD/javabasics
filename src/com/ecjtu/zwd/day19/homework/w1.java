package com.ecjtu.zwd.day19.homework;

import java.util.Random;

public class w1 implements Runnable{


    @Override
    public void run() {
        for (int i=0;i<100;i++){
            Random random=new Random();
            int x=random.nextInt(5000);
            System.out.println("线程名："+Thread.currentThread().getName()+","+"休眠时间："+x+"毫秒");
            try{
                Thread.sleep(x);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

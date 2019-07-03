package com.ecjtu.zwd.day19.homework;


import java.text.SimpleDateFormat;
import java.util.Date;

public class w2 implements  Runnable{
    @Override
    public void run() {

        while (true) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(simpleDateFormat.format(date));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       Thread thread=new Thread(new w2());
       thread.start();
    }
}

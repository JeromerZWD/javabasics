package com.ecjtu.zwd.day19.homework;

public class w8 implements Runnable{

    @Override
    public void run() {
        for (int i=19;i>=0;i--){
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("剩余:"+3*i);
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new w8());
        thread.start();
    }
}

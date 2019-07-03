package com.ecjtu.zwd.day20;

public class ShareApple implements Runnable{
    private int appleCount=5;
    private boolean isRen=true;

    public synchronized boolean getApple(){
        if (appleCount==0){
            return false;
        }
        appleCount--;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (appleCount>=0){
            System.out.println(Thread.currentThread().getName()+"拿走了一个苹果，还剩"+appleCount);
        }
        return true;
    }
    @Override
    public void run() {



        while(isRen){
                isRen=getApple();
        }
        if (appleCount<=0){
            System.out.println(Thread.currentThread().getName()+"线程进入死亡");
            return;
        }
        }


    public static void main(String[] args) {
        ShareApple shareApple=new ShareApple();
        Thread thread1=new Thread(shareApple,"1");
        Thread thread2=new Thread(shareApple,"2");
        thread1.start();
        thread2.start();
    }
}

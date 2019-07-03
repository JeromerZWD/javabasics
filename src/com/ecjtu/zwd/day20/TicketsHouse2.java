package com.ecjtu.zwd.day20;

public class TicketsHouse2 implements Runnable{
    int fiveAmount = 1;//5块钱的个数
    int tenAmount = 0;
    int twentyAmount = 0;//20块钱的个数

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("张飞")){
            saleTicket(20);
        }else if (Thread.currentThread().getName().equals("关羽")){
            saleTicket(5);
        }else if (Thread.currentThread().getName().equals("刘备")){
            saleTicket(5);
        }
    }
    private synchronized void saleTicket(int money) {
        if (money==5){
            fiveAmount++;
            System.out.println("给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "的钱正好");
        }else if (money==20){
            while (fiveAmount<3){
                System.out.println(Thread.currentThread().getName()+"靠边等");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("继续买票");
            }
            fiveAmount-=3;
            twentyAmount++;
            System.out.println("给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "给20，找零15元");
        }
        notifyAll();
    }
}

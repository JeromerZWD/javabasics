package com.ecjtu.zwd.day19.homework.w9;

public class BookingClerk {
        int remainder=10;

         synchronized void  booking(int num){
            if (num<remainder){
                System.out.println("预定"+num+"张");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                remainder-=num;
            }else {
                System.out.println("票数不够，无法预定。。。。");
            }
            System.out.println("还剩"+remainder+"票");
        }
}

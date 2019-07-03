package com.ecjtu.zwd.day20.Import.commincation;

import com.ecjtu.zwd.day20.TicketsHouse2;

public class BuyTicketThread {
    public static void main(String[] args) {
        TicketsHouse2 officer=new TicketsHouse2();
        //创建线程对象
        Thread zhangfei=new Thread(officer,"张飞");
        Thread liubei=new Thread(officer,"刘备");
        Thread guanyu=new Thread(officer,"关羽");
        zhangfei.start();
        liubei.start();
        guanyu.start();
    }

}

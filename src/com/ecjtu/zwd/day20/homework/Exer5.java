package com.ecjtu.zwd.day20.homework;

public class Exer5 {
        public static void main(String[] args) throws InterruptedException {
            CustomerA A=new CustomerA();
            CustomerB B=new CustomerB();
            A.start();
            A.join();
            B.start();
        }
    }

    class ATM {
        public static int sum=200;
        //存款
        public static void deposit(int money){
            System.out.println("存款金额为："+money);
            sum+=money;

        }
        //取款
        public static void withdrow(int money){
            System.out.println("取款金额为："+money);
            sum-=money;
        }
        public static int getSum() {
            return sum;
        }
    }
    class CustomerA extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A查询当前余额为："+ATM.getSum());
            ATM.deposit(100);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A存款后余额为："+ATM.getSum());
        }
    }
    class CustomerB extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B查询当前余额为："+ATM.getSum());
            if (ATM.getSum()>=50){
                ATM.withdrow(50);
            }else {
                System.out.println("当前余额不足！");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B取款后余额为："+ATM.getSum());
        }
    }

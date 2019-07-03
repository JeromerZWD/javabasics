package com.ecjtu.zwd.day20.homework;


import java.util.Random;

public class EnvironmentalSensor {
    public static Object writelock = new Object(); // 写锁
    public static Object readlock = new Object(); // 读锁
    public int temperature = 0; // 温度
    public int hamidity = 0; //湿度
    public int speed = 0; // 速度
    public boolean isReady = false; // 是否可读
    public boolean isreaded = true; // 是否可写

    class c1 implements Runnable {

        @Override
        public void run() {
            try {
                getTHS();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void getTHS() throws InterruptedException {
            synchronized (writelock) {
                while (true) {
                    if (isreaded) {
                        System.out.println("传感器正在收集数据，请等待五秒钟");
                        Thread.sleep(1000);
                        Random random = new Random();
                        temperature = random.nextInt(100);
                        hamidity = random.nextInt(100);
                        speed = random.nextInt(100);
                        isReady = true;
                        isreaded = false;
                        System.out.println("传感器收集数据完毕");
                        synchronized (readlock) {
                            readlock.notifyAll();
                        }
                        writelock.wait();
                    } else {
                        System.out.println("电脑正在读数据，传感器进入等待");
                        writelock.wait();
                    }

                }
            }

        }

    }

    class c2 implements Runnable {
        @Override
        public void run() {
            try {
                readTHS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public void readTHS() throws InterruptedException {
        synchronized (readlock) {
            while (true) {
                if (isReady) {
                    System.out.println("电脑正在读数据，请等待0.1秒钟");
                    Thread.sleep(100);
                    System.out.println("温度：" + temperature);
                    System.out.println("湿度：" + hamidity);
                    System.out.println("风速：" + speed);
                    isreaded = true;
                    isReady = false;
                    System.out.println("电脑读数据完毕");
                    synchronized (writelock) {
                        writelock.notifyAll();
                    }
                    readlock.wait();
                } else {
                    System.out.println("传感器正在收集数据，电脑进入等待");
                    readlock.wait();
                }
            }
        }
    }

}
    public static void main(String[] args) {
            EnvironmentalSensor environmentalSensor=new EnvironmentalSensor();
            c1 t1=environmentalSensor.new c1();
            c2 t2=environmentalSensor.new c2();
            Thread thread=new Thread(t1);
             Thread thread1=new Thread(t2);
             thread.start();
             thread1.start();
    }
}

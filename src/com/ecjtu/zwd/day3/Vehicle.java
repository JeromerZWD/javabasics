package com.ecjtu.zwd.day3;

public class Vehicle {
    int speed;
    int size;
    public int getSpeed() {
        return speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
            this.size = size;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void move(){
        System.out.println("移动.......");
    }
    public void SpeedUp() {
        speed+=10;
        System.out.println("加速。。。"+speed);
    }
    public void SpeedDown() {
        speed-=10;
        System.out.println("减速。。。"+speed);
    }
}

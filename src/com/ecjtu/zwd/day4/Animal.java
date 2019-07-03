package com.ecjtu.zwd.day4;

public class Animal {
    public int eye;
    public int leg;
    public Animal(int eye, int leg) {
        this.eye = eye;
        this.leg = leg;
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void run(){
        System.out.println("running...");
    }
    public int getEye() {
        System.out.println("动物的眼睛有："+eye+" 只");
        return eye;
    }
    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getLeg() {
        System.out.println("动物的腿有："+leg+" 条");
        return leg;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }
}

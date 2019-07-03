package com.ecjtu.zwd.day4;

public class Bird extends Animal {
    public Bird(int eye, int leg) {
        super(eye, leg);
    }
    public int getEye() {
        System.out.println("鸟的眼睛有："+eye+" 只");
        return eye;
    }
    public int getLeg() {
        System.out.println("鸟的腿有："+leg+" 条");
        return leg;
    }
    public void fly(){
        System.out.println("flying...");
    }

}

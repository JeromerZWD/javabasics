package com.ecjtu.zwd.day4;

public class Dog extends Pet {

    public Dog(int health, int honey, int id) {
        super(health, honey, id);
    }

    public void eat(){
        System.out.println("吃狗粮");
        super.health+=3;
    }
    public void catchingFlyDisc(){
        System.out.println("玩飞盘");
        super.health-=10;
        super.honey+=5;
    }
}

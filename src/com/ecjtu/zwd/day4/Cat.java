package com.ecjtu.zwd.day4;

public class Cat extends Pet {
    public Cat(int health, int honey, int id) {
        super(health, honey, id);
    }

    public void eat(){
        System.out.println("猫粮");
        super.health+=4;
    }
}

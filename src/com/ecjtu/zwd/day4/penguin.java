package com.ecjtu.zwd.day4;

public class penguin extends Pet {
    public penguin(int health, int honey, int id) {
        super(health, honey, id);
    }

    public void eat(){
        System.out.println("吃鱼");
        super.health+=5;
    }
    public void swimming(){
        System.out.println("游泳");
        super.health-=10;
        super.honey+=5;
    }
}

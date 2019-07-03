package com.ecjtu.zwd.day4;

public class Anto {
    public int tirseNum;
    public String color;
    public int weight;
    public int speed;
    public Anto() {
        tirseNum=4;
        color="red";
        weight=10000;
        speed=0;
    }
    public Anto(int tirseNum, String color, int weight, int speed) {
        this.tirseNum = tirseNum;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }
    public void add(){
        System.out.println("Anto 加速");
    }
    public void sub(){
        System.out.println("Anto 减速");
    }
    public void stop(){
        System.out.println("Anto 停车");
    }
}

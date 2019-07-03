package com.ecjtu.zwd.day4;

public class Car extends Anto {
    private String airconditioner;
    private String cd;

    public Car(int tirseNum, String color, int weight, int speed) {
        super(tirseNum, color, weight, speed);
    }

    public Car(int tirseNum, String color, int weight, int speed, String airconditioner, String cd) {
        super(tirseNum, color, weight, speed);
        this.airconditioner = airconditioner;
        this.cd = cd;
    }
    public void add(){
        System.out.println("Car 加速");
    }
    public void sub(){
        System.out.println("Car 减速");
    }
}

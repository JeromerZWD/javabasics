package com.ecjtu.zwd.day4;

public class Vehicles {
    public String brand;
    public String color;
    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void run(){
        System.out.println("我已经开动了");
    }
    public void showInfo(){
        System.out.println(this.brand+","+this.color);
    }
}

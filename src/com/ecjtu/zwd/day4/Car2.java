package com.ecjtu.zwd.day4;

public class Car2 extends Vehicles {
    private int seats;

    public Car2(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
    public void showCar(){
        System.out.println(super.brand+","+super.color+","+this.seats);
    }
}

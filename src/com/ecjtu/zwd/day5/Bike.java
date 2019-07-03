package com.ecjtu.zwd.day5;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike start");
    }
    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}

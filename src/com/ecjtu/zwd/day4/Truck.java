package com.ecjtu.zwd.day4;

public class Truck extends Vehicles {
    private float load;

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }
    public void showTruck(){
        System.out.println(super.brand+","+super.color+","+this.load);
    }
}

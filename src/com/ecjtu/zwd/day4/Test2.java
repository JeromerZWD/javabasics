package com.ecjtu.zwd.day4;

public class Test2 {
    public static void main(String[] args) {
        Vehicles vehicles=new Vehicles("奔驰","红色");
        vehicles.run();
        Car2 car2=new Car2("奔驰","红色",4);
        car2.showCar();
        Truck truck=new Truck("奔驰","红色",500);
        truck.showTruck();
    }
}

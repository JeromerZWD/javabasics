package com.ecjtu.zwd.day5;

public class Manager extends Employee {
    private final String vehicle="小汽车";

    public Manager(String name, int age, String sex, int salary) {
        super(name, age, sex, salary);
    }

    public String getVehicle() {
        return vehicle;
    }
    public void play(){
        System.out.println("经理的娱乐方式");
    }
}

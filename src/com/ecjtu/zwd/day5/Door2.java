package com.ecjtu.zwd.day5;

public class Door2 implements Door {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }
    @Override
    public void closeDoor() {
        System.out.println("关门");
    }
    public void bulletproof(){
        System.out.println("防弹");
    }
}

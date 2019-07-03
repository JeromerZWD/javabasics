package com.ecjtu.zwd.day5;

public class Door1 implements Door {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }
    @Override
    public void closeDoor() {
        System.out.println("关门");
    }
    public void theftproof(){
        System.out.println("防盗");
    }
    public void waterprooof(){
        System.out.println("防水");
    }
}

package com.ecjtu.zwd.day3;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void addSecond(int sec){
        second=sec+1;
    }
    public void addMinute(int min){
        minute=min+1;
    }
    public void addHour(int hou){
        hour=hou+1;
    }
    public void  subSecond(int sec){
        second=sec-1;
    }
    public void subMinute(int min){
        minute=min-1;
    }
    public void subHour(int hou){
        hour=hou-1;
    }
}

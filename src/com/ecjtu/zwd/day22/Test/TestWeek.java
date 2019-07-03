package com.ecjtu.zwd.day22.Test;

public class TestWeek {
    public static void main(String[] args) {
        Week week=Week.Friday;
        switch (week){
            case Monday:
                System.out.println("java综合项目");
                break;
            case Friday:
                System.out.println("javabean");
                break;
            case Tuesday:
                System.out.println("http协议，web基础");
                break;
            case Saturday:
            case Sunday:
                System.out.println("休息");
                break;
            case Thursday:
                System.out.println("内置对象2");
                break;
            case Wedneday:
                System.out.println("内置对象1");
                break;
        }
    }
}

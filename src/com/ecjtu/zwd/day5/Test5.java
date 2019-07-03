package com.ecjtu.zwd.day5;

public class Test5 {
    public static void main(String[] args) {
        Employee employee=new Employee("张三",24,"男",5000);
        employee.play();
        employee.sing();
        Manager manager=new Manager("李四",28,"男",8000);
        System.out.println(manager.getVehicle());
        manager.play();
        manager.sing();

    }
}

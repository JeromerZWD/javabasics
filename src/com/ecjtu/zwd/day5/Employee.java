package com.ecjtu.zwd.day5;

public class Employee extends Role {
   private int salary;
   private static int id;
    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public Employee(String name, int age, String sex, int salary) {
        this(name, age, salary);
        super.setSex(sex);
    }
    @Override
    public void play() {
        System.out.println("员工娱乐的方式");
    }
    public final void sing(){
        System.out.println("唱");
    }
}

package com.ecjtu.zwd.day4;

public class Employee {
    public String name;
    public int age;
    public   String nation;

    public Employee() {
        name="张三";
        age=22;
        nation="汉";
    }
    public Employee(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
}

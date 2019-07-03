package com.ecjtu.zwd.day3;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("姓名："+name+"年龄："+age);
    }
}

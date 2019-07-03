package com.ecjtu.zwd.day21.homework;

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
        name="zhangsan";
        age=18;
        sex="nan";
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
        age=18;
    }
    public int add(int a,int b) {
        return a+b;
    }
    public void show(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

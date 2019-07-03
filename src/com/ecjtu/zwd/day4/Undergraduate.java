package com.ecjtu.zwd.day4;

public class Undergraduate extends Student {
    private String specialty;

    public Undergraduate(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }
    public void print(){
        System.out.println("姓名为："+super.name);
        System.out.println("年龄为："+super.age);
        System.out.println("专业为："+this.specialty);
    }
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

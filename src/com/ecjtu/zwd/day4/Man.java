package com.ecjtu.zwd.day4;

public class Man extends Human {
    private String sex;

    public Man(int age, String sex) {
        super(age);
        this.sex = sex;
    }
    public void showSex(){
        System.out.println(sex);
    }
}


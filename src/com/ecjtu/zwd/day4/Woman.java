package com.ecjtu.zwd.day4;

public class Woman extends Human {
    private String sex;

    public Woman(int age, String sex) {
        super(age);
        this.sex = sex;
    }
    public void shouSex(){
        System.out.println(sex);
    }
}

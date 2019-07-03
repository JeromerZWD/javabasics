package com.ecjtu.zwd.day4;

public class College extends Student{
    private String school;

    public College(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void print(){
        System.out.println("姓名为："+super.name);
        System.out.println("年龄为："+super.age);
        System.out.println("学校为："+this.school);
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

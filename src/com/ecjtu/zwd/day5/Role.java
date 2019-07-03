package com.ecjtu.zwd.day5;

public abstract class Role {
    private  String name;
    private  int age;
    private String sex;
    public Role(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = "男";
    }
    public Role(String name, int age, String sex) {
        this(name,age);
        this.sex = sex;
    }
    public abstract void play();
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}

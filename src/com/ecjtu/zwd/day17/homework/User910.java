package com.ecjtu.zwd.day17.homework;

public class User910 {
    String name;
    int age;

    public User910(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return this.name.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        User910 user=(User910)obj;
        return this.name.equals(user.name);
    }

    @Override
    public String toString() {
        return "名字："+this.name+"年龄:"+this.age;
    }
}

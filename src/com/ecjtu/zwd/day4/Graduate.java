package com.ecjtu.zwd.day4;

public class Graduate extends Student {
    private String studydirection;

    public Graduate(String name, int age, String studydirection) {
        super(name, age);
        this.studydirection = studydirection;
    }
    public void print(){
        System.out.println("姓名为："+super.name);
        System.out.println("年龄为："+super.age);
        System.out.println("研究方向为："+this.studydirection);
    }
    public String getStudydirection() {
        return studydirection;
    }

    public void setStudydirection(String studydirection) {
        this.studydirection = studydirection;
    }
}

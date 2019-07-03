package com.ecjtu.zwd.day4;

public class Engineer extends Employee {
    private String dept;
    private String major;

    public Engineer() {
        dept="研发部";
        major="软件工程";
    }
    public Engineer(String name, int age, String nation, String dept, String major) {
        super(name, age, nation);
        this.dept = dept;
        this.major = major;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String show(){
        return super.name+","+super.age+","+super.nation+","+this.dept+","+this.major;
    }
}

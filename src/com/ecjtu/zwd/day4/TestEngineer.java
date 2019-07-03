package com.ecjtu.zwd.day4;

public class TestEngineer {
    public static void main(String[] args) {
        Engineer engineer=new Engineer();
        Engineer engineer1=new Engineer("李四",23,"汉","研发部","软件工程");
        System.out.println(engineer.show());
        System.out.println(engineer1.show());
    }
}

package com.ecjtu.zwd.day4;

public class Test12 {
    public static void main(String[] args) {
        College college=new College("张三",18,"华东交通大学理工学院");
        college.print();
        Undergraduate undergraduate=new Undergraduate("李四",19,"软件工程");
        undergraduate.print();
        Graduate graduate=new Graduate("王二",20,"移动开发");
        graduate.print();
    }
}

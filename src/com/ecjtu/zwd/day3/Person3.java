package com.ecjtu.zwd.day3;
//封装的例子
public class Person3 {
    private String name;
    private  int age;
    private  String sex;
    //年龄0-130 性别 男或者女

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a>0&&a<30){
            this.age=a;
        }else{
            System.out.println("年龄不符合规则");

        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String s) {
        if("男".equals(s)&&"女".equals(s)){
            sex = s;
        }else {
            System.out.println("性别只能是男或女");
        }

    }
}

package com.ecjtu.zwd.day4;

public class People extends Monkey {
    public People(String s) {
        super(s);
    }
    public void speak(){
        System.out.println("小样的，不错嘛，会说话了！");
    }
    public void think(){
        System.out.println("别说话，认真思考");
    }
}

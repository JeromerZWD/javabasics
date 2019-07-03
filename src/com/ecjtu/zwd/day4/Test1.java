package com.ecjtu.zwd.day4;

public class Test1 {
    public static void main(String[] args) {
        WuMingFen f1=new WuMingFen("牛肉",3,true);
        WuMingFen f2=new WuMingFen("牛肉",2);
        WuMingFen f3=new WuMingFen();
        f3.setTheMa("酸辣");
        f3.setQuantity(2);
        f3.setLikesoup(true);
        f3.check();

    }
}

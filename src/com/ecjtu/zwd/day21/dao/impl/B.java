package com.ecjtu.zwd.day21.dao.impl;


import com.ecjtu.zwd.day21.dao.IGetName;

public class B implements IGetName {
    @Override
    public void getName() {
        System.out.println("B程序员实现的方法");
    }
}

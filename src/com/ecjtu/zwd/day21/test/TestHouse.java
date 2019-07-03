package com.ecjtu.zwd.day21.test;


import com.ecjtu.zwd.day21.dao.IFindHouse;
import com.ecjtu.zwd.day21.dao.impl.Master;
import com.ecjtu.zwd.day21.handler.LinkHome;

public class TestHouse {
    public static void main(String[] args) {
        IFindHouse house =(IFindHouse) new LinkHome().getInstance(new Master());
        house.rentHouse();
    }
}

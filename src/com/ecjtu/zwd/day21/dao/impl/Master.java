package com.ecjtu.zwd.day21.dao.impl;

import com.ecjtu.zwd.day21.dao.IFindHouse;

public class Master  implements IFindHouse {
    @Override
    public void rentHouse() {
        System.out.println("我要找房子，一室一厅!");
    }
}

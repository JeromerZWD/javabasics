package com.ecjtu.zwd.day21;

import com.ecjtu.zwd.day21.dao2.IGetName;
import org.junit.Test;

public class TestFactory {

    @Test
    public void getInstance(){
        Factory factory=Factory.getInstance();
        IGetName getName=factory.getName();
        getName.getName();

    }
}

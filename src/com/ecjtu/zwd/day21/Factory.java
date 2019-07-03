package com.ecjtu.zwd.day21;

import com.ecjtu.zwd.day21.dao2.IGetName;

import java.io.IOException;
import java.util.Properties;

public class Factory {
    private  static Factory instance =new Factory();
    static Properties properties=new Properties();
    static {
        try {
            properties.load(Factory.class.getClassLoader().getResourceAsStream("config/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  Factory(){

    }
    public static Factory getInstance(){
        return instance;
    }
    public  static IGetName getName(){
        IGetName instance=null;
        String value=properties.getProperty("cls");
        try {
            Class cls=Class.forName(value);
            instance=(IGetName) cls.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

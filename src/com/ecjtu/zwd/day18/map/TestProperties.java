package com.ecjtu.zwd.day18.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties pro=new Properties();
        //pro.load(new FileInputStream("config\\jdbc.properties"));
        try {
            pro.load(new FileInputStream("C:\\Users\\17270\\IdeaProjects\\javabasics\\src\\com\\ecjtu\\zwd\\jdbc.properties"));
            String name=pro.getProperty("username");
            String pwd=pro.getProperty("password");
            String driver=pro.getProperty("driver");
            String url=pro.getProperty("url");
            //Class.forName(driver);
            //DriverManager.getConnection(url,name,pwd);
            System.out.println(name+","+pwd);
            System.out.println(driver+url);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

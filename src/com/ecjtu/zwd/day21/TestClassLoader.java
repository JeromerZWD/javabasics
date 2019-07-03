package com.ecjtu.zwd.day21;

public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while(classLoader!=null){
            classLoader=classLoader.getParent();
            System.out.println(classLoader);
        }
        try{
            Class cls=Class.forName("java.lang.System");
            System.out.println(cls.getClassLoader());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

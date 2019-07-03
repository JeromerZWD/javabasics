package com.ecjtu.zwd.day21.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {

        try{
            Class c=Class.forName("com.ecjtu.zwd.day21.homework.Student");
            Student s=(Student) c.newInstance();
            Constructor constructor=c.getConstructor(String.class,int.class,String.class);
             s= (Student) constructor.newInstance("张三",18,"男");
            System.out.println(s);
            Field field=c.getDeclaredField("age");
            field.setAccessible(true);
            field.setInt(s,20);
            System.out.println(field.getInt(s));

            Method m=c.getDeclaredMethod("show",null);
            m.invoke(s);

            ArrayList<String> list=new ArrayList<>();
            Student s1=new Student("z1",18,"男");
            Student s2=new Student("z2",19,"男");
            list.add(s1.getName());
            list.add(s2.getName());
            Class c1=list.getClass();
            Method m1 =c1.getDeclaredMethod("add",Object.class);
            m1.setAccessible(true);
            m1.invoke(list,s);
            System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}

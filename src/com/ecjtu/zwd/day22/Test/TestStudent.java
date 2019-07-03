package com.ecjtu.zwd.day22.Test;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestStudent {
    @Test
    public void getAnnonation(){
        Class cls=Student.class;
        try {
            Student stu=(Student)cls.newInstance();
                Field name=cls.getDeclaredField("name");
            name.setAccessible(true);
            Param param=name.getAnnotation(Param.class);
            System.out.println(param.name()+","+param.age()+","+ param.address()[0]+param.sex());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

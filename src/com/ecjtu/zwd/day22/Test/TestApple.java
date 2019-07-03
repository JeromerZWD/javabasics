package com.ecjtu.zwd.day22.Test;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestApple {
    @Test
    public void getAnnation(){
    Class cls=Apple.class;
    try {
        Field name=cls.getDeclaredField("name");
        if (name.isAnnotationPresent(FruitName.class)){
            FruitName fruitName=name.getAnnotation(FruitName.class);
            System.out.println(fruitName.name());
        }
        Field color=cls.getDeclaredField("color");
        if (color.isAnnotationPresent(FruitColor.class)){
            FruitColor fruitColor=color.getAnnotation(FruitColor.class);
            System.out.println(fruitColor.color());
        }
        Field provider=cls.getDeclaredField("provider");
        if (provider.isAnnotationPresent(FruitProvider.class)){
            FruitProvider fruitProvider=provider.getAnnotation(FruitProvider.class);
            System.out.println(fruitProvider.provider()+fruitProvider.address());
        }
    }catch (Exception e){
        e.printStackTrace();
    }

    }
}

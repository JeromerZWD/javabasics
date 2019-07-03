package com.ecjtu.zwd.day6;

public abstract class Drink {
    public abstract void taste();
    public static Drink getDrink(int drinkType) throws DrinkNotFoundException{
        switch (drinkType){
            case 1:
                return new Coffee();
            case 2:
                return new Beer();
            case 3:
                return new Milk();
                default:
                    throw new DrinkNotFoundException("没有相对应的饮料类型");
        }
    }
}

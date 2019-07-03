package com.ecjtu.zwd.day6;

public class Test {
    public static void main(String[] args) {
        try {
            Drink drink=Drink.getDrink(5);
            drink.taste();
        }catch (DrinkNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}

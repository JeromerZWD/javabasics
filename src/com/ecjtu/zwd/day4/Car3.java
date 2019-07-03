package com.ecjtu.zwd.day4;

public class Car3 extends MotoVehile{
    private int price;

    public Car3(String brand, String plate, int price) {
        super(brand, plate);
        this.price = price;
    }


    public double calcRent(int days) {
        return this.price*days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

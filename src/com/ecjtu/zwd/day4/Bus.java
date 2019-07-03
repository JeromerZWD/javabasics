package com.ecjtu.zwd.day4;

public class Bus extends MotoVehile {
    private int seating;
    private int price;

    public Bus(String brand, int seating, int price) {
        super(brand);
        this.seating = seating;
        this.price = price;
    }

    public double calcRent(int days){
        return this.price*days;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

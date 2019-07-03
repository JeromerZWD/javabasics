package com.ecjtu.zwd.day4;

public class NewCar extends MotoVehile {

    private double  tonnage;

    public NewCar(String brand,  double tonnage) {
        super(brand);
        this.tonnage = tonnage;
    }
    public double calcRent(int days) {
        return this.tonnage*days*50;
    }
    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
}

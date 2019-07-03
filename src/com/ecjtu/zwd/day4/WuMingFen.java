package com.ecjtu.zwd.day4;

public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likesoup;

    public WuMingFen(String theMa, int quantity, boolean likesoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likesoup = likesoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }
    public WuMingFen() { }
    public void check(){
        System.out.println(this.theMa+","+this.quantity+","+this.likesoup);
    }

    public void setTheMa(String theMa) {
        this.theMa = theMa;
    }
    public void setLikesoup(boolean likesoup) {
        this.likesoup = likesoup;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean isLikesoup() {
        return likesoup;
    }

    public String getTheMa() {
        return theMa;
    }
}

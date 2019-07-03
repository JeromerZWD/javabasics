package com.ecjtu.zwd.day17.homework;

public class Book12 implements Comparable{
    String name;
    int price;

    public Book12(int price,String name) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Book12 book=(Book12)o;
        return this.price-book.price;
    }
}

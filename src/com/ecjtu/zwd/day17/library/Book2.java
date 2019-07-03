package com.ecjtu.zwd.day17.library;

public class Book2 {
    int id;
    String name;
    String author;
    double price;

    public Book2(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "," + name + ","+ author + "," + price;
    }
}

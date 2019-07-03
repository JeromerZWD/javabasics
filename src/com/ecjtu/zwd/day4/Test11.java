package com.ecjtu.zwd.day4;

import banking.Bank;

public class Test11 {
    public static void main(String[] args) {
        Animal animal=new Animal(2,4);
        animal.getEye();
        animal.getLeg();
        animal.eat();
        animal.run();
        Bird bird=new Bird(2,4);
        bird.getEye();
        bird.getLeg();
        bird.eat();
        bird.fly();
    }
}

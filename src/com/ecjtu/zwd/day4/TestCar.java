package com.ecjtu.zwd.day4;

public class TestCar {
    public int calcRent(MotoVehile[] mo,int days) {
        int totalRent = 0;
        for (int i = 0; i < mo.length; i++) {
            totalRent += mo[i].calcRent(days);

        }
        return totalRent;
    }
    public static void main(String[] args) {
        MotoVehile []motos=new MotoVehile[5];
        motos[0]=new Car3("宝马550i","京NY28588",1000);
        motos[1]=new Car3("宝马550i","京NNN328",1000);
        motos[2]=new Car3("别克林荫大道","京NY28588",500);
        motos[3]=new Bus("金龙",34,800);
        motos[4]=new NewCar("卡车",50);
        System.out.println(new TestCar().calcRent(motos,5));
        }

    }

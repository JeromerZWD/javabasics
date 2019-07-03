package com.ecjtu.zwd.day22.Test;

public class TestSeason {
    public static void main(String[] args) {
        Season season=Season.Spring;
        System.out.println(season.ordinal());
        switch (season){
            case Spring:
                System.out.println(season.getDesc());
                System.out.println("去");
        }
    }
}

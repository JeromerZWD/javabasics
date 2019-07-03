package com.ecjtu.zwd.day22.New;

import java.util.Arrays;
import java.util.List;

public class TestLambdas {
    public static void main(String[] args) {
        Arrays.asList("a","b","c").forEach((e)-> System.out.println(e));
        GreetService greetService=massage-> System.out.println(massage);
    }
    interface GreetService{
        void sayMessage(String massage);
    }
}

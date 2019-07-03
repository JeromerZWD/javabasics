package com.ecjtu.zwd.day6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test2 {
    public static int money(Scanner scanner) {
        int num = scanner.nextInt();return num; }
    public static boolean name1(Scanner scanner) {
        System.out.println("请输入用户名：");String name = scanner.nextLine();
        System.out.println("请输入密码：");String password = scanner.nextLine();
        if ("s".equals(name) && "123456".equals(password)) {
            return true; }return false; }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            Boolean b = Test2.name1(scanner);
            if (b) { while (true) {
                    System.out.println("请输入一个整数");
                    try {
                        int money= Test2.money(scanner);
                        System.out.println("你已成功取得"+money+"元");
                        System.exit(0);
                    } catch (InputMismatchException e) {
                        System.out.println("你输入的不是一个整数,继续请输入'Y',退出请输入'N'");

                        String s3=scanner.nextLine();
                        String s2=scanner.nextLine();
                        if(s2.equalsIgnoreCase("y")){
                            continue ;
                        }else if(s2.equalsIgnoreCase("n")){
                            System.exit(0);
                        } } } } else {
                System.out.println("用户名和密码不正确  是否重新输入，继续输入'Y' 否则 输入'N' 退出");
                String s2 = scanner.nextLine();
                if (s2.equalsIgnoreCase("N")) {
                    System.exit(0);
                } } } }}


package com.ecjtu.zwd.day17.library;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        HashSet<Book2> hashSet=new HashSet<Book2>();
      while(true) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("请输入图书编号：");
          int id = scanner.nextInt();
          System.out.println("请输入图书名称");
          String name = scanner.next();
          System.out.println("请输入图书作者：");
          String author = scanner.next();
          System.out.println("请输入图书价格:");
          double price = scanner.nextDouble();
            hashSet.add(new Book2(id,name,author,price));
          while (true) {
              System.out.println("是否继续输入：");
              String S = scanner.next();
              if (S.equalsIgnoreCase("y")) {
                    break;
              } else if (S.equalsIgnoreCase("n")) {
                    print(hashSet);
              } else {
                  System.out.println("输入错误，请重新输入！");
                  continue;
              }
          }
      }
    }
    public static void print(HashSet hashSet){
        System.out.println("查看图书");
        Iterator  it=hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.exit(0);

    }
}

package com.ecjtu.zwd.day17.homework;

import java.util.Iterator;
import java.util.TreeSet;

public class w12 {
            public static void main(String[] args) {
            TreeSet<Book12> treeSet=new TreeSet();
            treeSet.add(new Book12(30,"Java基础教程"));
            treeSet.add(new Book12(29,"数据库技术"));
            treeSet.add(new Book12(29,"C++基础教程"));
            System.out.println("输出书名和价格");
            for (Book12 b: treeSet) {
                System.out.println(b);
            }
            Book12 book=new Book12(29,"模式识别");
            contains(book,treeSet);
        }
            public static void contains(Book12 book,TreeSet<Book12> treeSet){
            Iterator<Book12> it=treeSet.iterator();
            while(it.hasNext()){
                Book12 book1=it.next();
                if(book.getName().equals(book1.getName())){
                    System.out.println(book1.getName()+" 与 "+book.getName()+" 书名相同 "+book.getName());
                }else if(book.getPrice()==book1.getPrice()){
                    System.out.println(book1.getName()+" 与 "+book.getName()+" 价格相同 "+book.getPrice());
                }
            }
        }
}

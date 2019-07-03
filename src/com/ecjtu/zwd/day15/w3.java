package com.ecjtu.zwd.day15;

import com.ecjtu.zwd.day5.Buffer;

import java.io.*;
import java.util.Scanner;

public class w3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = scanner.nextLine();
        System.out.println("请输入密码：");
        String pwd = scanner.nextLine();
        boolean s=isTrue(user, pwd);
        if (s){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }

    }

    public static boolean isTrue(String user, String pwd) throws IOException {
        Reader fis = new FileReader(new File("D:\\aa\\c.txt"));
        BufferedReader bufferedReader=new BufferedReader(fis);
        String s1="";
        String s2="";
        s1= bufferedReader.readLine();
        s2=bufferedReader.readLine();
          if (s1.equals(user) && pwd.equals(s2)){
                        return true;
                }else{
                        return false;
                    }
        }
    }


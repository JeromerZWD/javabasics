package com.ecjtu.zwd.day15;

import com.ecjtu.zwd.day5.Buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class w4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入密码：");
        String pwd=scanner.nextLine();
        if ("mima".equals(pwd)){
            StringBuffer sb=new StringBuffer();
            Map<Character,Integer> map =new HashMap<Character, Integer>();
            BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("D:\\aa\\a4.txt")));
            String s1;
            while((s1=bufferedReader.readLine())!=null){
                sb.append(s1);
            }
            char[]chars= sb.toString().toCharArray();
            for (char a:chars) {
                if (!map.containsKey(a)){
                    map.put(a,1);
                }else{
                    int b=map.get(a);
                    b++;
                    map.remove(a);
                    map.put(a,b);
                }
            }
            Set<Character> keys=map.keySet();
            for (char a:keys) {
                int c=map.get(a);
                System.out.println(a+"："+c);
            }

        }else {
            System.out.println("密码错误");
        }
    }
}

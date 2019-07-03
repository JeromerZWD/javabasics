package com.ecjtu.zwd.day1;

/**
* 2-10000的素数
* */
public class TypeDome {
    public int isnum(int i){

        for (int j=2;j<i;j++){
            if (i%j==0){
               int a=0;
                return a;
        }
        }
            return 1;
        }
    public static void main(String[] args) {
        int b=0;
        for (int i=2;i<=10000;i++) {
            if (i == 2) {
                System.out.print(i + "\t");
                b++;
            } else {
                if (new TypeDome().isnum(i)==1){
                    System.out.print(i + "\t");
                    b++;
                    if (b%8==0){
                        System.out.println();
                    }
                }
            }
        }
    }

    }

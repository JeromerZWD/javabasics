package com.ecjtu.zwd.day1;

public class BreakDome {
    public static void main(String[] args) {
        outer:
        for (int k = 0; k < 5; k++) {
            //内层循环
            for (int m = 0; m < 5; m++) {
                System.out.println("k=" + k + ",m=" + m);
                if (m == 1) {  //此时break语句跳出outer标签所在循环，即外层循环
                    break outer;
                }
            }

        }
    }
}

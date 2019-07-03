package com.ecjtu.zwd.day1;

import java.util.Scanner;

public class SwitchDome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入工作的岗位");
        int jobType=scanner.nextInt();
        switch (jobType){
            case JobUtil.ENGINEER:
                System.out.println("开发岗位");
                break;
            case JobUtil.STAFF:
                System.out.println("考勤，采购");
                break;
                default:
                    System.out.println("没有岗位");
        }
    }
}

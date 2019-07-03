package javabasicsProject.business;

import javabasicsProject.entity.*;
import javabasicsProject.util.CardUtil;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    static Scanner scanner=new Scanner(System.in);
    static CardUtil cardUtil=new CardUtil();
    public static void main(String[] args) throws IOException {
        System.out.println("*****欢迎使用嗖嗖移动业务大厅*****");
        while(true){
            System.out.println("1.用户登录  2.用户注册  3.使用嗖嗖  4.话费充值  5.资费说明  6.退出系统  ");
            System.out.print("请选择：");
            int index=scanner.nextInt();
            switch (index){
                case 1:
                    System.out.println("请输入手机卡号");
                    String number=scanner.next();
                    System.out.println("请输入密码");
                    String pwd=scanner.next();
                    if (cardUtil.isExisCard(number,pwd)){
                        into :while (true){
                            cardUtil.cards.get(number).showMeg();
                            int index2=scanner.nextInt();
                            switch (index2){
                                case 1:
                                    cardUtil.showRemainDetail(number);
                                    break;
                                case 2:
                                    cardUtil.showAmountDetail(number);
                                    break;
                                case 3:
                                    cardUtil.printConsumInfo(number);
                                    break;
                                case 4:
                                    System.out.println("*****套餐变更*****");
                                    System.out.println("1.话痨套餐 2.网虫套餐 3.超人套餐 请选择(序号):");
                                    String packNum=scanner.next();
                                    cardUtil.changingPack(number,packNum);
                                    break;
                                case 5:
                                    cardUtil.delCard(number);
                                    break;
                                default:
                                    break into;
                            }}
                        }else{
                        System.out.println("手机卡号或密码不正确，请重新选择！");
                    }
                break;
                case 2:
                    MobileCard mobileCard=new MobileCard();
                    cardUtil.addCard(mobileCard);
                    break;
                case 3:
                    System.out.println("请输入手机号码:");
                    while(true){
                        String number1=scanner.next();
                        if (cardUtil.cards.containsKey(number1)){
                            cardUtil.useSoso(number1);
                            break;
                        }else{
                            System.out.println("不存在该号码，请重新输入...");
                        }
                    }
                    break;
                case 4:
                    System.out.println("请输入充值卡号:");
                    while (true){
                        String number2=scanner.next();
                        if (cardUtil.isExistCard(number2)){
                            System.out.println("请输入充值金额");
                            double money=scanner.nextDouble();
                            if (money<50.0){
                                System.out.println("充值金额至少为50元");
                            }else{
                                cardUtil.changeMoney(number2,money);
                                break;
                            }
                        }else{
                            System.out.println("不存在该号码，请重新输入！");
                        }
                    }
                    break;
                case 5:
                    cardUtil.showDescription();
                    break;
                case 6:
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("输入有误，请重新输入！！！");
            }
        }
    }
}

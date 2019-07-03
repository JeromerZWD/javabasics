package javabasicsProject.util;

import javabasicsProject.entity.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CardUtil {
    public Map<String, MobileCard> cards=new HashMap<>();
    public Map<String, List<ConsumInfo>> consumInfos=new HashMap<>();
    /*consumInfos.get(number).add(consumInfo);
    addConsumInfo(number,consumInfo);*/
    public void initScene(){

    }
    public boolean isExisCard(String number,String passWord){
        return cards.containsKey(number)&&cards.get(number).passWord.equals(passWord);
    }
    public boolean isExistCard(String number){
        return cards.containsKey(number);
    }
    public String createNumber(){
        Scanner scanner=new Scanner(System.in);
        String[] s1=getNewNumbers(9);
        System.out.print("请选择卡号(输入1-9的序号)：");
        int index=scanner.nextInt();
        String number=s1[index-1];
        return number;
    }
    public  String[] getNewNumbers(int count){
        String[] l1=new String[count];
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("*****可选择的卡号*****");
        for (int i = 0; i < count; i++) {
            String number = "139";
            for (int j = 0; j < 8; j++) {
                number += random.nextInt(9);
            }
            if (isExistCard(number)){
                i--;
            }else{
                l1[i]=number;
                System.out.print(number+"\t");
                if ((i+1)%3==0){
                    System.out.println();
                }
            }
        }
        return l1;
    }
    public void addCard(MobileCard card){
        Scanner scanner=new Scanner(System.in);
       card.setCardNumber(createNumber());
        System.out.print("1.话痨套餐 2.网虫套餐 3.超人套餐，请选择套餐（输入序号）：");
        int index1=scanner.nextInt();
        switch (index1){
            case 1:
                TalkPackage servicePackage1=new TalkPackage(58,500,30);
                card.setSerPackage(servicePackage1);
                card.setRealFlow(0);
                card.setRealSMSCount(0);
                card.setRealTalkTime(0);
                card.setConsumAmount(58);
                break;
            case 2:
                NetPackage servicePackage2=new NetPackage(68,3072);
                card.setSerPackage(servicePackage2);
                card.setRealFlow(0);
                card.setRealSMSCount(0);
                card.setRealTalkTime(0);
                card.setConsumAmount(68);
                break;
            case 3:
                SuperPackage servicePackage3=new SuperPackage(78,200,50,1024);
                card.setSerPackage(servicePackage3);
                card.setRealFlow(0);
                card.setRealSMSCount(0);
                card.setRealTalkTime(0);
                card.setConsumAmount(78);
                break;
        }
        System.out.println("请输入姓名:");
        String name=scanner.next();
        card.setUserName(name);
        System.out.println("请输入密码:");
        String pwd=scanner.next();
        card.setPassWord(pwd);
        System.out.println("请输入预存话费余额:");
        while (true){
            double prestored=scanner.nextDouble();
            if (prestored<card.serPackage.price){
                System.out.println("您预存的话费金额不足以支付本月固定套餐资费，请重新充值：");
            }else{
                double money=prestored-card.getConsumAmount();
                card.setMoney(money);
                System.out.print("注册成功！");
                System.out.println("卡号:"+card.getCardNumber()+" 用户名:"+card.getUserName()+" 当前余额:"+card.getMoney());
                card.getSerPackage().showInfo();
                cards.put(card.getCardNumber(),card);
                consumInfos.put(card.getCardNumber(),new ArrayList<ConsumInfo>());
                break;
            }
        }


    }
    public void delCard(String number){
        System.out.println("*****办理退网*****");
        cards.remove(number);
        System.out.println("卡号"+number+"办理退网成功！");
        System.out.println("感谢使用！");
    }
    public void showRemainDetail(String number){
        System.out.println("*****本月账单查询*****");
        System.out.println("您的卡号:"+number+"，当月账单:");
        System.out.println("套餐资费:"+cards.get(number).getSerPackage().getPrice());
        System.out.println("合计:"+cards.get(number).getConsumAmount());
        System.out.println("账户余额:"+cards.get(number).getMoney());
    }
    public void showAmountDetail(String number){
        System.out.println("*****套餐余量查询*****");
        System.out.println("您的卡号:"+number+"，套餐内余量:");
        if (cards.get(number).getSerPackage()  instanceof SuperPackage){
            int num=((SuperPackage) cards.get(number).getSerPackage()).talkTime-cards.get(number).getRealTalkTime();
            if (num>=0){
                System.out.println("通话时长:"+num+"分钟");
            }else {

                System.out.println("通话时长:0分钟");
            }
            int num1=((SuperPackage)cards.get(number).getSerPackage()).smsCount-cards.get(number).getRealSMSCount();
            if (num1>=0){
                System.out.println("短信条数:"+num+"条");
            }else{
                System.out.println("短信条数:0条");
            }
            int num2=((SuperPackage)cards.get(number).getSerPackage()).flow-cards.get(number).getRealFlow();
            if (num2>=0){
            System.out.println("上网流量:"+num2/1024+"GB");
            }else{
             System.out.println("上网流量:0GB");
}

        }else  if (cards.get(number).getSerPackage()  instanceof TalkPackage){
            int num3=((TalkPackage) cards.get(number).getSerPackage()).talkTime-cards.get(number).getRealTalkTime();
            if (num3>=0){
                System.out.println("通话时长:"+num3+"分钟");
            }else {
                System.out.println("通话时长:0分钟");
            }
            int num4=((TalkPackage)cards.get(number).getSerPackage()).smsCount-cards.get(number).getRealSMSCount();
            if (num4>=0){
                System.out.println("短信条数:"+num4+"条");
            }else{
                System.out.println("短信条数:0条");
            }
        } else if (cards.get(number).getSerPackage()  instanceof NetPackage){
            int num5=((NetPackage)cards.get(number).getSerPackage()).flow-cards.get(number).getRealFlow();
            if (num5>=0){
                System.out.println("上网流量:"+num5/1024+"GB");
            }else{
                System.out.println("上网流量:0GB");
            }
        }


    }
    public void addConsumInfo(String number,ConsumInfo info){
        consumInfos.get(number).add(info);
        //使用I/O技术将集合中信息写入文件
    }
    public void useSoso(String number){
        Random random=new Random();
        ServicePackage servicePackage=cards.get(number).getSerPackage();
        int index=random.nextInt(6);
        switch (index){
            case 0:
                if (!(servicePackage instanceof NetPackage)){
                    ConsumInfo consumInfo=new ConsumInfo(number,"通话",30);
                    System.out.println("问候客户，谁知其如此难缠  通话30分钟");
                    addConsumInfo(number,consumInfo);
                    if (servicePackage instanceof SuperPackage){
                            ((SuperPackage)cards.get(number).getSerPackage()).call(30,cards.get(number));
                        }else{
                            ((TalkPackage)cards.get(number).getSerPackage()).call(30,cards.get(number));
                        }

                }else{
                    useSoso(number);
                }
                break;
            case 1:
                if (!(servicePackage instanceof NetPackage)) {
                    ConsumInfo consumInfo = new ConsumInfo(number, "短信", 50);
                    System.out.println("通知朋友手机换号，发送短信50条");
                    addConsumInfo(number, consumInfo);
                    if (servicePackage instanceof SuperPackage){
                        ((SuperPackage)cards.get(number).getSerPackage()).send(50,cards.get(number));
                    }else{
                        ((TalkPackage)cards.get(number).getSerPackage()).send(50,cards.get(number));
                    }
                }else {
                        useSoso(number);
                    }
                break;
            case 2:
                if (!(servicePackage instanceof NetPackage)){
                    System.out.println("参与环境保护实施方案问卷调查   发送短信5条");
                    ConsumInfo consumInfo1=new ConsumInfo(number,"短信",5);
                        addConsumInfo(number,consumInfo1);
                    if (servicePackage instanceof SuperPackage){
                        ((SuperPackage)cards.get(number).getSerPackage()).send(5,cards.get(number));
                        }else{
                        ((TalkPackage)cards.get(number).getSerPackage()).send(5,cards.get(number));
                    }
                }else{
                    useSoso(number);
                }
                break;
            case 3:
                if (!(servicePackage instanceof TalkPackage)){
                    System.out.println("搞活动需要开直播 使用流量500MB");
                    ConsumInfo consumInfo3=new ConsumInfo(number,"上网",500);
                        addConsumInfo(number,consumInfo3);
                    if (servicePackage instanceof SuperPackage){
                        ((SuperPackage)cards.get(number).getSerPackage()).netPlay(500,cards.get(number));
                    }else{
                        ((NetPackage)cards.get(number).getSerPackage()).netPlay(500,cards.get(number));
                    }
                }else{
                    useSoso(number);
                }
                break;
            case 4:
                if (!(servicePackage instanceof TalkPackage)){
                    System.out.println("查资料 使用流量30MB");
                    ConsumInfo consumInfo=new ConsumInfo(number,"上网",30);
                        addConsumInfo(number,consumInfo);
                    if (servicePackage instanceof SuperPackage){
                        ((SuperPackage)cards.get(number).getSerPackage()).netPlay(30,cards.get(number));
                    }else{
                        ((NetPackage)cards.get(number).getSerPackage()).netPlay(30,cards.get(number));
                    }
                }else{
                    useSoso(number);
                }
                break;
            case 5:
                if (!(servicePackage instanceof NetPackage)){
                    ConsumInfo consumInfo=new ConsumInfo(number,"通话",10);
                    System.out.println("问候客户  通话10分钟");
                        addConsumInfo(number,consumInfo);
                    if (servicePackage instanceof SuperPackage){
                        ((SuperPackage)cards.get(number).getSerPackage()).call(10,cards.get(number));
                    }else{
                        ((TalkPackage)cards.get(number).getSerPackage()).call(10,cards.get(number));
                    }
                }else{
                    useSoso(number);
                }
                break;
        }

    }
    public void showDescription() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("C:\\Users\\17270\\IdeaProjects\\javabasics\\src\\javabasicsProject\\log\\PackageInformation")));
        String len;
        while ((len=bufferedReader.readLine())!=null){
            System.out.println(len);
        }

    }
    public void changingPack(String number,String packNum){

            if ((packNum.equals("1")&&cards.get(number).getSerPackage() instanceof TalkPackage)||(packNum.equals("2")&&cards.get(number).getSerPackage() instanceof NetPackage)||(packNum.equals("3")&&cards.get(number).getSerPackage() instanceof SuperPackage)){
                System.out.println("对不起，您已经是该套餐用户，无需换套餐!");
            }else {
                if (packNum.equals("1")){
                    TalkPackage talkPackage=new TalkPackage(58,500,30);
                    if (cards.get(number).getMoney()<talkPackage.price){
                        System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                    }else{
                        System.out.println("套餐更换成功！");
                        cards.get(number).setSerPackage(talkPackage);
                        cards.get(number).setMoney(cards.get(number).getMoney()-talkPackage.price);
                        cards.get(number).setRealTalkTime(0);
                        cards.get(number).setRealSMSCount(0);
                        cards.get(number).setRealFlow(0);
                        cards.get(number).setConsumAmount(cards.get(number).getConsumAmount()+talkPackage.price);

                    }
                }
                if (packNum.equals("2")){
                    NetPackage netPackage=new NetPackage(68,3072);
                    if (cards.get(number).getMoney()<netPackage.price){
                        System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                    }else{
                        System.out.println("套餐更换成功！");
                        cards.get(number).setSerPackage(netPackage);
                        cards.get(number).setMoney(cards.get(number).getMoney()-netPackage.price);
                        cards.get(number).setRealTalkTime(0);
                        cards.get(number).setRealSMSCount(0);
                        cards.get(number).setRealFlow(0);
                        cards.get(number).setConsumAmount(cards.get(number).getConsumAmount()+netPackage.price);

                    }
                }
                if (packNum.equals("3")){
                    SuperPackage superPackage=new SuperPackage(78,200,50,1024);
                    if (cards.get(number).getMoney()<superPackage.price){
                        System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                    }else{
                        System.out.println("套餐更换成功！");
                        cards.get(number).setSerPackage(superPackage);
                        cards.get(number).setMoney(cards.get(number).getMoney()-superPackage.price);
                        cards.get(number).setRealTalkTime(0);
                        cards.get(number).setRealSMSCount(0);
                        cards.get(number).setRealFlow(0);
                        cards.get(number).setConsumAmount(cards.get(number).getConsumAmount()+superPackage.price);

                    }
                }

            }
    }
    public void printConsumInfo(String number){
        System.out.println("*****"+number+"消费记录*****");
        System.out.println("序号\t"+"类型\t"+"数据(通话(条)/上网(MB)/短信(条))");
        if (consumInfos.get(number).size()==0){
            System.out.println("-----无消费记录！-----");
        }else{
            for (int i=0;i<consumInfos.get(number).size();i++){
                System.out.println(i+1+"\t"+consumInfos.get(number).get(i).type+"\t"+consumInfos.get(number).get(i).consumData);
            }
        }

    }
    public void changeMoney(String number,double money){
        cards.get(number).setMoney(cards.get(number).getMoney()+money);
        System.out.println("充值成功，当前话费余额为"+cards.get(number).getMoney()+"元。");
    }
}

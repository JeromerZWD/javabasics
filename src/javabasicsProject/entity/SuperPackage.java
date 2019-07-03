package javabasicsProject.entity;

public class SuperPackage extends ServicePackage implements CallService,SendService,NetService {
    public int talkTime;
    public int smsCount;
    public int flow;

    public SuperPackage(int price, int talkTime, int smsCount, int flow) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
        this.flow = flow;
    }

    public void showInfo(){
        System.out.println("超人套餐:通话时长为"+talkTime+"分钟/月，短信条数为"+smsCount+"条/月，上网流量为"+flow+"MB/月");
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    @Override
    public int call(int minCount, MobileCard card) {
        int num=card.getRealTalkTime()-((SuperPackage)card.getSerPackage()).getTalkTime();
        if (num>0) {
            card.setConsumAmount((card.getConsumAmount() + minCount * 0.2));
            card.setMoney(card.getMoney() - minCount * 0.2);
        }else{
            card.setRealTalkTime(card.getRealTalkTime()+minCount);
            int nmu2=card.getRealTalkTime()-((SuperPackage)card.getSerPackage()).getTalkTime();
            if (nmu2>0){
                card.setConsumAmount((card.getConsumAmount() + nmu2 * 0.2));
                card.setMoney(card.getMoney() - nmu2 * 0.2);
            }
        }
        return num;
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        int num=card.getRealFlow()-((SuperPackage)card.getSerPackage()).getFlow();
        if (num>0) {
            card.setConsumAmount((card.getConsumAmount() + flow * 0.1));
            card.setMoney(card.getMoney() - flow * 0.1);
        }else{
            card.setRealFlow(card.getRealFlow()+flow);
            int num2=card.getRealFlow()-((SuperPackage)card.getSerPackage()).getFlow();
            if (num2>0){
                card.setConsumAmount((card.getConsumAmount() + num2 * 0.1));
                card.setMoney(card.getMoney() - num2 * 0.1);
            }
        }
        return num;
    }

    @Override
    public int send(int count, MobileCard card) {
        int num=card.getRealSMSCount()-((SuperPackage)card.getSerPackage()).getSmsCount();
        if (num>0) {
            card.setConsumAmount((card.getConsumAmount() + count * 0.1));
            card.setMoney(card.getMoney() - count * 0.1);
        }else{
            card.setRealSMSCount(card.getRealSMSCount()+count);
            int num2=card.getRealSMSCount()-((SuperPackage)card.getSerPackage()).getSmsCount();
           if (num2>0){
               card.setConsumAmount((card.getConsumAmount()+num2 * 0.1));
               card.setMoney(card.getMoney() -num2 * 0.1);
           }
        }

        return num;
    }
}

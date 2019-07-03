package javabasicsProject.entity;

public class TalkPackage extends ServicePackage implements CallService,SendService{
    public int talkTime;
    public int smsCount;

    public TalkPackage(int price, int talkTime, int smsCount) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public void showInfo(){
        System.out.println("话痨套餐:通话时长为"+talkTime+"分钟/月，短信条数为"+smsCount+"条/月");
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

    @Override
    public int call(int minCount, MobileCard card) {
        int num=card.getRealTalkTime()-((TalkPackage)card.getSerPackage()).getTalkTime();
        if (num>0) {
            card.setConsumAmount((card.getConsumAmount() + minCount * 0.2));
            card.setMoney(card.getMoney() - minCount * 0.2);
        }else{
            card.setRealTalkTime(card.getRealTalkTime()+minCount);
           int nmu2=card.getRealTalkTime()-((TalkPackage)card.getSerPackage()).getTalkTime();
           if (nmu2>0){
               card.setConsumAmount((card.getConsumAmount() + nmu2 * 0.2));
               card.setMoney(card.getMoney() - nmu2 * 0.2);
           }
        }
        return num;
    }

    @Override
    public int send(int count, MobileCard card) {
        int num3=card.getRealSMSCount()-((TalkPackage)card.getSerPackage()).getSmsCount();
        if (num3>0) {
            card.setConsumAmount((card.getConsumAmount() + count * 0.1));
            card.setMoney(card.getMoney() - count * 0.1);
        }else{
            card.setRealSMSCount(card.getRealSMSCount()+count);
            int num4=card.getRealSMSCount()-((TalkPackage)card.getSerPackage()).getSmsCount();
            if (num4>0){
                card.setConsumAmount((card.getConsumAmount()+num4 * 0.1));
                card.setMoney(card.getMoney() -num4 * 0.1);
            }
        }
        return num3;
    }
}

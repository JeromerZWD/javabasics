package javabasicsProject.entity;




public class NetPackage extends ServicePackage implements NetService {
    public int flow;

    public NetPackage(int price, int flow) {
        super(price);
        this.flow = flow;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public void showInfo(){
        System.out.println("网虫套餐:上网流量为"+flow+"MB/月");
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        int num=card.getRealFlow()-((NetPackage)card.getSerPackage()).getFlow();
        if (num>0) {
            card.setConsumAmount((card.getConsumAmount() + flow * 0.1));
            card.setMoney(card.getMoney() - flow * 0.1);
        }else{
            card.setRealFlow(card.getRealFlow()+flow);
            int num2=card.getRealFlow()-((NetPackage)card.getSerPackage()).getFlow();
            if (num2>0){
                card.setConsumAmount((card.getConsumAmount() + num2 * 0.1));
                card.setMoney(card.getMoney() - num2 * 0.1);
            }
        }
        return num;
    }
}

package ObserverMode;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    private List<Observer> weixinUserlist=new ArrayList<Observer>();
    // 增加订阅者
    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }
    // 删除订阅者
    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }
    // 通知订阅者更新消息
    @Override
    public void notify(String message) {
        for (Observer observer:weixinUserlist) {
            observer.update(message);
        }
    }
}

package observer;

import java.util.ArrayList;
import java.util.List;

// 具体主题角色
public class SubscriptionSubject implements Subject {

    // 存储观察者对象
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer user: userList) {
            user.update(message);
        }
    }
}

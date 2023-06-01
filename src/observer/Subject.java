package observer;

// 抽象主题角色
public interface Subject {

    // 增删观察者
    void attach(Observer observer);
    void detach(Observer observer);
    // 发送提醒通知
    void notify(String message);
}

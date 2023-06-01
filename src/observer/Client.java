package observer;

public class Client {

    public static void main(String[] args) {
        // 创建主题角色
        Subject subject = new SubscriptionSubject();
        // 创建观察者角色
        subject.attach(new UserObserver("user1"));
        subject.attach(new UserObserver("user2"));
        subject.attach(new UserObserver("user3"));
        // 主题角色更新
        subject.notify("主题更新！");
    }
}

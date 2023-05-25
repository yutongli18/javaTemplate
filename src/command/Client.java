package command;

public class Client {

    public static void main(String[] args) {
        // 创建订单对象
        Order order1 = new Order();
        order1.setNumber(1);
        order1.setFoodDir("西红柿鸡蛋面", 1);
        order1.setFoodDir("可乐", 2);

        Order order2 = new Order();
        order2.setNumber(2);
        order2.setFoodDir("尖椒肉丝面", 1);
        order2.setFoodDir("雪碧", 1);

        // 创建厨师对象
        Chief chief = new Chief();

        // 创建命令对象
        command command1 = new OrderCommand(chief, order1);
        command command2 = new OrderCommand(chief, order2);

        // 创建服务员对象
        Waiter waiter = new Waiter();
        waiter.setCommand(command1);
        waiter.setCommand(command2);
        // 服务员发起命令
        waiter.orderUp();
    }
}

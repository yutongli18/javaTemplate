package command;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements command {

    // 持有接收者对象
    private Chief chief;
    private Order order;

    public OrderCommand(Chief chief, Order order) {
        this.chief = chief;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("桌号：" + order.getNumber());
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> foods = foodDir.keySet();
        for (String food: foods) {
            chief.makeFood(food, foodDir.get(food));
        }
        System.out.println("餐品准备好了！");
    }
}

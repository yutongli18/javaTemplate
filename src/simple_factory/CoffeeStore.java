package simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String coffeeName){
        /*// 声明Coffee类型的变量
        Coffee coffee = null;
        // 判断
        if("american".equals(coffeeName)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(coffeeName)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("输入不合法！");
        }
        */
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(coffeeName);
        // 加配料
        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }
}

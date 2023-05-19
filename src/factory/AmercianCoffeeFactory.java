package factory;

public class AmercianCoffeeFactory implements CoffeeFactory {
    // 生产美式咖啡的工厂
    public Coffee createCoffee(){
        return new AmericanCoffee();
    }
}

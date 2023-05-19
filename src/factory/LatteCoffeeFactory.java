package factory;

public class LatteCoffeeFactory implements CoffeeFactory {
    // 生产拿铁咖啡的工厂
    public Coffee createCoffee(){
        return new LatteCoffee();
    }
}

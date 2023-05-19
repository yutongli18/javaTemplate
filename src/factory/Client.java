package factory;

public class Client {
    public static void main(String[] args){
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory coffeeFactory = new AmercianCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}

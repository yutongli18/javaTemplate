package abstract_factory;

public class Client {

    public static void main(String[] args){
        ItalianDessert factory = new ItalianDessert();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}

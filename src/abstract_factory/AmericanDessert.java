package abstract_factory;

public class AmericanDessert implements DessertFactory {

    public Coffee createCoffee(){
        return new AmericanCoffee();
    }

    public Dessert createDessert(){
        return new MatchaMousse();
    }
}

package decorator;

public class FriedRice extends FastFood {

    public FriedRice(){
        super(10, "Fried Rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

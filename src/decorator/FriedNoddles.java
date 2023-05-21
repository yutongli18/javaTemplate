package decorator;

public class FriedNoddles extends FastFood {

    public FriedNoddles() {
        super(12, "Fried Noddles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

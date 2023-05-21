package decorator;

public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "Add bacon");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}

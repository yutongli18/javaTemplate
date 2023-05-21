package decorator;

public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "Add egg");
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

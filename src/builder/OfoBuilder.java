package builder;

public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("OfO Frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("OfO Seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

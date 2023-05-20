package builder;

public abstract class Builder {

    // 声明Bike类型的变量
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike createBike();
}

package builder;

public class Director {

    // 声明Builder类型的变量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    // 组装自行车
    public Bike constructBike(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

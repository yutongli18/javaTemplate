package builder;

public class Client {

    public static void main(String[] args){
        Director director = new Director(new OfoBuilder());

        // 指挥者指挥构建自行车
        Bike bike = director.constructBike();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

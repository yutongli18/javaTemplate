package proxy;

public class ProxyPoint implements SellTicket {

    // 声明火车站类的对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费");
        trainStation.sell();
    }
}

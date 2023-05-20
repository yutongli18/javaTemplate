package proxy;

public class TrainStation implements SellTicket {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}

package strategy;

public class Client {

    public static void main(String[] args) {
        // 春节
        SalesMan salesMan = new SalesMan(new StrategyA());
        // 展示促销活动
        salesMan.salesManShow();
    }
}

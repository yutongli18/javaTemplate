package strategy;

public class SalesMan {

    // 聚合策略类
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    // 展示
    public void salesManShow() {
        strategy.show();
    }
}

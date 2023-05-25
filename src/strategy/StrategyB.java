package strategy;

public class StrategyB implements Strategy {

    @Override
    public void show() {
        System.out.println("策略B：满200减50");
    }
}

package strategy;

public class StrategyC implements Strategy {

    @Override
    public void show() {
        System.out.println("策略C：满1000元换购");
    }
}

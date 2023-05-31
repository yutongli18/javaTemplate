package state;

// 具体状态类：电梯运行
public class RunState extends LiftState {

    @Override
    public void open() {
        // 电梯在运行状态下不能开门
    }

    @Override
    public void close() {
        // 电梯在运行状态下已经是关门状态了
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOP_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        System.out.println("电梯运行...");
    }
}

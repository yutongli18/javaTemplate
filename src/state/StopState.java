package state;

// 具体状态类：电梯停止
public class StopState extends LiftState {

    @Override
    public void open() {
        super.context.setState(Context.OPEN_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSE_STATE);
        super.context.close();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止...");
    }

    @Override
    public void run() {
        super.context.setState(Context.RUN_STATE);
        super.context.run();
    }
}

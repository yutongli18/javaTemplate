package state;

// 具体状态类：电梯关闭
public class CloseState extends LiftState {

    @Override
    public void open() {
        super.context.setState(Context.OPEN_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭...");
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOP_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        super.context.setState(Context.RUN_STATE);
        super.context.run();
    }
}

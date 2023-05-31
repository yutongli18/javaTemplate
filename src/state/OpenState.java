package state;

// 具体状态类：电梯开启
public class OpenState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开门...");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSE_STATE);
        super.context.close();
    }

    @Override
    public void stop() {
        // 开门时已经是停止状态了
    }

    @Override
    public void run() {
        // 开门状态不能运行
    }
}

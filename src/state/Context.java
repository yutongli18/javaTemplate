package state;

// 环境角色类
public class Context {

    // 状态常量
    public final static OpenState OPEN_STATE = new OpenState();
    public final static CloseState CLOSE_STATE = new CloseState();
    public final static StopState STOP_STATE = new StopState();
    public final static RunState RUN_STATE = new RunState();

    // 定义当前状态变量
    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
        // 设置当前状态对象中的context对象
        this.state.setContext(this);
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void stop() {
        this.state.stop();
    }

    public void run() {
        this.state.run();
    }
}

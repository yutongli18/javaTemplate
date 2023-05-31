package state;

// 抽象状态类
public abstract class LiftState {

    // 环境角色类
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();
}

package responsibility;

// 抽象处理者
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;
    // 能够处理的请假天数区间
    private int numStart;
    private int numEnd;
    // 后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 抽象处理方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    // 提交请假条
    public final void submitLeave(LeaveRequest leaveRequest) {
        // 因为处理方法是protected类型，不能直接被外界访问
        this.handleLeave(leaveRequest);
        if (nextHandler != null && leaveRequest.getNum() > numEnd) {
            nextHandler.submitLeave(leaveRequest);
        } else {
            System.out.println("流程结束");
        }
    }
}

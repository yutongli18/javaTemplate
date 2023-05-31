package responsibility;

// 具体实现类：总经理
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + ": "
                           + leaveRequest.getContent());
        System.out.println("总经理审批同意");
    }
}

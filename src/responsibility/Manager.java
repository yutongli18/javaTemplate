package responsibility;

// 具体实现类：部门经理
public class Manager extends Handler {

    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + ": "
                           + leaveRequest.getContent());
        System.out.println("部门经理审批同意");
    }
}

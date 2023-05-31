package responsibility;

// 具体实现类：小组长
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + ": "
                           + leaveRequest.getContent());
        System.out.println("小组长审批同意");
    }
}

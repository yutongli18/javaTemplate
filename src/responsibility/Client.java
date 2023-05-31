package responsibility;

public class Client {

    public static void main(String[] args) {
        // 创建请假条
        LeaveRequest leaveRequest = new LeaveRequest("张三", 5, "病假");
        // 创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        // 创建责任链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        generalManager.setNextHandler(null);
        // 提交请求
        groupLeader.submitLeave(leaveRequest);
    }
}

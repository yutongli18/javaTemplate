package responsibility;

// 请假条
public class LeaveRequest {

    private String name;
    private int num;  // 天数
    private String content;  // 请假原因

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}

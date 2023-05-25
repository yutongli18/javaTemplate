package command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    // 持有命令对象
    private List<command> commands = new ArrayList<command>();

    // 设置命令
    public void setCommand(command command) {
        commands.add(command);
    }

    // 发出命令
    public void orderUp() {
        System.out.println("服务员发起订单：");
        for (command command: commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}

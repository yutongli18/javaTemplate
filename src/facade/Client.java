package facade;

public class Client {

    public static void main(String[] args) {
        // 创建外观角色
        SmartFacade facade = new SmartFacade();
        // 控制
        facade.say("打开所有家电");
        System.out.println("================================");
        facade.say("关闭所有家电");
    }
}

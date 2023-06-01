package mediator;

public class Client {

    public static void main(String[] args) {
        // 创建中介者
        MediatorStructure mediator = new MediatorStructure();
        // 创建同事角色
        Tenant tenant = new Tenant("张三", mediator);
        HouseOwner houseOwner = new HouseOwner("李四", mediator);
        // 在中介者上设置同事角色
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        // 借助中介者对象传递信息
        tenant.contact("我要租房...");
        houseOwner.contact("我这里有房子可以租赁...");
    }
}

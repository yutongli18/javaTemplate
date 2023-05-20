package proxy;

public class Client {

    public static void main(String[] args){
        // 创建代售点类的对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 买票
        proxyPoint.sell();
    }
}

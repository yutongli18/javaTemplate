package prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException{

        // 创建一个具体原型对象
        RealizeType realizeType = new RealizeType();
        // 进行对象的克隆
        RealizeType clone = realizeType.clone();

        System.out.println(clone == realizeType);
    }
}

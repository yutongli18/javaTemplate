package hungary_singleton;

public class HungarySingletonTest {
    public static void main(String[] args){
        HungarySingleton instance = HungarySingleton.getInstance();
        HungarySingleton instance1 = HungarySingleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class HungarySingleton{
    // 静态的方法需要访问静态的实例
    private static HungarySingleton instance = new HungarySingleton();
    private HungarySingleton(){

    }
    // 外部无法创建对象，因此也无法调用非静态的方法
    public static HungarySingleton getInstance(){
        return instance;
    }
}

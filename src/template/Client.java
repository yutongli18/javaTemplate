package template;

public class Client {

    public static void main(String[] args) {
        // 炒包菜
        AbstractClass cook = new ConcreteClass_baocai();
        // 调用模板方法
        cook.cookProcess();
    }
}

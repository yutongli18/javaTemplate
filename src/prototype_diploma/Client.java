package prototype_diploma;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建Diploma对象
        Diploma diploma = new Diploma();
        // 克隆奖状对象
        Diploma diploma1 = diploma.clone();

        diploma.setName("Lucy");
        diploma1.setName("Lee");

        // 展示
        diploma.show();
        diploma1.show();
    }
}

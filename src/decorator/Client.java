package decorator;

public class Client {

    public static void main(String[] args) {
        // 炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + ":" + food.cost());
        System.out.println("========================================");
        // 在上述炒饭中添加鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + ":" + food.cost());
    }
}

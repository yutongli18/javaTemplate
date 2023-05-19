package coffee;

public abstract class Coffee {
    // 咖啡名称
    public abstract String getName();
    // 加糖
    public void addSuger(){
        System.out.println("加糖");
    }
    // 加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}

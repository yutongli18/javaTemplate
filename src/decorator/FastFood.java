package decorator;

public abstract class FastFood {

    private float price;
    private String desc;

    public FastFood(){}

    public FastFood(float price, String desc){
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // 根据具体构件计算价格
    public abstract float cost();
}

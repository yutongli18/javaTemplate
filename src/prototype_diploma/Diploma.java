package prototype_diploma;

public class Diploma  implements Cloneable {

    // 奖状上的姓名
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + "同学在XX学期中表现优秀，特发此状！");
    }

    @Override
    public Diploma clone() throws CloneNotSupportedException {
        return (Diploma) super.clone();
    }
}

package visitor;

// 具体访问者角色
public class Someone implements Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("客人喂食宠物猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("客人喂食宠物狗");
    }
}

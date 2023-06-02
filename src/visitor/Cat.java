package visitor;

// 具体元素角色
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("宠物猫已经喂食了");
    }
}

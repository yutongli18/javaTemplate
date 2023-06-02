package visitor;

// 具体元素角色
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("宠物狗已经喂食了");
    }
}

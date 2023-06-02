package visitor;

// 抽象访问者角色
public interface Person {

    void feed(Cat cat);
    void feed(Dog dog);
}

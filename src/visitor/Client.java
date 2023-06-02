package visitor;

public class Client {

    public static void main(String[] args) {
        Home home = new Home();
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        home.addAnimal(cat1);
        home.addAnimal(cat2);

        Person owner = new Owner();
        home.action(owner);
        System.out.println("====================");

        Person someone = new Someone();
        home.action(someone);
    }
}

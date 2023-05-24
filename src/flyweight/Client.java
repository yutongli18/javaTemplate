package flyweight;


public class Client {

    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();

        AbstractBox box1 = factory.getBox("I");
        box1.display("grey");

        AbstractBox box2 = factory.getBox("I");
        box2.display("red");

        System.out.println(box1 == box2);
    }
}

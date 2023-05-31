package state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new RunState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

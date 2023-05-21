package adapter.class_adapter;

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg: Hello, world!";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg: " + msg);
    }
}

package adapter.class_adapter;

public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "SDCard read msg: Hello, world!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}

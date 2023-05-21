package adapter.class_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("Adapter read TF Card.");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("Adapter write TF Card.");
        writeTF(msg);
    }
}

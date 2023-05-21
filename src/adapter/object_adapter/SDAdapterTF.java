package adapter.object_adapter;

public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("Adapter read TF Card.");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("Adapter write TF Card.");
        tfCard.writeTF(msg);
    }
}

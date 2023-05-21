package adapter.object_adapter;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        // 从SD卡读取数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("=============================================");
        // 从TF卡读取数据
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}

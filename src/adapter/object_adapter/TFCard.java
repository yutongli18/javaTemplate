package adapter.object_adapter;

public interface TFCard {

    // 从TF卡中读取数据
    String readTF();

    // 向TF卡中写入数据
    void writeTF(String msg);
}

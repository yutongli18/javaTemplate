package adapter.object_adapter;

public interface SDCard {

    // 从SD卡读取数据
    String readSD();

    // 向SD卡写入数据
    void writeSD(String msg);
}

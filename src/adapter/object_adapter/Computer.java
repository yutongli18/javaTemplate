package adapter.object_adapter;

public class Computer {

    // 从SD卡读取数据
    public String readSD(SDCard sdCard){
        if (sdCard == null){
            throw new NullPointerException("SD Card is not null!");
        }
        return sdCard.readSD();
    }
}

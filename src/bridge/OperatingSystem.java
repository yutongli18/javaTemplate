package bridge;

public abstract class OperatingSystem {

    // 声明VideoFile变量
    protected VideoFile videoFile;

    // 构造方法
    public OperatingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    // 播放
    public abstract void play(String fileName);
}

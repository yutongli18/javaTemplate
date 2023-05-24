package bridge;

public class AviFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("Avi视频文件" + fileName);
    }
}

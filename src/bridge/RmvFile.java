package bridge;

public class RmvFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("Rmv视频文件" + fileName);
    }
}

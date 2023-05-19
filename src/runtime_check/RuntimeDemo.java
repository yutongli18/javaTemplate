package runtime_check;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        // 调用Runtime对象方法
        Process process = runtime.exec("ipconfig");
        // 获取输入流
        InputStream inputStream = process.getInputStream();
        // 读取输入流
        byte[] arr = new byte[1024 * 1024 * 100];
        int length = inputStream.read(arr);
        // 打印输入流
        System.out.println(new String(arr, 0, length, "GBK"));
    }
}

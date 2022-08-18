package august.bao0819.FileInputStream_;

import java.io.*;

/**
 * @ClassName FileInputStreamDemo03
 * @Description 文件字节输入流:一次性读取文件全部字符
 * @Author CQ
 * @Date 2022/8/19 5:39
 * @Version 1.0
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节数组与文件的大小刚刚一样大。
        File f = new File("src/august/bao0819/FileInputStream_/data_/data03.txt");
        InputStream is = new FileInputStream(f);
        //2.定义一个字节数组与文件得到大小刚刚一样大
//        byte[] buffer = new byte[(int) f.length()];
//        int len=is.read(buffer);
//        System.out.println("读取了多少个字节："+len);
//        System.out.println("文件大小："+f.length());
//        System.out.println(new String(buffer));

//        byte[] buffer=is.readAllBytes();
//        System.out.println(new String(buffer));

    }
}

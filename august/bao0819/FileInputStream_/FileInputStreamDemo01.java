package august.bao0819.FileInputStream_;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @ClassName FileInputStreamDemo01
 * @Description 文件字节输入流:每次读取一个字节
 * @Author CQ
 * @Date 2022/8/18 21:51
 * @Version 1.0
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字符输入流管道与源文件接通。
        //InputStream is=new FileInputStream(new File("data.txt"));
        //简化写法
        InputStream is=new FileInputStream("src/august/bao0819/FileInputStream_/data_/data.txt");
        //2.读取一个字节返回（每次读取一滴水）
//        int b1=is.read();
//        System.out.println((char) b1);
//
//        int b2=is.read();
//        System.out.println((char) b2);
//
//        int b3=is.read();
//        System.out.println((char) b3);
//
//        int b4=is.read();
//        System.out.println(b4);//读取完毕，返回-1
        //3.使用循环改进
        int b;
        while ((b=is.read())!=-1){
            System.out.println((char)b);
        }


    }
}

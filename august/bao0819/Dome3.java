package august.bao0819;

import java.io.*;

/**
 * @ClassName Dome3
 * @Description 采用 字符流、字节流 两种方式将 C盘 1.txt 文件复制到 D盘 1.txt
 * @Author CQ
 * @Date 2022/8/21 15:42
 * @Version 1.0
 */
public class Dome3 {
    public static void main(String[] args) throws Exception {
        //字符流
//        FileReader f1 = new FileReader("C:\\1.txt");
//        FileWriter f2 = new FileWriter("D:\\1.txt");
//        char[] arr1 = new char[1024];
//        int len;
//        while ((len=f1.read(arr1))!=-1){
//            f2.write(arr1,0,len);
//        }
//        f1.close();
//        f2.close();

        //字节流
        //1.创建一个字节输入流管道与原视频接通
        try {
            InputStream is = new FileInputStream("C:\\\\1.txt");
            //2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("D:\\\\1.txt");

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了！");
            //4.关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

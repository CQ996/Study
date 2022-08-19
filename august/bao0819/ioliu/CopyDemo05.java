package august.bao0819.ioliu;

import java.io.*;

/**
 * @ClassName CopyDemo05
 * @Description 用字节流复制文件
 * @Author CQ
 * @Date 2022/8/19 9:28
 * @Version 1.0
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        //1.创建一个字节输入流管道与原视频接通
        try {
            InputStream is = new FileInputStream("C:\\Users\\CQ\\Desktop\\[示范60mbps]HD.Club-4K-Chimei-inn-60mbps.mp4");
            //2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\new.mp4");

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

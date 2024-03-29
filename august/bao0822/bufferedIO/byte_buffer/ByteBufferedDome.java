package august.bao0822.bufferedIO.byte_buffer;

import java.io.*;

/**
 * @ClassName ByteBufferedDome
 * @Description 使用Buffered字节缓冲流复制文件
 * @Author CQ
 * @Date 2022/8/19 9:28
 * @Version 1.0
 */
public class ByteBufferedDome {
    public static void main(String[] args) {
        try (
                //这里面只能放资源对象，用完会自动关闭：
                // 自动调用资源的close方法关闭资源（即使出现异常也会关闭操作）
                //1.创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\[示范60mbps]HD.Club-4K-Chimei-inn-60mbps.mp4");
                InputStream bis=new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\new.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ){

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

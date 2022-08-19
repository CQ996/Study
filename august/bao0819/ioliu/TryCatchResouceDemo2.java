package august.bao0819.ioliu;

import java.io.*;

/**
 * @ClassName CopyDemo05
 * @Description 使用TryCatchResouce释放资源
 * @Author CQ
 * @Date 2022/8/19 9:28
 * @Version 1.0
 */
public class TryCatchResouceDemo2 {
    public static void main(String[] args) {
        try (
                //这里面只能放资源对象，用完会自动关闭：
                // 自动调用资源的close方法关闭资源（即使出现异常也会关闭操作）
                //1.创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\[示范60mbps]HD.Club-4K-Chimei-inn-60mbps.mp4");
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\new.mp4");
        ){
            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

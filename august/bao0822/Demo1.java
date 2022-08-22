package august.bao0822;

import java.io.*;

/**
 * @ClassName Demo1
 * @Description 复制图片1.jpg为2.jpg
 * @Author CQ
 * @Date 2022/8/22 11:07
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("C:\\Users\\CQ\\Pictures\\1.jpg");
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("C:\\Users\\CQ\\Pictures\\2.jpg");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            //自定义数组存储每次运输的数据
            byte[] buffer = new byte[1024];
            int len;//自定义每次运输字节的长度
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

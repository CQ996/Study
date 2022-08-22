package august.bao0822.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @ClassName Test2
 * @Description 复制图片练习
 * @Author CQ
 * @Date 2022/8/22 13:08
 * @Version 1.0
 */
public class Test2 {

    //文件的复制:
    public static void main(String[] args) throws Exception {

        //借助字节流:

        //对1.png文件做数据的输入:  1.明确已知文件.  2.创建输入流通道. 3.开始循环输入.  4.关闭释放资源.
        File f1 = new File("d:/1.png");
        FileInputStream fis = new FileInputStream( f1 ); //输入字节流: InputStream的子类: FileInputStream.

        //对2.png文件做数据的输出:  1.明确目标文件位置.  2.创建输出流通道. 3.开始输出.  4.关闭释放资源.
        File f2 = new File("d:/2.png");
        FileOutputStream fos = new FileOutputStream( f2 ); //输出字节流: OutputStream的子类: FileOutputStream.

        byte[] bs = new byte[1024];
        int count = 0;
        while( (count = fis.read( bs )) != -1 ){

            //往输出流中输出:
            fos.write( bs , 0 , count );
            fos.flush();
        }

        fos.close();
        fis.close();

    }

}

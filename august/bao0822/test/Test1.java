package august.bao0822.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @ClassName Test1
 * @Description 复制文本文件练习
 * @Author CQ
 * @Date 2022/8/22 13:06
 * @Version 1.0
 */
public class Test1 {

    //文件的复制:
    public static void main(String[] args) throws Exception {

        //对1.txt文件做数据的输入:  1.明确已知文件.  2.创建输入流通道. 3.开始循环输入.  4.关闭释放资源.
        File f1 = new File("d:/1.txt");
        FileReader fr = new FileReader( f1 );

        //对2.txt文件做数据的输出:  1.明确目标文件位置.  2.创建输出流通道. 3.开始输出.  4.关闭释放资源.
        File f2 = new File("d:/2.txt");
        FileWriter fw = new FileWriter( f2 );

        char[] chs = new char[1024];
        int count = 0;
        while( (count = fr.read( chs )  )  != -1 ){
            //开始输出:
            fw.write( chs , 0 , count);
            fw.flush();
        }

        fw.close();
        fr.close();

    }

}
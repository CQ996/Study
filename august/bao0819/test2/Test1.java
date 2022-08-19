package august.bao0819.test2;

import java.io.*;

/**
 * @ClassName test1
 * @Description FileWriter流演示
 * @Author CQ
 * @Date 2022/8/19 15:22
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        //Writer( 字符数据的输出操作. )

        //需求: 将 java程序(字符数据)  ----> 输出----> 磁盘(1.txt).

        //1.模拟java程序中的字符串数据.
        String msg = "hi,mr.laowang!!!";

        //2.构建字符输出流通道:
        //3.明确对外输出的目标位置: 1.txt.
        File f1 = new File("d:/1.txt");
        FileWriter fw = new FileWriter(  f1 );

        //4.开始传输:
        fw.write( msg ); //将传输的字符数据写入到流通道中.
        fw.flush(); //刷新: 将流通道中的缓存数据刷到目标位置上.

        fw.write( msg );
        fw.flush();

        fw.write( msg );
        fw.flush();

        //5.关闭传输通道.释放资源.
        fw.close();

    }
}

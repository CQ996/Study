package august.bao0819.test2;

import java.io.*;

/**
 * @ClassName Test2
 * @Description FileReader流演示
 * @Author CQ
 * @Date 2022/8/19 16:01
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        //Reader( 字符数据的输入操作. )

        //需求:  加载磁盘(1.txt) -- 输入 --> java程序(字符串数据).

        //1.表示获取1.txt文件.
        File f1 = new File("d:/1.txt");

        //2.构建: 字符输入流通道:
        FileReader fr = new FileReader( f1 );

        //3.加载读取字符数据: 使用数据.
        //  仅限读取单个字符: fr.read()

        char[] chs = new char[100];

        int count = 0;

        //循环读取:
        while( (count = fr.read(chs)) != -1 ){
            //展示:
            System.out.println("读取的数量为: " + count);
            System.out.println("读取的内容为:" + new String(chs , 0 , count));

        }


        //4.流通道关闭.
        fr.close();


    }
}

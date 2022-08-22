package august.bao0822.test3;

import java.io.*;

/**
 * @ClassName Test1
 * @Description 转换流：字节---字符的相互转换
 * @Author CQ
 * @Date 2022/8/22 13:13
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) throws IOException {

        //字符->转字节:
        //需求: 将字符串存储到文件中.

        String info = "你好";

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("d:/1.txt")) , "utf-8");


        osw.write( info );
        osw.flush();

        osw.close();


        //字节->转字符:
        //需求: 将存储在文件中的数据读取出来变为字符串.
        InputStreamReader isr = new InputStreamReader( new FileInputStream(new File("d:/1.txt")) , "utf-8" );

        char[] chs=  new char[1024];
        int count = 0;

        while( (count = isr.read(chs)) != -1 ){
            System.out.println( new String(chs , 0 , count) );
        }
        isr.close();

    }
}
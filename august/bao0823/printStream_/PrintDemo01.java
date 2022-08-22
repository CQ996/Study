package august.bao0823.printStream_;

import java.io.*;

/**
 * @ClassName PrintDemo01
 * @Description 使用打印流 高效(自带缓冲流) 方便写数据到文件
 * @Author CQ
 * @Date 2022/8/22 15:47
 * @Version 1.0
 */
public class PrintDemo01 {
    public static void main(String[] args) throws Exception {
        //1.创建一个打印流对象
        //PrintStream ps=new PrintStream(new FileOutputStream("ps.txt"，true));//追加数据，在低级管道加true
        PrintStream ps=new PrintStream("ps.txt","utf-8");//写字节
        //PrintWriter ps=new PrintWriter("ps.txt","utf-8");//写字符

        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);
        ps.println("你好");

        //ps.write("我在学习");

        ps.close();

    }
}

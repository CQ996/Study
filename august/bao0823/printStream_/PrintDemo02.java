package august.bao0823.printStream_;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName PrintDemo02
 * @Description 改变输出语句的位置到文件
 * @Author CQ
 * @Date 2022/8/22 16:03
 * @Version 1.0
 */
public class PrintDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        //改变输出语句的位置 重定向
        PrintStream ps=new PrintStream("log.txt");
        System.setOut(ps);//把系统打印流改成自定义打印流

        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}

package august.bao0822.bufferedIO.transfer_stream;

import java.io.*;

/**
 * @ClassName CharSetTest00
 * @Description 使用字符输出转换流：输出指定编码字节到文本
 * @Author CQ
 * @Date 2022/8/22 5:53
 * @Version 1.0
 */
public class OutputStreamWriterDemo02 {
    public static void main(String[] args) throws Exception {
        //1.定义一个字节输出流
        OutputStream os=new FileOutputStream("5.txt");
        //2.把原始字节输出流转成字符输出流
        Writer osw=new OutputStreamWriter(os,"GBK");//指定GBK编码写字符出去

        //3.转成缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("啦啦啦啦1");
        bw.write("啦啦啦啦2");
        bw.write("啦啦啦啦3");
        bw.write("啦啦啦啦4");
        bw.close();

    }
}

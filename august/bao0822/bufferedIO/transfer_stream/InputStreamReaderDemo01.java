package august.bao0822.bufferedIO.transfer_stream;

import java.io.*;

/**
 * @ClassName CharSetTest00
 * @Description 使用字符输入转换流：让 代码编码UTF-8 和 文件编码不同GBK 也不会读取出乱码
 * @Author CQ
 * @Date 2022/8/22 5:53
 * @Version 1.0
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception {

        //代码编码：UTF-8，文件编码：ANSI（GBK） 会乱码
        //1.先提取文件的原始字节流
        InputStream is=new FileInputStream("D:\\33.txt");
        //2.把原始字节流以指定编码转换成字符输入流
        InputStreamReader isr = new InputStreamReader(is,"GBK");//以指定的GBK编码转换成字符输入流

        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }



    }
}

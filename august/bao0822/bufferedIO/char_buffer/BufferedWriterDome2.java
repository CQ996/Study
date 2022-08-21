package august.bao0822.bufferedIO.char_buffer;

import java.io.*;

/**
 * @ClassName BufferedWriterDome2
 * @Description 使用缓冲字符输出流，学会newline(换行)功能
 * @Author CQ
 * @Date 2022/8/22 5:08
 * @Version 1.0
 */
public class BufferedWriterDome2 {
    public static void main(String[] args) throws Exception{
        Writer fw=new FileWriter("2.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(98);//b
        bw.write('a');//a
        bw.write("你");
        bw.write("\r\n");//换行
        bw.newLine();//也是换行
        bw.write("22222222222");
        bw.write("333333333333333");
        bw.close();
    }
}

package august.bao0823;

import java.io.*;

/**
 * @ClassName Dome1
 * @Description 使用 (字符缓冲流 + 字符缓冲流 + 字节流) 读取1.txt文本文件中的字符并输出打印,并采用gbk编码格式处理
 * @Author CQ
 * @Date 2022/8/22 18:51
 * @Version 1.0
 */
public class Dome1 {
        public static void main(String[] args) throws Exception {

            String info = "你好";
            //1.定义一个字节输出流
            OutputStream os=new FileOutputStream("d:/1.txt");
            //2.把原始字节输出流转成字符输出流
            Writer osw=new OutputStreamWriter(os,"GBK");//指定GBK编码写字符出去
            BufferedWriter bosw=new BufferedWriter(osw);
            //3.转成缓冲字符输出流
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(info,0,info.length());
            bosw.flush();
            bw.close();


            //1.先提取文件的原始字节流
            InputStream is=new FileInputStream("D:\\1.txt");
            //2.把原始字节流以指定编码转换成字符输入流
            InputStreamReader isr = new InputStreamReader(is,"GBK");//以指定的GBK编码转换成字符输入流

            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }

        }
    }

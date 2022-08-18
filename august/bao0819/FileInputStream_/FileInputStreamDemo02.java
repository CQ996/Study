package august.bao0819.FileInputStream_;

import java.io.FileInputStream;

/**
 * @ClassName FileInputStreamDemo02
 * @Description 文件字节输入流:每次读取一个字节数组
 * @Author CQ
 * @Date 2022/8/18 22:18
 * @Version 1.0
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        FileInputStream is = new FileInputStream("src/august/bao0819/FileInputStream_/data_/data02.txt");
        //2.定义一个字节数组，用于读取字节数组
//        byte[] buffer = new byte[3];//读3个字节
//        int len=is.read(buffer);
//        System.out.println("读取了几个字节："+len);
//        String rs = new String(buffer);//解码
//        System.out.println(rs);
//
//        int len1=is.read(buffer);
//        System.out.println("读取了几个字节："+len1);
//        String rs1 = new String(buffer);//解码
//        System.out.println(rs1);
//        //buffer=[a b c]
//
//        //buffer=[a b c]==>[c d c]
//        int len2=is.read(buffer);
//        System.out.println("读取了几个字节："+len2);
//        String rs2 = new String(buffer,0,len2);
//        //读取多少倒出多少
//        System.out.println(rs2);
//
//        int len3=is.read(buffer);
//        System.out.println("读取了几个字节："+len3);//读取完毕返回-1

        //3.改进使用循环每次读取一个字节数组
        byte[] buffer = new byte[3];
        int len;//记录每次读取的字节数
        while ((len=is.read(buffer))!=-1){
            //读多少倒多少
            System.out.println(new String(buffer, 0, len));
        }


    }
}

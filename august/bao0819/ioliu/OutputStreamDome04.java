package august.bao0819.ioliu;

import java.io.*;

/**
 * @ClassName OutputStreamDome04
 * @Description 文件字节输出流:写一个字节/数组/数组的一部分
 * @Author CQ
 * @Date 2022/8/19 6:13
 * @Version 1.0
 */
public class OutputStreamDome04 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输出流管道与目标文件接通
        //加ture追加数据
        OutputStream os = new FileOutputStream("august/bao0819/ioliu/data04.txt",true);
        //2.写数据出去，写一个字节出去
        //o.public void write(int a):
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes());//换行
        //os.write('徐');//只写了 徐[ooo] 的第一个字节所以乱码
        //3.写一个数组
        byte[] buffer={'a',97,98,99};
        os.write(buffer);
        os.write("\r\n".getBytes());//换行

        byte[] buffer2="我是中国人".getBytes();
        os.write(buffer2);
        os.write("\r\n".getBytes());//换行

        //4.写字节数组的一部分
        byte[] buffer3={'a',97,98,99};
        os.write(buffer3,0,3);

        os.flush();//写数据必须刷新数据,刷新后流可以继续使用
        os.close();//释放资源，包含刷线。关闭后流不可以使用





    }
}

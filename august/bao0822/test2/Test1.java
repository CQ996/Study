package august.bao0822.test2;

import java.io.*;

/**
 * @ClassName Test1
 * @Description 缓冲流：提高字节流输出输入的效率
 * @Author CQ
 * @Date 2022/8/22 13:11
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        //缓冲流: BufferedWriter , BufferedReader
        //  作用: 提高字符流输出输入的效率.

        //演示:  模拟一个字符输出流操作.
//        File f1 = new File("d:/1.txt");
//        FileWriter fw = new FileWriter( f1 );
        //缓冲流内部维护了这个字符输出流:
//        BufferedWriter bufw = new BufferedWriter( fw );

        //简化写法形式:
        BufferedWriter bufw = new BufferedWriter( new FileWriter( new File("d:/1.txt") ) );

//        String info = "hi,mr.zhao";
//        bufw.write(  info, 0 , info.length() );
//        bufw.newLine();
//        bufw.flush();
//        bufw.close();
//
//
//        //演示:
//        BufferedReader bufr = new BufferedReader( new FileReader(new File("d:/1.txt")) );
//
//        String line = null;
//        while( (line = bufr.readLine()) != null ){
//            System.out.println( line );
//        }
//
//
//        bufr.close();

        //缓冲流: BufferedInputStream , BufferedOutputStream
        //  作用: 提高字节流输出输入的效率.

        File f4=new File("d:/1.png");
        File f5=new File("d:/2.png");
        FileInputStream ips=new FileInputStream(f4);
        BufferedInputStream bufips=new BufferedInputStream(ips);
        FileOutputStream ops=new FileOutputStream(f5);
        BufferedOutputStream buops=new BufferedOutputStream(ops);
        int count=0;
        byte[] bs=new byte[1024];
        while((count=bufips.read(bs))!=-1){
            buops.write(bs,0,count);
            buops.flush();
        }
        bufips.close();
        buops.close();

    }
}

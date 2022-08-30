package august.bao0829.demo01;

import java.io.*;

/**
 * @ClassName ObjectOutputStream_
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 14:52
 * @Version 1.0
 */
public class OOS2 {
    public static void main(String[] args) throws Exception {
        //1.创建java对象
        Student2 xl = new Student2(002, "小丽");
        //2.指定存储位置
        File f2= new File("august/bao0829/demo01/2.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream(f2));
        //4.往序列化流中传输Java对象
        oos2.writeObject(xl);
        oos2.close();
    }
}

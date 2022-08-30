package august.bao0829.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName ObjectOutputStream_
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 14:52
 * @Version 1.0
 */
public class OOS1 {
    public static void main(String[] args) throws Exception {
        //1.创建java对象
        Student1 xm = new Student1(001, "小明");

        //2.指定存储位置
        File f1= new File("august/bao0829/demo01/1.txt");

        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(f1));

        //4.往序列化流中传输Java对象
        oos1.writeObject(xm);
        oos1.close();

    }
}

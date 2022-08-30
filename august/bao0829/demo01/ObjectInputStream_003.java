package august.bao0829.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @ClassName ObjectInputStream_
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 15:04
 * @Version 1.0
 */
public class ObjectInputStream_003 {
    public static void main(String[] args) throws Exception {
        //1.定位读取文件的地址
        File f3= new File("august/bao0829/demo01/4.txt");

        //2.建立字节流
        FileInputStream is = new FileInputStream(f3);

        //3.创建反序列化流对象，字节--->对象
        ObjectInputStream ois = new ObjectInputStream(is);

        Student st = (Student) ois.readObject();
        System.out.println(st);
        ois.close();
    }
}

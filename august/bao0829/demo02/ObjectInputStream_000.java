package august.bao0829.demo02;

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
public class ObjectInputStream_000 {
    public static void main(String[] args) throws Exception {
        //1.定位读取文件的地址
        File f1= new File("src/august/bao0829/demo02/3.txt");
        File f2= new File("src/august/bao0829/demo02/4.txt");
        //2.建立字节流
        FileInputStream is1 = new FileInputStream(f1);
        FileInputStream is2 = new FileInputStream(f2);
        //3.创建反序列化流对象，字节--->对象
        ObjectInputStream ois1 = new ObjectInputStream(is1);
        ObjectInputStream ois2 = new ObjectInputStream(is2);

        Student s1 = (Student) ois1.readObject();
        Student s2 = (Student) ois2.readObject();
        System.out.println(s1);
        System.out.println(s2);
        ois1.close();
        ois2.close();
    }
}

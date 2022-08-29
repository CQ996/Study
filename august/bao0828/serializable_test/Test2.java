package august.bao0828.serializable_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @ClassName Test2
 * @Description
 * @Author CQ
 * @Date 2022/8/29 9:38
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //1.明确读取的文件1.txt
        File f1 = new File("src/august/bao0828/serializable_test/1.txt");

        //2.建立字节流
        FileInputStream is = new FileInputStream(f1);
        //3.创建反序列化流对象，字节--->对象
        ObjectInputStream ois = new ObjectInputStream(is);
        //4.读取读写,调用对象字节输入流的反序列化方法
        Object o = ois.readObject();
        User o1= (User) o;
        //User o2 = (User) ois.readObject();
        System.out.println(o1);
        //5.关闭资源
        ois.close();
    }
}

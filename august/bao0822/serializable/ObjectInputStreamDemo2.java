package august.bao0822.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * @ClassName ObjectInputStreamDemo2
 * @Description 使用反序列化：使用对象数据输入流ObjectOutputStream把文件中的对象恢复到内存的Java中
 * @Author CQ
 * @Date 2022/8/22 13:44
 * @Version 1.0
 */
public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建对象字节输入流管道，包装低级字节输入流管道
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("obj.txt"));
        //2.调用对象字节输入流的反序列化方法
        Student s=(Student) is.readObject();

        System.out.println(s);
    }
}

package august.bao0829.demo03;

import august.bao0829.demo02.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DomTest
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/30 17:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 创建SAXReader实例
        SAXReader reader = new SAXReader();
        // read()读取指定的XML文档并形成DOM树
        Document document = reader.read(new File("src/august/bao0829/demo03/students.xml"));
        // getRootElement()获取根节点
        Element rootEle = document.getRootElement();
        // elements()获取根节点的子节点
        List<Element> studentEls = rootEle.elements();

        //准备集合:
        List list = new ArrayList();
        // 遍历子节点
        for (Element stu1 : studentEls ) {
            String aClass = stu1.attributeValue("Class");
            System.out.println(aClass);
            // element()获取子节点指定的子元素
            Element nameElement = stu1.element("name");
            // getText()获取子元素的文本内容
            String nameText = nameElement.getText();
            // element()获取子节点指定的子元素
            Element idElement = stu1.element("id");
            // getText()获取子元素的文本内容
            int idText = Integer.parseInt(idElement.getText());
            // attributeValue()直接获取元素的属性值
            System.out.println(new Student(idText,nameText));

            //反射实例化对象:
            Class aClass1 = Class.forName(aClass);
            Object o1 = aClass1.newInstance();
            //根据名称定位某个成员变量
            Field f1 = aClass1.getDeclaredField("id");
            Field f2 = aClass1.getDeclaredField("name");
            f1.setAccessible(true);
            f2.setAccessible(true);
            f1.set( o1 ,idText);
            f2.set( o1 ,nameText);
            //存储对象到集合中:
            list.add( o1 );
        }

        //序列化存储:
        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(new File("1.txt")) );
        oos.writeObject( list );
        oos.flush();
        oos.close();

        //反序列化读取:
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream(new File("1.txt")) );
        Object list2 = ois.readObject();
        System.out.println( list2 );
    }
}

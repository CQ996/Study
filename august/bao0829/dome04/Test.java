package august.bao0829.dome04;

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
 * @ClassName Test
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/30 18:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, IOException {
        SAXReader saxReader = new SAXReader();
        Document document= saxReader.read(new File("src/august/bao0829/dome04/students.xml"));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        ArrayList list = new ArrayList();
        for (Element element : elements) {
            //根据属性获取属性值，这里获取到的是对象路径
            String s = element.attributeValue("Class");
            //element()根据子节点名 获取子节点指定的子元素
            Element nameElement = element.element("name");
            // getText()获取子元素的文本内容,这里是小明
            String nameText = nameElement.getText();
            // element()获取子节点指定的子元素
            Element idElement = element.element("id");
            // getText()获取子元素的文本内容,这里是001,由于id是数组，所以强转下类型
            int idInt = Integer.valueOf(idElement.getText());
            //匿名实例化对象并打印对象
            System.out.println(new Student(idInt,nameText)+"=======");
            //反射获取对象类:
            Class aClass = Class.forName(s);
            //将获取到的对象类，通过反射实例化为对象
            Object o = aClass.newInstance();
            //根据属性名定位成员变量
            Field id = aClass.getDeclaredField("id");
            Field name = aClass.getDeclaredField("name");
            //属性.setAccessible(true) 暴力反射
            id.setAccessible(true);
            name.setAccessible(true);
            //给对象的属性赋值：属性.set(对象,属性值)
            id.set(o,idInt);
            name.set(o,nameText);
            //存储对象到集合中
            list.add(o);
        }
        //序列化存储：
        ObjectOutputStream oss= new ObjectOutputStream(new FileOutputStream("src/august/bao0829/dome04/1.txt"));
        //写入
        oss.writeObject(list);
        oss.flush();
        oss.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/august/bao0829/dome04/1.txt"));
        //读取
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}

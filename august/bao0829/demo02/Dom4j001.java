package august.bao0829.demo02;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Dom4j_01
 * @Description 使用Dom4j解析XML文件中的数据:
 * @Author CQ
 * @Date 2022/8/25 18:54
 * @Version 1.0
 */
public class Dom4j001 {
    public static void main(String[] args) throws Exception {
        Student st = null;
                //1.反射，得到类的引用
        Class c=Class.forName("august.bao0829.demo02.Student");

        //创建一个list 来存放xml中解析到的属性
        List stt = new ArrayList();
        String[] array = new String[0];
        SAXReader saxReader = new SAXReader();
        //3.加载XML文件成为文档对象Document对象 getResourceAsStream(带/去src下获取文件)
        Document document =
                saxReader.read(Dom4j001.class.getResourceAsStream("/students.xml"));
        //利用Document类中的方法，获取根节点.返回的是Element
        Element rootElement = document.getRootElement();

        //利用Element中的方法，获取根节点下的全部子节点.返回一个List<element>
        List<Element> elements = rootElement.elements();

        //1.遍历list,获得每个元素
        for (Element element : elements) {
            System.out.println("---------------------------------");
            //遍历并得到每个元素执行属性名称的属性值
            String stuId = element.attributeValue("Class");
            System.out.println("学生类路径为" + stuId);
            //遍历并获得每个元素的全部子节点，返回一个List<element>
            List<Element> subElement = element.elements();

            for (Element subElementData : subElement) {
                //得到每个子节点的名字
                String elementName = subElementData.getName();
                //遍历并获得每个子元素的文本内容,如得到name子节点的文本值为小明
                String stuData = subElementData.getStringValue();
                System.out.println(elementName + "为" + stuData);

                stt.add(stuData);
                System.out.println(stt);

            }
            //集合转数组，方便序列化使用
            int size=stt.size();
            array = (String[])stt.toArray(new String[size]);
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
        //反射进行实例化两个学生对象: 将学号和姓名存储到对象中.最后实现学生信息打印输出.
        //实例化: 先获取带参构造方法,  在执行构造方法创建对象.
        Constructor[] cons = c.getConstructors();
        Constructor con1 = c.getConstructor(int.class, String.class); //con1表示类文件中的带int,String参数的构造方法.
        //序列化对象1
        //1.通过反射实例化对象
        st = (Student)con1.newInstance(Integer.valueOf(array[0]), array[1]);
        //2.指定存储位置
        File f1= new File("src/august/bao0829/demo02/3.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(f1));
        //4.往序列化流中传输Java对象
        oos1.writeObject(st);
        oos1.close();

        //序列化对象2
        //1.通过反射实例化对象
        st = (Student)con1.newInstance(Integer.valueOf(array[2]), array[3]);
        //2.指定存储位置
        File f2= new File("src/august/bao0829/demo02/4.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream(f2));
        //4.往序列化流中传输Java对象
        oos2.writeObject(st);
        oos2.close();






    }
}




package august.bao0829.demo01;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
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
        Class student=Class.forName("august.bao0829.demo01.Student");
        //通过类的引用，得到类的对象
        Object stuInstance = student.newInstance();
        //创建一个list 来放多个student的对象
        List<Student> students = new ArrayList<Student>();
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

        //利用Element中的方法，获取子 节点中的属性（StudentData中的属性为id）
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

                //通过elemetname得到对应的get set方法，先拼接出方法名，比如 name--setName
                //String funName = "set" + (elementName.charAt(0) + "").toUpperCase() + elementName.substring(1);
                stt.add(stuData);
                System.out.println(stt);

            }
            //将每个学生对象添加到list列表中
            //students.add((Student) stuInstance);
            //System.out.println(students);

            //集合转数组，方便序列化使用
            int size=stt.size();
            array = (String[])stt.toArray(new String[size]);
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
            
        }
        //1.创建java对象
        st = new Student(Integer.valueOf(array[0]),array[1]);
        //2.指定存储位置
        File f1= new File("src/august/bao0829/demo01/3.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(f1));
        //4.往序列化流中传输Java对象
        oos1.writeObject(st);
        oos1.close();

        //1.创建java对象
        st = new Student(Integer.valueOf(array[2]),array[3]);
        //2.指定存储位置
        File f2= new File("src/august/bao0829/demo01/4.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream(f2));
        //4.往序列化流中传输Java对象
        oos2.writeObject(st);
        oos2.close();






    }
}




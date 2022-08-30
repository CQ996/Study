package august.bao0829.demo01;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @ClassName ParseXml
 * @Description 将解析students.xml文件中的所有信息并打印输出
 * @Author CQ
 * @Date 2022/8/29 14:05
 * @Version 1.0
 */
public class ParseXml {
    public static void main(String[] args) throws Exception {
        //1.创建解析器工厂对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //2.使用解析器工场对象创建解析器对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        //3.使用解析器对象解析XML文件---->在内存中的dom树对象
        Document dm = db.parse(new File("august/bao0829/demo01/students.xml"));
        //4.分别解析dom对象中的每个节点的元素
        NodeList list = dm.getElementsByTagName("Student");
        //解析学生的每个属性
        for (int i = 0; i < list.getLength(); i++) {
            Node student = list.item(i);
            NamedNodeMap namedNodeMap = student.getAttributes();
            //在NamedNodeMap这个属性Map中，可根据属性名称获取属性对象
            Node id = namedNodeMap.getNamedItem("id");
            //从属性对象中解析属性值
            String nodeValue = id.getNodeValue();
            System.out.println("学生的id为："+nodeValue);
            //筛选出学生的子标签
            int type = student.getNodeType();
            if (type == Node.ELEMENT_NODE) {
                //解析学生标签中的:  姓名、学号。
                NodeList childNodes = student.getChildNodes();
                //System.out.println(childNodes.getLength());
                for (int k = 0; k < childNodes.getLength(); k++) {
                    Node child = childNodes.item(k);
                    //找到姓名、学号标签
                    if (child.getNodeType() == Node.ELEMENT_NODE) {
                        String textContent = child.getTextContent();
                        System.out.println("学生的信息为：" + textContent);
                    }
                }
            }
        }
    }
}

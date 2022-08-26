package august.bao0826.fourth;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


/**
 * @ClassName TextXML
 * @Description XML解析方式一: dom解析方式。注: 原生的方式(jdk自带)，过程比较繁琐。
 * DOM（Document Object Model，文档对象模型）把XML文件映射成一颗倒挂的“树”，以根元素为根节点，每个>节点都以对象形式存在。
 * 通过存取这些对象就能够存取XML文档的内容。
 * DOM解析XML
 * @Author CQ
 * @Date 2022/8/26 9:53
 * @Version 1.0
 */
public class TextXML {
    public static void main(String[] args) throws Exception {
        //1.创建解析器工厂对象
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        //2.使用解析器工场对象创建解析器对象

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //3.使用解析器对象解析XML文件---->在内存中的dom树对象

            Document document= documentBuilder.parse(new File("src/august/bao0826/resource/108_class1.xml"));
            System.out.println(document);
            //4.分别解析dom对象中的每个节点的元素
            NodeList list=document.getElementsByTagName("department");
            //查看返回值NodeList集合中的元素个数
            System.out.println("NodeList集合中的元素个数:"+list.getLength());
            System.out.println("*********************");

        //解析每个部门的编号和名称：都是属性
        for (int i = 0; i < list.getLength(); i++) {
            //department节点为部门标签对象
            Node department = list.item(i);
            //部门标签中的所有属性对象
            NamedNodeMap namedNodeMap = department.getAttributes();
            //在NamedNodeMap这个属性Map中，可根据属性名称获取属性对象
            Node no = namedNodeMap.getNamedItem("no");//{no=1,name="宋江"}
            Node name = namedNodeMap.getNamedItem("name");
            //从属性对象中解析属性值
            String noValue = no.getNodeValue();
            String nameValue = name.getNodeValue();
            System.out.println("部门的编号和名称分别为：" + noValue +" : "+ nameValue);
            System.out.println("--------------------");

            //部门标签中所有子标签employee对象集合
            NodeList employees = department.getChildNodes();//属于：子标签+子空格文本
            System.out.println("部门的子节点的长度为：" + employees.getLength());

            //筛选出：其中的子标签
            for (int j = 0; j < employees.getLength(); j++) {
                Node node = employees.item(j);
                /*
                 * Node.TEXT_NODE 标识文本类型。
                 * Node.ELEMENT_NODE 标识子元素标签类型。
                 * Node.ATTRIBUTE_NODE 标识标签上的属性类型。
                 * */
                int type = node.getNodeType();
                if (type == Node.ELEMENT_NODE) {
                    //表示是子标签. 找到了employee标签。
                    //解析员工标签中的:  姓名、工资。
                    NodeList childNodes = node.getChildNodes();

                    System.out.println(childNodes.getLength());

                    for (int k = 0; k < childNodes.getLength(); k++) {
                        Node child = childNodes.item(k);

                        //找到姓名、工资标签
                        if (child.getNodeType() == Node.ELEMENT_NODE) {
                            String textContent = child.getTextContent();
                            System.out.println("员工的信息为：" + textContent);
                        }
                    }
                }
            }
        }
    }
}

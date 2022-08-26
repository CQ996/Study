package august.bao0826.fourth;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


/**
 * @ClassName TextXML
 * @Description
 * DOM（Document Object Model，文档对象模型）把XML文件映射成一颗倒挂的“树”，以根元素为根节点，每个>节点都以对象形式存在。
 * 通过存取这些对象就能够存取XML文档的内容。
 * DOM解析XML
 * @Author CQ
 * @Date 2022/8/26 9:53
 * @Version 1.0
 */
public class TextXML {
    public static void main(String[] args) {
        //1.创建解析器工厂对象
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        //2.使用解析器工场对象创建解析器对象
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //3.使用解析器对象解析XML文件---->在内存中的dom树对象
            try {
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
                    NamedNodeMap namedNodeMap=department.getAttributes();
                    //在NamedNodeMap这个属性Map中，可根据属性名称获取属性对象
                    Node no=namedNodeMap.getNamedItem("no");
                    Node name=namedNodeMap.getNamedItem("name");
                    //从属性对象中解析属性值
                    String noValue=no.getNodeValue();
                    String nameValue=name.getNodeValue();
                    System.out.println("部门的编号和名称分别为："+noValue+nameValue);
                }
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
                e.printStackTrace();
        }
    }
}

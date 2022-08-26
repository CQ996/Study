package august.bao0826.fourth;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;


/**
 * @ClassName TextXML
 * @Description DOM添加、修改、删除XML数据：
 * 新增一名员工：潘巧云到市场部
 * @Author CQ
 * @Date 2022/8/26 9:53
 * @Version 1.0
 */
public class TextXML1 {
    public static void main(String[] args) throws Exception {
        //1.创建解析器工厂对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        //2.使用解析器工场对象创建解析器对象

        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //3.使用解析器对象解析XML文件---->在内存中的dom树对象

        Document document = documentBuilder.parse(new File("src/august/bao0826/resource/108_class1.xml"));
        //需求：新增一名员工：潘巧云到市场部
        Element employee = document.createElement("employee");
        Element name = document.createElement("name");
        name.setTextContent("潘巧莲");
        Element salary = document.createElement("salary");
        salary.setTextContent("888");
        employee.appendChild(name);
        //appendChild(Node)这个方法一般是在指定元素节点的最后一个子节点之后添加节点(本次代码就是)
        // 但如果Node是页面中的DOM对象，那么就不是添加节点了，就是直接Move节点。 appendChild你可以理解为移动一个元素
        employee.appendChild(salary);
        Node department = document.getElementsByTagName("department").item(0);
        department.appendChild(employee);
        //存储dom对象
        TransformerFactory transformerFactory=TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource=new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("src/august/bao0826/resource/108_class1.xml"));
        transformer.transform(domSource,streamResult);



    }
}

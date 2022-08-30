package august.bao0829.demo03;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/30 17:45
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) throws Exception {

        // dom4j解析方式:  需要提供工具: dom4j-1.6.1.jar.

        //参考书本按照固定的方式解析:
        SAXReader reader = new SAXReader();
        // read()读取指定的XML文档并形成DOM树
        Document document = reader.read(new File("src/august/bao0829/demo03/students.xml"));
        // getRootElement()获取根节点
        Element rootEle = document.getRootElement();

        //跟标签的子节点数: student有两个.
        List<Element> elements = rootEle.elements();

        //解析每个学生对象:
        for(Element e1 : elements){

            //解析元素的1个属性和2个子节点:
            String aClass = e1.attributeValue("Class");
            Element idEl = e1.element("id");
            String idValue = idEl.getText();
            Element tnameEl = e1.element("name");
            String tnameValue = tnameEl.getText();
            System.out.println("查看信息为: " + aClass+" -- " + idValue+"---"+ tnameValue);
        }
    }
}
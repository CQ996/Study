package august.bao0826.dom4j_;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

;import java.io.InputStream;
import java.util.List;


/**
 * @ClassName Dom4j_01
 * @Description 使用Dom4j解析XML文件中的数据:hello_world_schema.xml
 * @Author CQ
 * @Date 2022/8/25 18:54
 * @Version 1.0
 */
public class Dom4j_01 {
    @Test
        public void parseXMLData() throws Exception {
        //1.创建一个Dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader=new SAXReader();
        //2.把XML文件加载到内存中成为一个Document文档对象
        //Document document=saxReader.read(new File("hello_world_schema.xml"));//需要通过模块名定位

        //注意：getResourceAsStream中的/是直接去src下寻找文件
        InputStream is=Dom4j_01.class.getResourceAsStream("/hello_world_schema.xml");
        Document document=saxReader.read(is);
        //3.获取根元素对象
        Element root=document.getRootElement();
        System.out.println(root.getName());
        //获取根元素下的全部子元素
        List<Element> somEles=root.elements();
        for (Element somEle : somEles) {
            System.out.println(somEle);
        }
        //获取某个子元素
        Element sj=root.element("书");
        System.out.println(sj.getName());
        //获取第一个子元素
        Element contact =root.element("书");
        //获取子元素文本
        System.out.println(contact.elementText("书名"));
        //去掉前后空格
        System.out.println(contact.elementTextTrim("书名"));
        //根据元素获取属性值
        Attribute idAttr= (Attribute) contact.attribute("id");
        System.out.println(idAttr.getName()+"--->"+ idAttr.getValue());
        //直接提取属性值
        System.out.println(contact.attributeValue("id"));

        //获取当前元素下的子元素下的对象
        Element zz=contact.element("作者");
        System.out.println(zz.getText());


    }
}

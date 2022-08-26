package august.bao0826.dom4j_;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * @ClassName Dom4j_01
 * @Description 使用Dom4j解析XML文件中的数据:成为一个List集合对象
 * @Author CQ
 * @Date 2022/8/25 18:54
 * @Version 1.0
 */
public class Dom4jTest2 {
    @Test
    public void parseTooList() throws Exception {
        //1.导入框架
        //2.创建SaxReader对象，创建一个Dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //3.加载XML文件成为文档对象Document对象 getResourceAsStream(带/去src下获取文件)
        Document document = saxReader.read(Dom4jTest2.class.getResourceAsStream("/Contact.xml"));
        //4.先拿根元素
        Element root =document.getRootElement();
        //5.提取contact子元素:  取得根节点下的名为 contact 的所有子节点
        List<Element> contactEles = root.elements("Contact");//不填参数会拿到所有子元素
        //6.准备一个ArrayList集合封装联系人信息
        List<Contact> contacts = new ArrayList<>();
        //7.遍历Contact子元素
        for (Element contactEle : contactEles) {
            //8.每个子元素都是一个联系人对象
            Contact contact=new Contact();
            //attributeValue方法，/ 获取元素中属性为id的值
            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGendar(contactEle.elementTextTrim("gender").charAt(0));
            contact.setEmail(contactEle.elementText("email"));
            //9.把联系人对象数据加入到List集合
            contacts.add(contact);
        }
        //10.遍历List集合
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

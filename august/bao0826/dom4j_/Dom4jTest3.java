package august.bao0826.dom4j_;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Dom4j_01
 * @Description 使用Dom4j增加、美化XML文件中的数据
 * @Author CQ
 * @Date 2022/8/25 18:54
 * @Version 1.0
 */
public class Dom4jTest3 {
    @Test
    public void parseTooList() throws Exception {
        //1.导入框架
        //2.创建SaxReader对象，创建一个Dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //3.加载XML文件成为文档对象Document对象 getResourceAsStream(带/去src下获取文件)
        Document document = saxReader.read(Dom4jTest3.class.getResourceAsStream("/Contact2.xml"));
        //4.先拿根元素
        Element root =document.getRootElement();
        //获取第一个子节点
        //Element contact = root.element("Contact");

        //在第一个子节点下添加节点
        //获取 contact 下所有元素
        List<Element> list = root.elements();
        //创建元素使用
        Element ct1= DocumentHelper.createElement("Contact");
        Element name1 = ct1.addElement("name");
        name1.setText("西门庆");

        Element gender1 = ct1.addElement("gender");
        gender1.setText("男");

        Element email1 = ct1.addElement("email");
        email1.setText("ximen@itcast.com");

        ct1.addAttribute("id","4");
        ct1.addAttribute("vip", "true");       //添加属性
        list.add(3,ct1);


        //5.在末尾添加节点
//        Element ct = root.addElement("Contact");
//        Element name = ct.addElement("name");
//        name.setText("西门庆");
//
//        Element gender = ct.addElement("gender");
//        gender.setText("男");
//
//        Element email = ct.addElement("email");
//        email.setText("ximen@itcast.com");
//
//        ct.addAttribute("id","4");
//        ct.addAttribute("vip", "true");       //添加属性

        //6.回写操作
        OutputFormat of=OutputFormat.createCompactFormat();
        of.setEncoding("utf-8");

        //格式美化
        of.setIndentSize(2);//设置缩进
        of.setTrimText(true);  //先移除缩进外的空白部分，
        of.setNewlines(true);  //再换行
        of.setPadText(true);


        OutputStream os = new FileOutputStream(new File("D:\\IdeaProjects\\bdqn\\src\\Contact2.xml"));

        XMLWriter writer = new XMLWriter(os,of);//获得编辑器
        writer.write(document);
        System.out.println("添加成功！");
//        //5.提取contact子元素:  取得根节点下的名为 contact 的所有子节点
//        List<Element> contactEles = root.elements("Contact");//不填参数会拿到所有子元素
//        //6.准备一个ArrayList集合封装联系人信息
//        List<Contact> contacts = new ArrayList<>();
//        //7.遍历Contact子元素
//        for (Element contactEle : contactEles) {
//            //8.每个子元素都是一个联系人对象
//            Contact contact=new Contact();
//            //attributeValue方法，/ 获取元素中属性为id的值
//            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
//            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
//            contact.setName(contactEle.elementTextTrim("name"));
//            contact.setGendar(contactEle.elementTextTrim("gender").charAt(0));
//            contact.setEmail(contactEle.elementText("email"));
//            //9.把联系人对象数据加入到List集合
//            contacts.add(contact);
//        }
//        //10.遍历List集合
//        for (Contact contact : contacts) {
//            System.out.println(contact);
//        }
    }
}

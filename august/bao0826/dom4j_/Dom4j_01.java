package august.bao0826.dom4j_;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

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

    }
}

package august.bao0826.fourth;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;


/**
 * @ClassName TextXML
 * @Description DOM添加、修改、删除XML数据：
 * 修改潘巧云的员工工资为：999
 * @Author CQ
 * @Date 2022/8/26 9:53
 * @Version 1.0
 */
public class TextXML2 {

    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            try {
                Document document = documentBuilder.parse(new File("src/august/bao0826/resource/108_class1.xml"));

                //删除
                Node department3 = document.getElementsByTagName("department").item(2);
                Node emp_XL= department3.getChildNodes().item(1);
                department3.removeChild(emp_XL);
                //需求：修改财务部姓名为潘巧云的员工工资为999
				/*Node department1 = document.getElementsByTagName("department").item(0);
				NodeList nodeListEmployee = department1.getChildNodes();
				Node employee1 = nodeListEmployee.item(1);
				Node employeeSalary1 = employee1.getChildNodes().item(3);
				employeeSalary1.setTextContent("999");*/

				/*//需求：新增一名员工潘巧云到财务部
				Element employee = document.createElement("employee");
				Element name = document.createElement("name");
				name.setTextContent("潘巧云");
				Element salary = document.createElement("salary");
				salary.setTextContent("888");

				employee.appendChild(name);
				employee.appendChild(salary);

				Node department = document.getElementsByTagName("department").item(0);
				department.appendChild(employee);*/

                //存储dom对象
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                try {
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource domSource = new DOMSource(document);
                    StreamResult streamResult = new StreamResult(new File("src/august/bao0826/resource/108_class1.xml"));
                    try {
                        transformer.transform(domSource, streamResult);
                    } catch (TransformerException e) {
                        e.printStackTrace();
                    }
                } catch (TransformerConfigurationException e) {
                    e.printStackTrace();
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
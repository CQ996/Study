package august.bao0823.properties_;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @ClassName PropertiesDemo01
 * @Description 使用Properties把键值对读取属性文件中的键值对信息。（读取）
 * @Author CQ
 * @Date 2022/8/22 16:12
 * @Version 1.0
 */
public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        //需求：使用Properties把键值对读取属性文件中的键值对信息。（读取）
        Properties properties = new Properties();
        System.out.println(properties);

        //加载属性文件中的键值对数据到属性对象properties中去
        properties.load(new FileReader("users.properties"));
        System.out.println(properties);
        String rs=properties.getProperty("cq");
        System.out.println(rs);
        String rs1=properties.getProperty("admin");
        System.out.println(rs1);

    }
}

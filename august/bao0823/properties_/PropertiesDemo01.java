package august.bao0823.properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName PropertiesDemo01
 * @Description 使用Properties把键值对属性存入属性文件中去
 * @Author CQ
 * @Date 2022/8/22 16:12
 * @Version 1.0
 */
public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception {
        //Map map = new Properties();
        //Properties代表是一个属性文件，可以把自己对象中的键值对信息存入到一个属性文件中去
        //需求：使用Properties把键值对属性存入属性文件中去
        Properties properties = new Properties();
        properties.setProperty("admin","123456");
        properties.put("cq","000456");
        properties.put("heima","itsdcj");
        System.out.println(properties);

        /**
         * 参数一：保存管道 字符输出管道
         * 参数二：保存心得
         */
        properties.store(new FileWriter("users.properties"),"this is save xinde");

    }
}

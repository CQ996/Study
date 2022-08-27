package august.bao0827.reflect_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * @ClassName MybatisUtil
 * @Description 通用的框架工具类（static），支持保存所有对象的具体信息
 * @Author CQ
 * @Date 2022/8/27 10:03
 * @Version 1.0
 */
public class MybatisUtil {
    /**
     * 保存任意类型对象
     * @param obj
     */
    public static void save(Object obj) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("src/august/bao0827/reflect_framework/data.txt",
                    true));
            //对象.class()==>类.getClass()
            Class c=obj.getClass();
            //c.getSimpleName()获取简名：也就是获取当前类名
            //c.getName() 获取全限名：包名+类名
            ps.println("=============="+c.getSimpleName()+"==============");
            //获取声明字段：获取全部成员变量
            Field[] fileds = c.getDeclaredFields();
            for (Field filed : fileds) {
                String name = filed.getName();
                //此处获得的变量类型可能并不是字符串，但是由于我们要存储到文件中，所有可以通过拼接空格字符来变为字符串格式，但不能用强转，强转（比如int==>String）会报错
                filed.setAccessible(true);
                String value = filed.get(obj) + "";
                ps.println(name + "=" + value);
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

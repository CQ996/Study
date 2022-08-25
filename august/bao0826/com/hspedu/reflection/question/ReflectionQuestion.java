package august.bao0826.com.hspedu.reflection.question;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @ClassName ReflectionQuestion
 * @Description 反射问题的引入
 * @Author CQ
 * @Date 2022/8/25 15:29
 * @Version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //创建Cat对象并调用发放hi
        //re.properties
        //使用properties类读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/august/bao0826/com/hspedu/reflection/question/re.properties"));
        String classfullpath=properties.get("classfullpath").toString();//"com.hspedu.Cat"
        String methodName = properties.get("method").toString();//"hi"
        System.out.println(classfullpath);
        System.out.println(methodName);

        //使用反射机制
        //1.加载类,返回一个Class类型对象:名曰Class
        Class cls=Class.forName(classfullpath);
        //2.通过对象 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型="+o.getClass());
        //通过cls得到你加载的类 com.hspedu.Cat 的 methodName所代表的"hi" 的方法对象
        //即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //通过method1调用方法：即通过方法对象来实现调用方法
        method1.invoke(o);//传统：对象.方法（），反射机制：方法.invoke(对象)


    }
}

package august.bao0826.com.hspedu.reflection.question;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
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

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi

        //传统方式  new 对象 --> 调用方法
        /*Cat cat = new Cat();
        cat.hi();*/

        //1.使用Properties 类， 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/august/bao0826/com/hspedu/re.properties"));
        String classfullpath = properties.get("classfullpath").toString(); //"com.chapter23.Cat"
        String methodName = properties.get("method").toString();  //"hi"
        //System.out.println("classfullpath:" + classfullpath);
        //System.out.println("method:" + methodName);

        //2.创建对象，传统的方法行不通，---> 反射机制
        //new classfullpath();

        //3.使用反射机制解决
        //(1)加载类 , 返回Class类型的对象
        Class aClass = Class.forName(classfullpath);
        //(2)通过 aclass 得到你加载的类 com.hyj.Cat 的对象实例
        Object o = aClass.newInstance();
        System.out.println("o的运行类型："+o.getClass());  //运行类型
        //(3)通过aClass得到你加载的类 com.chapter23.Cat 的 methodName 的方法对象
        //   即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = aClass.getMethod(methodName);
        //(4)通过method1 调用方法；即通过方法对象来实现调用方法
        System.out.println("==================");
        method1.invoke(o);//传统方法 对象.方法() , 反射机制 方法.invoke(对象)
    }
}


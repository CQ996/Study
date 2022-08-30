package august.bao0829.demo01;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectStudent
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 14:32
 * @Version 1.0
 */
public class ReflectStudent2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String cName = "august/bao0829/demo01/Student2.java";
        ////解析获取未知类型的类文件
        Class c= Student2.class;
        //先获取带参构造方法,  在执行构造方法创建对象.
        Constructor c1 = c.getConstructor(int.class, String.class); //c1表示类文件中的带Integer,String参数的构造方法.
        Object o = c1.newInstance(002, "小丽");

        //解析类文件中任意声明的所有属性.
        Field f1 = c.getDeclaredField("id");
        Field f2 = c.getDeclaredField("name");
        //暴力反射
        f1.setAccessible(true);
        f2.setAccessible(true);
        Object id= f1.get( o );
        Object name = f2.get( o );
        System.out.println("学生对象2的学号为： " + id);
        System.out.println("学生对象2的姓名为： " + name);

    }
}

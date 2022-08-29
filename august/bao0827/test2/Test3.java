package august.bao0827.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 11:49
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        //获取类对象
        Class c = Class.forName("src/august/bao0827/test2/Teacher.java");
        //从类对象获取所有类构造器
        Constructor[] dcs = c.getDeclaredConstructors();
        //从类对象获取带有指定参数的类构造器
        Constructor dc = c.getDeclaredConstructor(String.class,Integer.class);
        //传参
        Object o = dc.newInstance(33,"老王");


    }
}

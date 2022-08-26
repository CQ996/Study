package august.bao0827.reflect_class;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ClassName TestStudent01
 * @Description 反射：获取构造器对象
 * @Author CQ
 * @Date 2022/8/25 17:29
 * @Version 1.0
 */
public class TestStudent02 {
    //1.调用构造器得到一个类的对象返回
    @Test
    public void getDeclaredConstructor() throws Exception {
        //a.第一步：获取类对象
        Class<Student> c = Student.class;

        //b.定位单个构造器对象（按照构造器参数定位无参构造器）
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
        //如果遇到私有的构造器，可以暴力反射:破话封装性
        cons.setAccessible(true);//本次权限打开

        Student s = (Student) cons.newInstance();
        //无参构造器会把对象初始化为默认值，所有输出内容无
        System.out.println(s);

        //c.定位某个有参构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "===>" + cons1.getParameterCount());

        Student s1 = (Student) cons1.newInstance("孙悟空",1000);
        System.out.println(s1);
    }

}

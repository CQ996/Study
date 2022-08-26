package august.bao0827.reflect_class;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ClassName TestStudent01
 * @Description 反射：获取某个构造器
 * @Author CQ
 * @Date 2022/8/25 17:29
 * @Version 1.0
 */
public class TestStudent01 {
    //    @Test
//    public void getConstructor() {
//        //a.第一步：获取类对象
//        Class<Student> c=Student.class;
//        //b.提取类中的全部构造器对象（只能拿public构造器）
//        Constructor[] constructors=c.getConstructors();
//        //c.遍历构造器
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());
//        }
//    }
//    @Test
//    public void getDeclaredConstructor() {
//        //a.第一步：获取类对象
//        Class<Student> c=Student.class;
//        //b.提取类中的全部构造器对象（能拿全部构造器）
//        Constructor[] constructors=c.getDeclaredConstructors();
//        //c.遍历构造器
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor.getName()+"===>"+constructor.getParameterCount());
//        }
//    }
//    @Test
//    public void getConstructor1() throws NoSuchMethodException {
//        //a.第一步：获取类对象
//        Class<Student> c=Student.class;
//        //b.定位单个构造器对象（按照参数定位无参构造器）
//        Constructor cons=c.getConstructor();
//        System.out.println(cons.getName()+"===>"+cons.getParameterCount());
//
//    }
    //获取某个构造器，无论是否私有
    @Test
    public void getDeclaredConstructor() throws Exception {
        //a.第一步：获取类对象
        Class<Student> c = Student.class;
        //b.定位单个构造器对象（按照构造器参数定位无参构造器）
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
        //c.定位某个有参构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "===>" + cons1.getParameterCount());

    }
}

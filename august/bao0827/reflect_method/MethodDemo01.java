package august.bao0827.reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @ClassName MethodDemo01
 * @Description 反射获取方法对象
 * @Author CQ
 * @Date 2022/8/26 18:54
 * @Version 1.0
 */
public class MethodDemo01 {
    //1.获取类中的所有成员方法对象
    @Test
    public void getDeclaredMethods() throws Exception {
        //a.定位Class对象;反射第一步，获取类对象
        Class c = Dog.class;
        //b.取出全部方法（无论私有与否）
        Method[] methods = c.getDeclaredMethods();
        //c.遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName() + "返回值类型：" + method.getReturnType() + "参数数量：" + method.getParameterCount());
        }
    }

    //2.获取类中某个方法对象
    @Test
    public void getDeclaredMethod() throws Exception {
        //a.定位Class对象;反射第一步，获取类对象
        Class c1 = Dog.class;

        //b.提取单个方法对象
        Method m = c1.getDeclaredMethod("eat");
        Method m2 = c1.getDeclaredMethod("eat", String.class);

        m.setAccessible(true);
        m2.setAccessible(true);

        //c.触发方法的执行
        Dog d = new Dog();
        //注意：方法若干是没有结果回来的，返回null
        Object result=m.invoke(d);
        System.out.println(result);

        Object result2=m2.invoke(d,"骨头");
        System.out.println(result2);

    }

}

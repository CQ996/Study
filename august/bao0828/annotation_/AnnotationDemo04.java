package august.bao0828.annotation_;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName AnnotationDemo04
 * @Description 模拟junit框架:只执行标记注解的方法
 * @Author CQ
 * @Date 2022/8/27 12:41
 * @Version 1.0
 */
public class AnnotationDemo04 {
    @MyTest1
    public void test1(){
        System.out.println("==========test1=========");
    }

    public void test2(){
        System.out.println("==========test2=========");
    }

    @MyTest1
    public void test3(){
        System.out.println("==========test3=========");
    }

    /**
     * 启动菜单：有注解的才会被调用
     * @param args
     */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        AnnotationDemo04 a4 = new AnnotationDemo04();
        Class c = AnnotationDemo04.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest1.class)){
                System.out.println(method.getName()+"返回值类型："+method.getReturnType());
                method.invoke(a4);
            }
        }
    }

}

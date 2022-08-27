package august.bao0828.annotation_;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName AnnotationDemo03
 * @Description 注解的解析
 * @Author CQ
 * @Date 2022/8/27 12:41
 * @Version 1.0
 */
public class AnnotationDemo03 {
    //解析类的注解
    @Test
    public void parseClass(){
        //a.先得到类对象
        Class c = BookStore.class;
        //b.判断这个类上面是否存在这个注解
        if(c.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象（获取声明注解）子类特有方法应用子类类型接收
            Bookk book = (Bookk)c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    //解析方法的注解
    @Test
    public void parseMethod() throws Exception {
        //a.先得到类对象
        Class c = BookStore.class;
        //b.得到方法
        Method m = c.getDeclaredMethod("test1");
        //b.判断这个类上面是否存在这个注解
        if(m.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象（获取声明注解）子类特有方法应用子类类型接收
            Bookk book = (Bookk)m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

}

@Bookk(value = "射雕英雄传",price = 99.9,author = {"金庸","古龙"})
class BookStore{
    @Bookk(value = "坏蛋是怎样炼成的",price = 88.8,author = {"六道","古龙"})
    public void test1(){

    }
}
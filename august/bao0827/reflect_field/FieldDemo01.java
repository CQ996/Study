package august.bao0827.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @ClassName FieldDemo01
 * @Description 获取成员变量
 * @Author CQ
 * @Date 2022/8/26 18:25
 * @Version 1.0
 */
public class FieldDemo01 {
    //1.获取全部成员变量
    @Test
    public void getDeclaredFields(){
        //a.定位Class对象
        Class c=Student.class;
        //b.定位全部成员变量
        Field[] files = c.getDeclaredFields();
        //c.遍历一下
        for (Field field : files) {
            System.out.println(field.getName()+"===>"+field.getType());
        }
    }

    //2.获取某个成员变量
    //Field getDeclaredField(String name)
    @Test
    public void getDeclaredField() throws Exception {
        //a.定位Class对象
        Class c=Student.class;
        //b.根据名称定位某个成员变量
        Field f = c.getDeclaredField("age");
        System.out.println(f.getName()+"===>"+f.getType());

    }

}

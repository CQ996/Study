package august.bao0827.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @ClassName FieldDemo01
 * @Description 成员变量的赋值和取值
 * @Author CQ
 * @Date 2022/8/26 18:25
 * @Version 1.0
 */
public class FieldDemo02 {
    //成员变量的赋值和取值
    @Test
    public void setField() throws Exception {
        //a.定位Class对象;反射第一步，获取类对象
        Class c=Student.class;
        //b.根据名称定位某个成员变量
        Field ageF = c.getDeclaredField("age");

        //暴力打开权限
        ageF.setAccessible(true);

        //c.赋值set(Object obj,Object value)
        Student s = new Student();
        //相当于s.setAge(18)
        ageF.set(s,18);
        System.out.println(s);

        //d.取值
        int age = (int) ageF.get(s);
        System.out.println(age);

    }

}

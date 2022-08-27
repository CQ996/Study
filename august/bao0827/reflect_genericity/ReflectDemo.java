package august.bao0827.reflect_genericity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName ReflectDemo
 * @Description 反射的作用：绕过编译阶段为集合添加数据
 * @Author CQ
 * @Date 2022/8/27 8:59
 * @Version 1.0
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception, IllegalAccessException {
        //需求：反射实现泛型擦除后，加入其他类型的元素
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //两个集合对象的地址相同，说明Class文件通用，都是ArrayList.class
        System.out.println(list1.getClass() == list2.getClass());

        System.out.println("----------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(23);
        //list3.add("你好");

        Class c=list3.getClass();//ArrayList.class ==>publice boolean add(E e)
        //定位C类中的add方法
        Method m = c.getDeclaredMethod("add",Object.class);
        //ArrayList arrayList = new ArrayList(); list3已经new过了
        System.out.println(m.invoke(list3,"你好"));
        System.out.println(list3);

        ArrayList list4=list3;//和上面的效果一样
        list4.add("白马4");
        System.out.println("list4:"+list4);
        System.out.println("list3:"+list3);
        ArrayList list5=list2;
        list5.add("白马2");
        System.out.println("list5:"+list5);
        System.out.println("list2:"+list2);

    }
}

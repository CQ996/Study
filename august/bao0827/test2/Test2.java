package august.bao0827.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Test2
 * @Description 反射获取类的属性和方法
 * @Author CQ
 * @Date 2022/8/29 10:38
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //解析获取未知类型的类文件后:
        String cName = "src/august/bao0827/test2/Teacher.java";
        Class c1 = Class.forName(cName); //  c1对象:  即为 Teacher.class.

        //使用类文件对象:

        //1.通过放射方式： 实例化对象.
        //Object o1 = c1.newInstance(); // o1相当于实例化对象:  new Teahcer();

        //其他实例化方式: 先获取带参构造方法,  在执行构造方法创建对象.
        Constructor[] cons = c1.getConstructors(); //cons表示类文件中的所有构造对象数组.
        Constructor con1 = c1.getConstructor(Integer.class, String.class); //con1表示类文件中的带Integer,String参数的构造方法.
        Object o2 = con1.newInstance(6, "laowang");//相当于执行构造:  Teacher t1 = new Teacher( 6 , "laowang" );


        //2.通过放射方式:  使用类文件中的属性.
//        默认解析: 仅支持解析类文件中对外公开的属性.
//        Field[] fs = c1.getFields();
//        Field f1 = c1.getField("tid");

//        解析2: 支持解析类文件中任意声明的所有属性.
        Field[] fs2 = c1.getDeclaredFields();
        Field f2 = c1.getDeclaredField("tid");

//        借助属性的父类: 控制权限开关.
        f2.setAccessible( true );


//        属性的赋值与取值操作:
//        赋值:  属性.set(对象,值);  相当于:  对象.属性名 = 属性值;
        f2.set(o2, 1 );

//        取值:属性值 = f2.get( 对象 ) 相当于:  属性值 = 对象.属性名;
        Object value = f2.get( o2 );

        System.out.println("属性值为； " + value);




        //3.通过放射方式:  使用类文件中的方法.
        //步骤:  3.1: 先解析获取类文件中的方法对象.  3.2:执行获取到的方法.
//        Method[] methods = c1.getMethods();
//        Method m1 = c1.getMethod( "teach" , String.class );

        Method[] declaredMethods = c1.getDeclaredMethods();
        Method m1 = c1.getDeclaredMethod("teach" , String.class);
        Method m2 = c1.getDeclaredMethod("teach");


        //对获取到的方法: 进行权限的开关控制.
        m1.setAccessible(true);
        m2.setAccessible(true);



        //执行方法:  返回值 = m1.invoke(对象 , 参数值列表); 相当于:  返回值 = 对象.方法( 参数 );
        //特殊：如果类中的成员为静态，调用时，传递对象为null即可
        Object result1 = m1.invoke(o2 , "java课" );
        System.out.println("方法的返回值为 ： " + result1);

        m2.invoke(  o2 );


        //特殊形式:  类中的成员为静态. 调用时，传递对象为null即可.


    }
}

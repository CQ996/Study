package august.bao0827.reflect_class;
/**
 * @ClassName Test
 * @Description 反射：获取类对象
 * @Author CQ
 * @Date 2022/8/25 17:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class类的一个静态方法：forName(全限名：包名+类名)
        Class c=Class.forName("august.bao0827.reflect_class.Student");
        System.out.println(c);
        //2.类名.class
        Class c1=Student.class;
        System.out.println(c1);
        //3.对象.getClass()获取对象对应类的Class对象
//        Student s=new Student();
//        Class c2=s.getClass();
//        System.out.println(c2);
    }
}

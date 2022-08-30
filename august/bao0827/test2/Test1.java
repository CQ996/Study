package august.bao0827.test2;


/**
 * @ClassName Test1
 * @Description
 * @Author CQ
 * @Date 2022/8/29 10:20
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        //1.加载类到内存中,在为止情况下获取改类文件

        //反射技术:

        //1.未知类型的情况下,获取该类文件.
        Class c1 = Teacher.class; //情况1： 已知类型的获取方式.

        //Teacher t1 = new Teacher();
        //Class c2 = t1.getClass(); //情况2: 根据对象实例获取所属类型文件.

        String className = "august/bao0827/test2/Teacher.java";
        Class c3 = Class.forName(className);//情况3:推荐使用 根据指定类完整名称解析类文件.

        //System.out.println(c1+" - " + c2+" - " + c3);

    }
}

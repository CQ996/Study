package august.bao0816.treeSet;


import java.util.*;

/**
 * @ClassName Test1
 * @Description TreeSet方式二: 通过TreeMap的构造方法：传入一个自定义比较器.实现每个存储元素的顺序比较.
 * @Author CQ
 * @Date 2022/8/16 9:40
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //TreeSet:支持元素的顺序排列(切记: 如果设计自定义类型元素,需要提供比较器.)
        //方式二: 通过TreeMap的构造方法：传入一个自定义比较器.实现每个存储元素的顺序比较.
        //自定义比较器对象:
        MyComp myComp = new MyComp();
        TreeSet set1 = new TreeSet(myComp);
        Student2 s1 =new Student2();
        s1.height=170;
        Student2 s2 =new Student2();
        s2.height=171;
        Student2 s3 =new Student2();
        s3.height=162;
        Student2 s4 =new Student2();
        s4.height=170;
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Student2 next =  (Student2)it.next();
            System.out.println("集合中的身高为："+next.height);
        }

    }
}
//模拟同学
class Student2{
    //模拟比较的属性参数：
    int height;

}
//自定义比较器
class MyComp implements Comparator{

    //比较功能
    @Override
    public int compare(Object o1, Object o2) {
        Student2 s1 = (Student2) o1;
        Student2 s2 = (Student2) o2;
        int result = s1.height - s2.height;
        return result;
    }
}

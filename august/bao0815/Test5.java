package august.bao0815;

import java.util.*;

/**
 * @ClassName Test4
 * @Description TreeSet演示介绍
 * @Author CQ
 * @Date 2022/8/15 16:59
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        //TreeSet接口：  子类TreeSet特点：默认有序（自然排序），唯一，其实就是TreeMap

        //本身基于TreeMap存储结构：黑红树（树状存储结构）
        TreeSet set1 = new TreeSet();
        //只有相同数据类型的数据才可以进行比对顺序，排列，小左大右，相等就替换（比较规则）
//        set1.add(3);
//        set1.add(5);
//        set1.add(1);
//        set1.add(2);
//        set1.add(4);
//        set1.add(4);
        //set1.add("小明");//类型转换异常

        //切记：自定义类型默认不具备比较功能
        //解决：1.让Studen类型实现Compable接口即可，
        //     2.TreeSet的构造方法传入：一个自定义比较器也行
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Object obj =  it.next();
            System.out.println(obj);
        }
        System.out.println(set1);
    }
}

package august.bao0816;


import java.util.*;

/**
 * @ClassName Test1
 * @Description TreeSet:将Student类型实现Comparable接口,具备比较能力.
 * @Author CQ
 * @Date 2022/8/16 9:40
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //TreeSet:支持元素的顺序排列（切记，如果设计自定义类型元素）
        //方式一: 将Student类型实现Comparable接口,具备比较能力.
        TreeSet set1 = new TreeSet();
        Student s1 =new Student();
        s1.height=170;
        Student s2 =new Student();
        s2.height=171;
        Student s3 =new Student();
        s3.height=162;
        Student s4 =new Student();
        s4.height=170;
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Student next =  (Student)it.next();
            System.out.println("集合中的身高为："+next.height);
        }

    }
}
class Student implements Comparable{
    //模拟比较的属性参数：
    int height;

    //扩展比较能力：模拟使用：A.compareTo(B)
    @Override
    public int compareTo(Object o) {
        //当前调用者对象(this) 和 参数(o)之间的比较
        Student s1 = this;
        Student s2 = (Student)o;
        int result = s1.height - s2.height;
        return result ;
    }
}

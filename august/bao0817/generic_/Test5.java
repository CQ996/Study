package august.bao0817.generic_;
import java.util.*;
/**
 * @ClassName Test5
 * @Description 练习测试: TreeSet集合有一个addAll()演示他的泛型限定效果.
 * @Author CQ
 * @Date 2022/8/17 17:18
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        //练习测试: TreeSet集合有一个addAll()演示他的泛型限定效果.
        //addAll(Collection<? extends E> c)
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(4);
        ts2.add(5);
        ts2.add(6);
        Q<TreeSet> ts1 = new Q();
        ts1.num=ts2;
        Iterator s1 = ts1.num.iterator();
        while (s1.hasNext()) {
            Object next =  s1.next();
            System.out.println(next);
        }

    }
}
class Q<E>{
    E num;
}
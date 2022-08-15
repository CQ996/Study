package august.bao0811.set;

import java.util.*;

/**
 * @ClassName SetMethod
 * @Description Set接口常用方法
 * @Author CQ
 * @Date 2022/8/15 8:52
 * @Version 1.0
 */
public class SetMethod {
    public static void main(String[] args) {
        //1.以Set接口电脑实现类 HashSet 来讲解 Set 接口方法
        //2.Set接口的实现类的对象（Set接口对象），不能存放重复的元素，可以添加一个null
        //3.Set接口对象存放数据都是无序的（即添加的顺序和取出的顺序不一致）
        //4.注意：取出的顺序是固定的，虽然不是添加的顺序，但是它是固定的
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("mary");
        set.add(null);//
        set.add(null);//再次添加空
        for (int i = 0; i < 10; i++) {
            System.out.println(set);
        }

        //删除
        set.remove(null);
        //遍历
        //方式1：迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        //方式2：增强for
        System.out.println("==使用增强for==");
        for (Object o :set) {
            System.out.println(o);
        }
        //Set 接口对象，不能通过索引来获取

    }
}

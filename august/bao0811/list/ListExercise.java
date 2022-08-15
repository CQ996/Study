package august.bao0811.list;

import java.util.*;

/**
 * @ClassName ListExercise
 * @Description List练习
 * @Author CQ
 * @Date 2022/8/12 9:23
 * @Version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new Vector();
        for (int i = 0; i < 12; i++) {
            list.add("Hello"+i);
        }
        System.out.println(list);
        //2号位插入新元素
        list.add(1,"程大吊");
        System.out.println(list);
        //获取第5个元素
        System.out.println(list.get(4));
        //删除第6个元素
        list.remove(5);
        System.out.println(list);
        //修改第7个元素
        list.set(6,"三国杀");
        System.out.println(list);
        //迭代器遍历
        Iterator jh = list.iterator();
        while (jh.hasNext()) {
            Object next =  jh.next();
            System.out.println(next);
        }
    }
}

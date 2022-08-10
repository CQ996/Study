package august.bao0811;

import java.util.*;

/**
 * @ClassName CollectionMethod
 * @Description ArrayList演示
 * @Author cheng
 * @Date 2022/8/10 23:22
 * @Version 1.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
//      add:添加单个元素
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println("list=" + list);
//      remove:删除指定元素
        //list.remove(0);//删除第一个元素
        list.remove("jack");//指定删除某个元素
        System.out.println("list=" + list);
//      contains:查找元素是否存在

    }
}
